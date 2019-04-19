import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("hello");
		int i = 5;
		while(i <= 15) {
			System.out.println(i);
			i++;
		}
		
		int guess = 0;
	do {
		System.out.println("Guess the number");
		guess = scanner.nextInt();
	} while(5 != guess);
	System.out.println("Good Guess!!");
	
	
	String[] pets = {"Diesel", "Cat", "Fraulein"};
	int index = 0;
	while(index < pets.length) {
		System.out.println(pets[index]);
		index++;
	}
	
	int t = 2;
	while(t <= 8) {
		System.out.print(t + ", ");
		t += 2;
	}
	System.out.println("Who do we appreciate");
	
	for (int m = 2; m <= 8; m += 2 ) {
		System.out.print(m + ", ");
	}
	System.out.print("Who do we appreciate too");
	System.out.println();
	
	for(int x = 1; x <= 10; x++) {
		for (int y = 1; y <= 10; y++) {
			System.out.printf("%4d", x * y);
		}
		System.out.println();
	}
}
	
	
}