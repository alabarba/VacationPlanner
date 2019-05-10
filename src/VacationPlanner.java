
import java.util.Scanner;
public class VacationPlanner {
	
	public static void main (String[] args) {
		greeting();
		timeBudget();
		/*timeDifference();
		countryArea();
		howFar(); */
	}

	public static void greeting() {
		System.out.print("Welcome to vacation planner! \nWhat is your name? ");
		Scanner input = new Scanner (System.in);
		String name = input.nextLine();
		System.out.print("Nice to meet you " + name + ", where are you travelling to? " );
		input = new Scanner (System.in);
		String destination = input.nextLine();
		System.out.println("Great! " + destination + " sounds like a great trip");
		System.out.println("******************************************");
	}
	public static void timeBudget(){
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
		System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes");
		System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + moneyPerDay + " USD");
		System.out.println("Your total budget in " + currency + " is " + budget + " " + currency + ", which per day is " + budgetPerDay + " " + currency); 
		// There is still the problem that moneyPerDay and budgetPerDay per day are visualized with more than 2 decimal digits after the separator. 
		System.out.println("******************************************");
		
		
	}
}
