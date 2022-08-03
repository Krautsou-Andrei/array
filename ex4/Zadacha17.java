package by.array.ex4.main;

//Из задвнного числа вычли сумму его цифр. Из результата вновь вычли сумму цифр
//Сколько таких действий надо произвести, чтобы получился нуль?

import java.util.Scanner;

public class Zadacha17 {
	public static void main(String[] args) {

		int number;
		int numberIteration;

		number = enter("Enter the number ");

		numberIteration = numberIteration(number);

		print(number, numberIteration);

	}

	public static int enter(String str) {

		int number;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("%s", str);
			while (!sc.hasNextInt()) {
				System.out.printf("It is not integer. %s", str);
				sc.next();
			}

			number = sc.nextInt();
		} while (number < 1);

		return number;
	}

	public static int[] arrayDigit(int number) {

		String temp;
		char[] arrayChar;
		int[] arrayDigit;

		temp = String.valueOf(number);

		arrayChar = temp.toCharArray();

		arrayDigit = new int[arrayChar.length];

		for (int i = 0; i < arrayChar.length; i++) {
			arrayDigit[i] = Character.digit(arrayChar[i], 10);
		}

		return arrayDigit;

	}

	public static int sumDigit(int number) {

		int sumDigit = 0;
		int[] arrayDigit;

		arrayDigit = arrayDigit(number);

		for (int i = 0; i < arrayDigit.length; i++) {
			sumDigit += arrayDigit[i];
		}

		return sumDigit;

	}

	public static int numberIteration(int number) {

		int numberIteration = 0;
		int sumDigit;
		int numberDifference;

		sumDigit = sumDigit(number);

		do {

			numberDifference = number - sumDigit;

			number = numberDifference;
			
			numberIteration++;
			
			sumDigit = sumDigit(numberDifference);

		} while (numberDifference != 0);

		return numberIteration;
	}

	public static void print(int number, int numberIteration) {

		System.out.println("The number = " + number);
		System.out.println("number of iteration = " + numberIteration);
	}

}
