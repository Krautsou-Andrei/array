package by.array.ex4.main;

//Написать метод (методы), опредялющий, в каком из данных двух чисел больше цифр

import java.util.Scanner;

public class Zadacha11 {
	public static void main(String[] args) {

		int numberFirst;
		int numberSecond;
		int digitInNumberFirst;
		int digitInNumberSecond;
		int compare;

		numberFirst = enter("Enter the first number. A = ");
		numberSecond = enter("Enter the second number. B = ");

		digitInNumberFirst = digitInNumber(numberFirst);
		digitInNumberSecond = digitInNumber(numberSecond);

		compare = compare(digitInNumberFirst, digitInNumberSecond);

		print(numberFirst, numberSecond, compare, digitInNumberFirst, digitInNumberSecond);

	}

	public static int enter(String str) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s ", str);
		while (!sc.hasNextInt()) {
			System.out.printf("It is not integer. %s ", str);
			sc.next();
		}

		n = sc.nextInt();

		return n;
	}

	public static int digitInNumber(int n) {

		String temp = String.valueOf(n);

		n = temp.length();

		return n;

	}

	public static int compare(int a, int b) {

		if (a > b) {
			return a;
		}
		if (a < b) {
			return b;
		} else {
			return a + b;
		}

	}

	public static void print(int first, int second, int compare, int a, int b) {

		if (compare == a + b) {
			System.out.println("Numbers have the same number of digits" );
		}
		if (compare == a) {
			System.out.println("There are more numbers in this number. A = " + first);
		}
		if (compare == b) {
			System.out.println("There are more numbers in this number. B = " + second);

		}
	}
}
