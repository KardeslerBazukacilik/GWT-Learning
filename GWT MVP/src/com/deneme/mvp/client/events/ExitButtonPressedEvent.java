package com.deneme.mvp.client.events;

import com.google.gwt.event.shared.GwtEvent;
public class ExitButtonPressedEvent extends GwtEvent<ExitButtonPressedEventHandler>
{
	public static Type<ExitButtonPressedEventHandler> TYPE = new Type<ExitButtonPressedEventHandler>();
	
	@Override
	public Type<ExitButtonPressedEventHandler> getAssociatedType() 
	{
		return TYPE;
	}

	@Override
	protected void dispatch(ExitButtonPressedEventHandler handler) 
	{
		handler.onClick(this);
		
	}
	
}
