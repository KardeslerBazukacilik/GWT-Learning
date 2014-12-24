package com.deneme.mvp.client.presenters;

import com.deneme.mvp.client.events.ButtonPressedEvent;
import com.deneme.mvp.shared.Person;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class PersonPresenter implements Presenter
{
	SimpleEventBus eventBus;
	Person[] people;
	Display view;
	
	public interface Display
	{
		public void initGrid();
		public void clear();
		public void setPeople(Person[] people);
		public Widget asWidget();
		public void setPresenter(PersonPresenter presenter);
		public HasClickHandlers getButton1();
		public HasClickHandlers getButton2();
		public HasClickHandlers getButton3();
		public HasClickHandlers getButton4();
	}
	
	public PersonPresenter(Person[] people, Display view, SimpleEventBus eventBus) 
	{
		this.people = people;
		this.view = view;
		this.eventBus = eventBus;
		
		bind();
	}
	
	@Override
	public void bind() 
	{
		view.setPresenter(this);
		view.clear();
		view.setPeople(people);
		//view.initGrid();
		view.getButton1().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ButtonPressedEvent(people[0]));
			}
			
		});
		
		view.getButton2().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ButtonPressedEvent(people[1]));
			}
			
		});
		
		view.getButton3().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ButtonPressedEvent(people[2]));
			}
			
		});
		
		view.getButton4().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new ButtonPressedEvent(people[3]));
			}
			
		});
	}

	@Override
	public void go(final HasWidgets container)
	{
		container.clear();
		container.add(view.asWidget());
	}

}
