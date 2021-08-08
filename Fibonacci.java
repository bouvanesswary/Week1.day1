package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in
		// the series)
		int range = 8, firstnum = 0, secnum = 1, sum;
// Print first number
		System.out.println(firstnum);

		// Iterate from 1 to the range
		for (int i = 1; i <= range; i++) {

			// add first and second number assign to sum
			sum = firstnum + secnum;

			// Assign second number to the first number
			firstnum = secnum;

			// Assign sum to the second number
			secnum = sum;

			// print sum
			System.out.println("Fibonnaci " + sum);

		}
	}
}
