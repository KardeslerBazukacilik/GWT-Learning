package com.deneme.mvp.client.events;

import com.deneme.mvp.shared.Person;
import com.google.gwt.event.shared.GwtEvent;
public class ButtonPressedEvent extends GwtEvent<ButtonPressedEventHandler>
{
	public static Type<ButtonPressedEventHandler> TYPE = new Type<ButtonPressedEventHandler>();
	
	private Person person;
	
	public ButtonPressedEvent(Person person)
	{
		this.person = person;
	}
	
	@Override
	public Type<ButtonPressedEventHandler> getAssociatedType() 
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ButtonPressedEventHandler handler) 
	{
		handler.onClick(this, person);
		
	}
	
}
