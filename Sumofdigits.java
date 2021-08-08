package week1.day1;

public class While {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// Declare your input number (int)
		int number = 345;

				// Initialize an integer variable by name: sum
		int sum=0, m;

				// Use loop to calculate the sum: use while loop to set condition until the number goes greater than 0
		while(number>0)
		{

				// Within loop: get the remainder when done by 10 -> Tip: use mod %

					// Print the remainder to confirm
			m=number%10;
			System.out.println(m);
					// Within loop: add that remainder to the sum
			
					// Print the sum to confirm
			sum=sum+m;
			System.out.println(sum);
					// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
			
					// Print the quotient to confirm
			number=number/10;
			System.out.println(number);
				
				// Outside the loop: print the final sum
		
					}
		
		System.out.println("sum of digits:" +number);
	
	}
}
