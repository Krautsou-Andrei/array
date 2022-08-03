package by.array.ex4.main;

// Дано натуральное число N. написать метод (методы ) для формирования массива, елементами которого
// будут цифры числа N

import java.util.Scanner;
import java.util.Arrays;

public class Zadacha10 {
	public static void main(String[] args) {

		int N;
		int[] array;

		N = validation("Enter natural number");

		array = arrayOfDigits(N);

		print(array, N);

	}

	public static int enter(String s) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s ", s);
		while (!sc.hasNextInt()) {
			System.out.printf("It is not integer. %s ", s);
			sc.next();
		}

		n = sc.nextInt();

		return n;
	}

	public static int validation(String s) {

		int n;
		int sum = 0;

		do {

			if (sum == 0) {
				n = enter(s);
				sum = sum + 1;
			} else {
				n = enter("It is not a natural number. Enter natural number");
			}

		} while (n < 0);
		
		return n;
	}

	public static int[] arrayOfDigits(int n) {

		int[] array;
		char[] arrayChar;
		String temp;

		temp = String.valueOf(n);
		arrayChar = new char[temp.length()];
		arrayChar = temp.toCharArray();
		array = new int[arrayChar.length];

		for (int i = 0; i < arrayChar.length; i++) {
			array[i] = Character.digit(arrayChar[i], 10);
		}

		return array;

	}

	public static void print(int[] array, int n) {

		System.out.println(" Given number " + n);
		System.out.println(" Array of elements of this number " + Arrays.toString(array));

	}

}
