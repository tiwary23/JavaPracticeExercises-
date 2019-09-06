package palindrome;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args, Object Scanner) {
		
		long number, number1 = 0,temp,sum=0, num;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number");

		number = obj.nextLong();
		temp = number;
		while (temp != 0) {
			number1 *= 10;
			number1 += temp % 10;
			num=temp%10;
			temp /= 10;
			
			if(num%2==0) {
				sum+=num;
			}
			
		}
		if(number1==number) {
			if(sum>25) {
				
				System.out.println(number+" is palindrome and the sum of even numbers is greater than 25");
			}
			else {
				System.out.println(number+" is palindrome and the sum of even numbers is less than 25");
			}
		}
		else {
			System.out.println(number+" is not palindrome.");
		}
		
	}

}
