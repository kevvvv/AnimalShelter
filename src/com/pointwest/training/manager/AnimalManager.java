package com.pointwest.training.manager;

import java.util.ArrayList;
import java.util.List;

import com.pointwest.training.beans.Animal;
import com.pointwest.training.beans.Cat;
import com.pointwest.training.beans.Dog;
import com.pointwest.training.beans.Parrot;

public class AnimalManager {
	
	List<Animal> animalList = new ArrayList<Animal>();
	
	public void addAnimal(String option,String name,String age,String gender)
	{
		switch(option)
		{
			case "1":
				addCat(name, age, gender);
				break;
			case "2":
				addDog(name, age, gender);
				break;
			case "3":
				addParrot(name, age, gender);
				break;
		}
	}
	
	public void addDog(String name,String age,String gender)
	{
		Dog dog = new Dog();
		dog.setName(name);
		dog.setAge(age);
		dog.setGender(gender);
		
		animalList.add(dog);
	}
	
	public void addCat(String name,String age,String gender)
	{
		Cat cat = new Cat();
		cat.setName(name);
		cat.setAge(age);
		cat.setGender(gender);
		
		animalList.add(cat);
	}
	
	public void addParrot(String name,String age,String gender)
	{
		Parrot parrot = new Parrot();
		parrot.setName(name);
		parrot.setAge(age);
		parrot.setGender(gender);
		
		animalList.add(parrot);
				
	}
	
	public int getListSize()
	{
		int listSize = animalList.size();
		return listSize;
	}
	
	public boolean isEmptyList()
	{
		boolean isEmpty = false;
		if(animalList.isEmpty())
		{
			isEmpty = true;
		}
		return isEmpty;				
	}
	
	public boolean isRemoved(int animalId)
	{
		boolean isRemoved = false;
		for(Animal animal: animalList)
		{
			int uniqueId = animal.getUniqueId();
			if(uniqueId == animalId)
			{
				animalList.remove(animalList.indexOf(animal));
				isRemoved = true;
				break;
			}		
		}
		return isRemoved;	
	}
	
	public void displayList()
	{
		if(!animalList.isEmpty())
		{
			for(Animal animal: animalList)
			{
				animal.doGreet();
			}
		}
		else
		{
			System.out.println("Animal House is empty");
		}
	}
	
	
	
	
	
	
}
