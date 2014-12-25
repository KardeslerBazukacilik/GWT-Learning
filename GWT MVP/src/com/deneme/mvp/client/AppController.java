package com.deneme.mvp.client;

import com.deneme.mvp.client.events.ButtonPressedEvent;
import com.deneme.mvp.client.events.ButtonPressedEventHandler;
import com.deneme.mvp.client.events.ExitButtonPressedEvent;
import com.deneme.mvp.client.events.ExitButtonPressedEventHandler;
import com.deneme.mvp.client.presenters.DetailsPresenter;
import com.deneme.mvp.client.presenters.PersonPresenter;
import com.deneme.mvp.client.presenters.Presenter;
import com.deneme.mvp.client.views.DetailsView;
import com.deneme.mvp.client.views.PersonView;
import com.deneme.mvp.shared.Person;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.RootPanel;

public class AppController implements Presenter 
{
	private final SimpleEventBus eventBus;
	private HasWidgets container;
	
	/*EFE SEZERRRR*/
	/* Tolga's Comment */
	
	//erkan deneme
	//Burak YILDIRIM
	//Cihan ULUS
	//Bu da mi comment degilssss
	
	public AppController(SimpleEventBus eventBus)
	{
		this.eventBus = eventBus;
		bind();
	}
	
	@Override
	public void bind() 
	{
		eventBus.addHandler(ButtonPressedEvent.TYPE, new ButtonPressedEventHandler()
		{
			@Override
			public void onClick(ButtonPressedEvent event, Person person)
			{
				onButtonPressed(person);
			}
		});
		
		eventBus.addHandler(ExitButtonPressedEvent.TYPE, new ExitButtonPressedEventHandler()
		{
			@Override
			public void onClick(ExitButtonPressedEvent event)
			{
				onExitButtonPressed();
			}
		});
	}

	@Override
	public void go(final HasWidgets container) {
		
		this.container = container;
		openFirstScreen();
	}
	
	private void openFirstScreen()
	{
		Person[] people = new Person[4];
		people[0] = Person.person1;
		people[1] = Person.person2;
		people[2] = Person.person3;
		people[3] = Person.person4;
		Presenter presenter = new PersonPresenter(people, new PersonView(), eventBus);
		presenter.go(RootPanel.get());
	}
	
	private void onButtonPressed(Person person)
	{
		Presenter presenter = new DetailsPresenter(person, new DetailsView(), eventBus);
		presenter.go(RootPanel.get());
	}
	
	private void onExitButtonPressed()
	{
		openFirstScreen();
	}
	
	
	// abowwww...

}


