package by.array.ex4.main;

//Написать программу опрделяющую сумму n-значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме.

import java.util.Scanner;

public class Zadacha16 {
	public static void main(String[] args) {

		int n;
		int sumNumber;
		int numberEvenDigitSum;

		n = enter("Enter the number of digit ");

		sumNumber = sumOddNumber(n);

		numberEvenDigitSum = numberEvenDigitSum(sumNumber);

		print(n, sumNumber, numberEvenDigitSum);

	}

	public static int enter(String str) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("%s", str);
			while (!sc.hasNextInt()) {
				System.out.printf("It is not integer. %s", str);
				sc.next();
			}

			n = sc.nextInt();
		} while (n < 1);

		return n;
	}

	public static int sumOddNumber(int n) {

		int start;
		int finish;
		int sumOddNumber = 0;

		start = (int) (Math.pow(10, n - 1));
		finish = (int) (Math.pow(10, n));

		for (int i = start; i < finish; i++) {
			int[] temp;
			temp = arrayDigit(i);

			int allOddDigit;
			allOddDigit = allOddDigit(temp);

			if (allOddDigit == 0) {
				sumOddNumber = sumOddNumber + i;
			}

		}

		return sumOddNumber;
	}

	public static int[] arrayDigit(int number) {

		int[] arrayDigit;
		String temp;
		char[] arrayChar;

		temp = String.valueOf(number);

		arrayChar = temp.toCharArray();

		arrayDigit = new int[arrayChar.length];

		for (int i = 0; i < arrayChar.length; i++) {
			arrayDigit[i] = Character.digit(arrayChar[i], 10);
		}

		return arrayDigit;

	}

	public static int allOddDigit(int[] arrayDigit) {

		int allOddDigit = 0;

		for (int i = 0; i < arrayDigit.length; i++) {

			int temp = arrayDigit[i] % 2;
			if (temp == 0) {
				allOddDigit++;
			}
		}

		return allOddDigit;

	}

	public static int numberEvenDigitSum(int sumNumber) {

		int numberEvenDigitSum;
		int[] temp;

		temp = arrayDigit(sumNumber);

		numberEvenDigitSum = allOddDigit(temp);

		return numberEvenDigitSum;
	}

	public static void print(int n, int sumNumber, int numberEvenDigitSum) {

		System.out.println("The number of digit in a number = " + n);
		System.out.println("Sum number with odd digit = " + sumNumber);
		System.out.println("The number of even digit in the sum of number = " + numberEvenDigitSum);
	}

}
