package com.deneme.mvp.client.presenters;

import com.deneme.mvp.client.events.ExitButtonPressedEvent;
import com.deneme.mvp.shared.Person;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class DetailsPresenter implements Presenter {

	private Person person;
	private Display view;
	private SimpleEventBus eventBus;
	
	public interface Display
	{
		public void fillDetails(Person person);
		public Widget asWidget();
		public void setPresenter(DetailsPresenter presenter);
		public HasClickHandlers getExitButton();
	}
	
	public DetailsPresenter(Person person, Display view, SimpleEventBus eventBus)
	{
		this.person = person;
		this.view = view;
		this.eventBus = eventBus;
		
		bind();
	}
	
	@Override
	public void bind() {
		view.setPresenter(this);
		view.fillDetails(person);

		view.getExitButton().addClickHandler(new ClickHandler()
		{

			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				eventBus.fireEvent(new ExitButtonPressedEvent());
			}
			
		});
	}

	@Override
	public void go(final HasWidgets container) {
		container.clear();
		container.add(view.asWidget());

	}

}
