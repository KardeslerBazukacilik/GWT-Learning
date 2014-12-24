package com.deneme.mvp.client.events;

import com.deneme.mvp.shared.Person;
import com.google.gwt.event.shared.EventHandler;

public interface ButtonPressedEventHandler extends EventHandler
{
	public void onClick(ButtonPressedEvent event, Person person);
}
