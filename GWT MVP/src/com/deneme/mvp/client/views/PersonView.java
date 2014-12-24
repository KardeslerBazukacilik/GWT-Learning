package com.deneme.mvp.client.views;

import com.deneme.mvp.client.presenters.PersonPresenter;
import com.deneme.mvp.shared.Person;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

public class PersonView extends Composite implements PersonPresenter.Display
{

	private static PersonViewUiBinder uiBinder = GWT
			.create(PersonViewUiBinder.class);
	
	private PersonPresenter presenter;
	
	interface PersonViewUiBinder extends UiBinder<Widget, PersonView> 
	{
		
	}

	public PersonView() 
	{
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField Grid dataGrid;
	@UiField Button button1;
	@UiField Button button2;
	@UiField Button button3;
	@UiField Button button4;
	
	@Override
	public void initGrid()
	{		
		dataGrid.resize(4, 4);
		for(int x = 0; x < 4; x++)
			for(int y = 0; y < 4; y++)
			{
				dataGrid.setWidget(y, x, new Label("Ahanda"));
			}
	}
	
	@Override
	public void clear() 
	{
	
	}
	
	@Override
	public void setPeople(Person[] people) 
	{
		for (int i = 0; i < people.length; i++) 
		{
			((Label)dataGrid.getWidget(i+1, 1)).setText(people[i].getFirstName());
			((Label)dataGrid.getWidget(i+1, 2)).setText(people[i].getLastName());
			((Label)dataGrid.getWidget(i+1, 3)).setText(people[i].getPhoneNumber());
		}
	}
	
	@Override
	public void setPresenter(PersonPresenter presenter) 
	{
		this.presenter = presenter;
	}

	@Override
	public HasClickHandlers getButton1()
	{
		return button1;
	}

	@Override
	public HasClickHandlers getButton2() 
	{
		return button2;
	}

	@Override
	public HasClickHandlers getButton3() 
	{
		return button3;
	}

	@Override
	public HasClickHandlers getButton4() 
	{
		return button4;
	}
	
	
}
