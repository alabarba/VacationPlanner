

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.math.*;
import java.text.*;


public class VacationPlanner {
	
	public static void main (String[] args) {
		greeting();
		timeBudget();
		timeDifference();
		countryArea();
		
	}

	public static void greeting() {
		System.out.print("Welcome to vacation planner! \nWhat is your name? ");
		Scanner input = new Scanner (System.in);
		String name = input.nextLine();
		System.out.print("Nice to meet you " + name + ", where are you travelling to? " );
		input = new Scanner (System.in);
		String destination = input.nextLine();
		System.out.println("Great! " + destination + " sounds like a great trip");
		System.out.println("******************************************\n");
	}
	public static void timeBudget(){
		DecimalFormat decimalformat = new DecimalFormat("#.##");
		decimalformat.setRoundingMode(RoundingMode.CEILING);
		System.out.print("How many days are you going to spend travelling? ");
		Scanner input= new Scanner (System.in);
		int days = input.nextInt();
		int hours=days*24;
		int minutes=hours *60;
		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
		input= new Scanner (System.in);
		double money = input.nextDouble();
		double moneyPerDay= money/days;
		System.out.print("What is the three letter currency symbol for your travel destination? ");
		input= new Scanner (System.in);
		String currency = input.next();
		System.out.print("How many " + currency + " are there in 1 USD? ");
		input= new Scanner (System.in);
		double exchange = (double)input.nextDouble(); //There is still the problem that if the user while entering the double value instead of , as separator for the decimal part an exception is raised
		double budget=money * exchange;
		double budgetPerDay=moneyPerDay * exchange;
		System.out.println();
		System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes");
		System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + decimalformat.format(moneyPerDay) + " USD");
		System.out.println("Your total budget in " + currency + " is " + budget + " " + currency + ", which per day is " + decimalformat.format(budgetPerDay) + " " + currency);
		System.out.println("******************************************\n");
	}
	public static void timeDifference(){
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("H:mm");
		System.out.print("What is the time difference, in hours, between your home and your destination? ");
		Scanner input = new Scanner(System.in);
		long timeDiff=input.nextInt();
		LocalTime midnight=LocalTime.MIDNIGHT;
		LocalTime destinationTime=midnight.plusHours(timeDiff);
		System.out.println("That means that when it is midnight at home it will be " + destinationTime.format(timeFormat) + " in your travel destination" );
		System.out.println("******************************************\n");
	}                                                                    

    public static void countryArea(){
    	DecimalFormat decimalformat = new DecimalFormat("#.#");
    	decimalformat.setRoundingMode(RoundingMode.CEILING);
    	System.out.println("What is the square area of your destination country in KM2?");
    	Scanner input = new Scanner(System.in);
    	double squareArea=input.nextDouble();
    	double squareAreaMiles= squareArea/2.59;
    	System.out.println("In miles that is " + decimalformat.format(squareAreaMiles));
        System.out.println("******************************************"); 
    }
}                 
