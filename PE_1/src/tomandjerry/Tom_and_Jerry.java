package tomandjerry;

import java.util.Scanner;

public class Tom_and_Jerry {
	public static void main(String[] args) {

		int num;

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = obj.nextInt();

		if ((num < 30) && (num > 20)) {
			if (num % 2 == 0) {
				System.out.println("Tom");
			} else {
				System.out.println("Jerry");
			}
		} else {

			System.out.println("Enter the number between 20 t0 30");
		}

	}

}
