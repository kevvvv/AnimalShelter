package com.pointwest.training.main;

import java.util.Scanner;

import com.pointwest.training.ui.AnimalShelterUi;



public class AnimalShelterMain {

	public final static int maxAnimalCount = 10;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		AnimalShelterUi animalUi = new AnimalShelterUi();
				
		int animalCount = 0;
		boolean isContinue = true;
		do
		{
			String mainOption;
			if(animalCount == maxAnimalCount)
			{
				mainOption = animalUi.displayFullNotification();
			}
			else
			{
				mainOption = animalUi.displayHomePage();
			}
			switch(mainOption)
			{
				case "1":
					animalUi.displayAddAnimalPage();
					animalCount++;
					break;
				case "2":
					if(animalUi.displayRemoveAnimalPage())
					{
						animalCount--;
					}
					break;
				case "3":
					animalUi.displayViewAnimalPage();
					break;
			}
			if(animalCount == maxAnimalCount)
			{
				System.out.println("The shelter is currently full. We can no longer be able to accept a new animal.");
				System.out.println("Do you want to continue? [1] Yes [2] No");
				String option = scanner.nextLine();
				
				switch(option)
				{
					case "1":
						isContinue = true;
						break;
					case "2":
						isContinue = false;
						break;
				}
				
			}

		}
		while(isContinue);
		
	}

}
