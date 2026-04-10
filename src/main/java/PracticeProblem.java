/**
 * File: Do While loops
 * Author: Mikah Ho
 * Date Created: Apr 10, 2026
 * Date Last Modified: Apr 10, 2026
 */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
	}

	public static void q1() {
		//Write question 1 code here

		Scanner input = new Scanner(System.in);

		int num;

		do {

			System.out.print("Input a positive integer: ");
			num = input.nextInt();

		} while (num < 0);

		System.out.println(num * 2);
	}

	public static void q2() {
		//Write question 2 code here

		Scanner input = new Scanner(System.in);

		String password;
		String confirmPassword;

		do {

			System.out.print("Input a password: ");
			password = input.nextLine();

			System.out.print("Confirm the password: ");
			confirmPassword = input.nextLine();

		} while (!password.equals(confirmPassword));

		System.out.println("success.");
	}

	public static void q3() {
		//Write question 3 code here
		
		Scanner input = new Scanner(System.in);

		int num1;
		int num2;

		do {

			System.out.print("Input an integer: ");
			num1 = input.nextInt();

			System.out.print("Input an integer that is a multiple of the first integer: ");
			num2 = input.nextInt();

		} while (num2 % num1 != 0);

		System.out.println("success.");
	}
}
