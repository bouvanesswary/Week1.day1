package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare your input
		int arm=153;
	// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)

				int cal = 0,reminder,original;
								// Assign input into variable original 
				original=arm;
								// Use loop to calculate: use while loop to set condition until the number greater than 0

				while(arm>0)
				{
					
					// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
					reminder=arm%10;
					System.out.println(reminder);	
				
					// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
					arm=arm/10;	
					// Within loop: Add calculated with the cube of remainder & assign it to calculated

					cal=cal+reminder*reminder*reminder;
					
				
					
				}
				if(cal==original) 
					System.out.println("Armstrong");
				else
					System.out.println("Not Armstrong");
				}
					// Check whether calculated and original are same

			

					//When it matches print it as Armstrong number


			}



		

	


