package com.deneme.mvp.shared;

public class Person 
{
	
	public static final Person person1 = new Person("1", "11", "111", "1111", "11111");
	public static final Person person2 = new Person("2", "22", "222", "2222", "22222");
	public static final Person person3 = new Person("3", "33", "333", "3333", "33333");
	public static final Person person4 = new Person("4", "44", "444", "4444", "44444");
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String eMailAddress;
	private String address;
	
	public Person()
	{
		this("Tolga", "KACAR");
	}
	
	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Person(String firstName, String lastName, String phoneNumber, String eMailAddress, String address)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.eMailAddress = eMailAddress;
		this.address = address;
	}
	
	public String getFullName()
	{
		return firstName + " " + lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public String geteMailAddress() 
	{
		return eMailAddress;
	}

	public void seteMailAddress(String eMailAddress) 
	{
		this.eMailAddress = eMailAddress;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}
}
