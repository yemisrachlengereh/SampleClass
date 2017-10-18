package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {




	Scanner keyboard=new Scanner(System.in);

	Person newPerson=new Person();


	System.out.print("enter persons first name:");
	newPerson.setFirstName(keyboard.nextLine());
	System.out.println("you entered"+newPerson.getFirstName()+" as the person's first name");


	System.out.print("enter persons last name:");
	newPerson.setLastName(keyboard.nextLine());
	System.out.println("you entered"+newPerson.getLastName()+" as the person's last name");

	System.out.print("enter persons address:");
	newPerson.setAdress(keyboard.nextLine());
	System.out.println("you entered"+newPerson.getAdress()+" as the person address");

	System.out.print("enter persons phone number:");
	newPerson.setPhoneNumber(keyboard.nextLine());
	System.out.println("you entered"+newPerson.getPhoneNumber()+" as the person address");

	System.out.print("enter persons address:");
	newPerson.setEmail(keyboard.nextLine());
	System.out.println("you entered"+newPerson.getEmail()+" as the person email");

//	for(String firstName:arrayList){
//		System.out.print(firstName);
	//}
	}
}
