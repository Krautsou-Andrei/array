package by.array.ex4.main;

//Даны два натуральные числа K и N. Написать метод (методы) формирования массива А,
//элементами которого являются числа, сумма цифр которых равна K  и которые не больше N.

import java.util.Scanner;
import java.util.ArrayList;

public class Zadacha12 {
	public static void main(String[] args) {

		int k;
		int n;
		ArrayList<Integer> arrayNumber;

		k = varification("Enter natural number, k = ");
		n = varification("Enter natural number, n = ");
		arrayNumber = new ArrayList<>();

		arrayNumber = array(n, k);

		print(k, n, arrayNumber);

	}

	public static int enter(String s) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf(" %s ", s);
		while (!sc.hasNextInt()) {
			System.out.printf("It is not integer. %s", s);
			sc.next();
		}

		n = sc.nextInt();

		return n;
	}

	public static int varification(String s) {

		int n;
		int sum = 0;

		do {
			if (sum == 0) {
				n = enter(s);
				sum = sum + 1;
			} else {
				n = enter("This is not a natural number. Enter natural number");
			}
		} while (n < 0);

		return n;
	}

	public static int sumDigit(int n) {

		int sumDigit = 0;
		String temp;
		char[] array;

		temp = String.valueOf(n);
		array = new char[temp.length()];
		array = temp.toCharArray();

		for (int i = 0; i < array.length; i++) {
			sumDigit = sumDigit + Character.digit(array[i], 10);
		}

		return sumDigit;
	}

	public static ArrayList<Integer> array(int n, int k) {

		ArrayList<Integer> array = new ArrayList<>();
		int temp;

		for (int i = 0; i < n; i++) {
			temp = sumDigit(i);
			if (temp == k) {
				array.add(i);
			}
		}

		return array;
	}

	public static void print(int k, int n, ArrayList<Integer> array) {

		System.out.println("Sum digit = " + k);
		System.out.println("Number no more N = " + n);
		System.out.println("Array number");
		System.out.println(array);
	}

}
