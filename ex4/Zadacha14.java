package by.array.ex4.main;

import java.util.ArrayList;
import java.util.Scanner;

//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1  до  K.

public class Zadacha14 {
	public static void main(String[] args) {

		int k;
		ArrayList<Integer> arrayArmstrong;

		k = enter("Enter natural number, k = ");

		arrayArmstrong = arrayArmstrong(k);

		print(k, arrayArmstrong);

	}

	public static int enter(String s) {

		int k = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.printf("%s", s);
			while (!sc.hasNextInt()) {
				System.out.printf("It is not natural number. %s", s);
				sc.next();

			}

			k = sc.nextInt();

		} while (k < 1);

		return k;
	}

	public static ArrayList<Integer> arrayArmstrong(int k) {

		int[] arrayDigit;
		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 1; i < k; i++) {
			arrayDigit = digitalOfNumber(i);
			int sum = 0;
			for (int j = 0; j < arrayDigit.length; j++) {
				sum = sum + (int) (Math.pow(arrayDigit[j], arrayDigit.length));

			}

			if (sum == i) {
				arrayList.add(i);
			}
		}

		return arrayList;
	}

	public static int[] digitalOfNumber(int n) {

		int[] array;
		char[] arrayChar;
		String temp;

		temp = String.valueOf(n);

		arrayChar = new char[temp.length()];

		arrayChar = temp.toCharArray();

		array = new int[arrayChar.length];

		for (int i = 0; i < array.length; i++) {
			array[i] = Character.digit(arrayChar[i], 10);
		}

		return array;
	}

	public static void print(int k, ArrayList<Integer> arrayArmstrong) {

		System.out.printf("Renge from 1 to %d ", k);
		System.out.println("Armstrong numbers");
		System.out.println(arrayArmstrong);

	}
}
