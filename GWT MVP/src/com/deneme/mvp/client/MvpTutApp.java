package com.deneme.mvp.client;

import com.deneme.mvp.client.events.ButtonPressedEvent;
import com.deneme.mvp.client.events.ButtonPressedEventHandler;
import com.deneme.mvp.client.presenters.DetailsPresenter;
import com.deneme.mvp.client.presenters.PersonPresenter;
import com.deneme.mvp.client.presenters.PersonPresenter.Display;
import com.deneme.mvp.client.presenters.Presenter;
import com.deneme.mvp.client.views.DetailsView;
import com.deneme.mvp.client.views.PersonView;
import com.deneme.mvp.shared.Person;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.RootPanel;

public class MvpTutApp implements EntryPoint {
	
	@Override
	public void onModuleLoad() 
	{
		SimpleEventBus eventBus = new SimpleEventBus();
		AppController appController = new AppController(eventBus);
		appController.go(RootPanel.get());
	}
	
	

}
