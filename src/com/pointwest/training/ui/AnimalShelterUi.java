package com.pointwest.training.ui;

import java.util.Scanner;

import com.pointwest.training.manager.AnimalManager;

public class AnimalShelterUi {
	
	public static final String welcomeMessage = "Welcome to Kevin's Animal Shelter!";
	public static final String addAnimalOption = "Add an Animal";
	public static final String removeAnimalOption = "Remove an Animal";
	public static final String viewAllAnimalOption = "View all Animals";
	
	Scanner scanner = new Scanner(System.in);

	AnimalManager manager = new AnimalManager();
	
	public String displayHomePage()
	{
		System.out.println();
		System.out.println(welcomeMessage);
		System.out.println("Please select an option: ");
		if(manager.isEmptyList())
		{
			System.out.println("The shelter is currently empty");
			System.out.println("[1] "+addAnimalOption);
		}
		else
		{
			System.out.println("[1] "+addAnimalOption);
			System.out.println("[2] "+removeAnimalOption);
			System.out.println("[3] "+viewAllAnimalOption);
		}
		String mainMenuOption = scanner.nextLine();
		return mainMenuOption;
	}
	
	
	public String displayFullNotification()
	{
		System.out.println(welcomeMessage);
		System.out.println("Please select an option: ");
		System.out.println("[2] "+removeAnimalOption);
		System.out.println("[3] "+viewAllAnimalOption);
		String mainMenuOption = scanner.nextLine();
		return mainMenuOption;
	}
	
	public void displayAddAnimalPage()
	{
		System.out.println("What Animal are you trying to add?");
		System.out.println("[1] A Cat ");
		System.out.println("[2] A Dog ");
		System.out.println("[3] A Parrot ");
		
		String animalOption = scanner.nextLine();
		
		System.out.println("Input name: ");
		String name = scanner.nextLine();
		System.out.println("Input age: ");
		String age = scanner.nextLine();
		System.out.println("Input gender: ");
		String gender = scanner.nextLine();
		
		manager.addAnimal(animalOption, name, age, gender);
		System.out.println(name + " has been added to the animal shelter!");
	}
	
	public boolean displayRemoveAnimalPage()
	{
		System.out.println("Please enter the reference ID of the animal to remove: ");		
		int refId = scanner.nextInt();
		boolean isRemoved = false;
		if(manager.isRemoved(refId))
		{
			System.out.println("Animal ID : " + refId + " has been successfuly removed from Animal Shelter!");
			isRemoved = true;
		}
		else
		{
			System.out.println("Animal ID not found!");
			isRemoved = false;
		}
		return isRemoved;
	}
	
	
	
	public void displayViewAnimalPage()
	{
		System.out.println("Meet our lovely animal friends!");
		manager.displayList();
	}
	
	

}
