package data;

import java.util.Scanner;

public class Calc1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Would you like to Add, Subtract, Divide, Multiply?,SquareRoot");

		String mathType = scan.next();

		if (mathType.equalsIgnoreCase("add")) {
			System.out.println("Whats the first number you want to add?");

			int firstNumber = scan.nextInt();

			try {
				System.out.println(firstNumber + " + ");
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Enter your second number");

			int secondNumber = scan.nextInt();

			System.out.println(firstNumber + " + " + secondNumber + " =");
			try {
				System.out.println(firstNumber + secondNumber);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (mathType.equalsIgnoreCase("subtract")) {
			System.out.println("Whats the first number you want to subtract?");

			int firstNumber = scan.nextInt();

			System.out.println(firstNumber + " - ");
			System.out.println("Enter your second number");

			int secondNumber = scan.nextInt();

			System.out.println(firstNumber + " - " + secondNumber + " =");
			try {
				System.out.println(firstNumber - secondNumber);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (mathType.equalsIgnoreCase("divide")) {
			System.out.println("Whats the first number you want to divide?");

			int firstNumber = scan.nextInt();

			System.out.println(firstNumber + " % ");
			System.out.println("Enter your second number");

			int secondNumber = scan.nextInt();

			System.out.println(firstNumber + " % " + secondNumber + " =");
			try {
				System.out.println(firstNumber / secondNumber);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (mathType.equalsIgnoreCase("multiply")) {
			System.out.println("Whats the first number you want to multiply?");

			int firstNumber = scan.nextInt();

			System.out.println(firstNumber + " x ");
			System.out.println("Enter your second number");

			int secondNumber = scan.nextInt();

			System.out.println(firstNumber + " x " + secondNumber + " =");
			try {
				System.out.println(firstNumber * secondNumber);
			} catch (Exception e) {
		
				e.printStackTrace();
			}
		} else if (mathType.equalsIgnoreCase("squareRoot")) {
			System.out.print("number is: ");
			Double num;
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter a number: ");
			num = sc.nextDouble();

			try {
				Double square = num * num;
				System.out.println("Square of " + num + " is: " + square);
			} catch (Exception e) {
				e.printStackTrace();
			}
			sc.close();
		}

	}
}
