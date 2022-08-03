package by.array.ex4.main;

//Написать метод (методы) нахождения наибольшего общего делителя четырех начуральных чисел

import java.util.Scanner;
import java.util.Arrays;

public class Zadacha2 {
	public static void main(String[] args) {

		int NOD;
		int[] a;
		int n;

		n = Enter("Enter the number of array elements");
		a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10 + 1);
		}

		NOD = NODManyNumber(a);
		System.out.println(Arrays.toString(a));
		System.out.println("NOD = " + NOD);
		// System.out.println(n);

	}

	public static int Enter(String s) {
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s  ", s);
		while (!sc.hasNextInt()) {
			System.out.printf("It is not an integer. %s ", s);
			sc.next();
		}

		n = sc.nextInt();

		return n;

	}

	public static int NODManyNumber(int[] a) {
		int NODManyNumber;
		int temp;

		temp = NOD(a[0], a[1]);

		if (a.length > 2) {

			for (int i = 2; i < a.length; i++) {
				temp = NOD(temp, a[i]);
			}
		}

		NODManyNumber = temp;

		return NODManyNumber;

	}

	public static int NOD(int a, int b) {

		int NOD = 0;

		if (a > b) {

			int temp;
			NOD = b;

			do {
				temp = a % NOD;

				if (temp != 0) {
					a = NOD;
					NOD = temp;
				}

			} while (temp != 0);
		} else {
			int temp;
			NOD = a;

			do {
				temp = b % NOD;

				if (temp != 0) {
					b = NOD;
					NOD = temp;
				}
			} while (temp != 0);
		}

		return NOD;
	}

}
