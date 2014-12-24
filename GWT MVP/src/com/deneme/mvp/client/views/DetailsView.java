package com.deneme.mvp.client.views;

import com.deneme.mvp.client.presenters.DetailsPresenter;
import com.deneme.mvp.shared.Person;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class DetailsView extends Composite implements DetailsPresenter.Display {

	private static DetailsViewUiBinder uiBinder = GWT
			.create(DetailsViewUiBinder.class);

	private DetailsPresenter presenter;
	
	interface DetailsViewUiBinder extends UiBinder<Widget, DetailsView> {
	}

	public DetailsView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setPresenter(DetailsPresenter presenter) 
	{
		this.presenter = presenter;
	}

	@UiField TextBox nameTextBox;
	@UiField TextBox lastNameTextBox;
	@UiField TextBox phoneTextBox;
	@UiField TextBox eMailTextBox;
	@UiField TextBox addressTextBox;
	@UiField Button exitButton;
	
	@Override
	public void fillDetails(Person person) 
	{
		nameTextBox.setText(person.getFirstName());
		lastNameTextBox.setText(person.getLastName());
		phoneTextBox.setText(person.getPhoneNumber());
		eMailTextBox.setText(person.geteMailAddress());
		addressTextBox.setText(person.getAddress());
	}

	@Override
	public HasClickHandlers getExitButton() {
		// TODO Auto-generated method stub
		return exitButton;
	}
}
