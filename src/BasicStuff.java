import java.util.Scanner;

public class BasicStuff {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int userInput = scanner.nextInt();


		
		
		System.out.println("You Entered: " + userInput);
		int squared = userInput * userInput;
		int cubed = userInput * userInput * userInput;
		
		System.out.println("number  |  squared  |  cubed" );
		System.out.println("-------------------------------");
		System.out.println("   " + userInput + "    |    " + squared + "     |  " + cubed);
	}
}
