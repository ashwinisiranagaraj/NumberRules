package number.rules.examples;

import numbers.resources.PatternConstatnts;

public class NumberDivisionRules {

	public NumberDivisionRules() {
	}

	public void getNumbersDivisibleBy(int a, int n) {
		System.out.println("\n\n Numbers Divisable by " + a + ":");
		for (int i = 0; i <= n; i++) {
			/*if (i % a == 0 && a == 3)
				System.out.print(+i + " " + PatternConstatnts.NUMBER_DIVISABLEBY_THREE + ", ");
			if (i % a == 0 && a == 5)
				System.out.print(+i + " " + PatternConstatnts.NUMBER_DIVISABLEBY_FIVE + ", ");*/
			System.out.print(+i + " Inside loop ");
		}

	}

	public void getNumbersDivisibleBy(int a, int b, int n) {
		System.out.println("\n\n Numbers Divisable by " + a + " and " + b + ":");
		/*for (int i = 0; i <= n; i++) {
			if (i % a == 0 && i % b == 0)
				System.out.print(+i + " " + PatternConstatnts.NUMBER_DIVISABLEBY_THREEANDFIVE + ", ");
		}
*/
	}

	/* Future rules can be added here */
}
