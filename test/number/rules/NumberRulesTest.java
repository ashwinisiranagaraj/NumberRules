package number.rules;

import org.junit.Test;

import number.rules.examples.NumberDivisionRules;

public class NumberRulesTest {
	NumberDivisionRules numberRules = new NumberDivisionRules();

	@Test
	public void testNumberForThree() {
		int n = 1000;
		numberRules.getNumbersDivisibleBy(3, n);

	}

	@Test
	public void testNumberForFive() {
		int n = 1000;
		numberRules.getNumbersDivisibleBy(5, n);

	}

	@Test
	public void testNumberForThreeAndFive() {
		int n = 1000;
		numberRules.getNumbersDivisibleBy(3, 5, n);

	}
}
