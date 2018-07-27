package number.rules.examples;


import java.util.Scanner;

public class Numbers {
	public static Scanner scanner = new Scanner(System.in);
	public static int n = 5;
	public static NumberDivisionRules number = new NumberDivisionRules();

	public static void main(String[] args) {
	//	readInput();
		number.getNumbersDivisibleBy(3, n);
		number.getNumbersDivisibleBy(5, n);
		number.getNumbersDivisibleBy(3, 5, n);
		System.out.println("\n");
	}

/*	public static void readInput() {
		System.out.print("Enter number of children: " + "\n");
		n = scanner.nextInt();
	}*/
}
