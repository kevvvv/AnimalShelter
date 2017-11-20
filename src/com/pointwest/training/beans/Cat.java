package com.pointwest.training.beans;

public class Cat extends Animal{
	
	private String name;
	private String age;
	private String gender;
	private String animalType = "Cat";
	private int uniqueId;
	
	public Cat()
	{
		animalCounter++;
		int newId = animalCounter;
		this.uniqueId = newId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public void doGreet()
	{
		System.out.println("["+uniqueId+"]" + ": meow meow meow.. Hi I'm "+ name + " the "+animalType + ", "+ age + " yrs old." );
	}





}
