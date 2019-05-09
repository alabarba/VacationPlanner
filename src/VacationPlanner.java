
import java.util.Scanner;
public class VacationPlanner {
	
	public static void main (String[] args) {
		greeting();
		/*time&budget();
		timeDifference();
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
		System.out.print("Great! " + destination + " sounds like a great trip");
	}
}
