package by.array.ex4.main;

//напишите метод (методы), проверяющие, являются ли данные три числа взаимно простыми

import java.util.Scanner;
import java.util.Arrays;

public class Zadacha6 {
	public static void main(String[] args) {

		int[] primeNumbers;
		int n;
		int NOD;

		n = enter("Enter the number of array elements ");

		primeNumbers = array(n);

		System.out.println(Arrays.toString(primeNumbers));

		NOD = NODManyNumbers(primeNumbers);

		if (NOD == 1) {
			System.out.println("These numbers are coprime, NOD = " + NOD);
		}
		if (NOD > 1) {
			System.out.println("these numbers are not coprime, NOD = " + NOD);
		}
		if (NOD == 0) {
			System.out.println("One of the numbers is zero");
		}

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

	public static int[] array(int n) {
		int[] array;

		array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20 - 10);
		}

		return array;
	}

	public static int NODManyNumbers(int[] array) {
		int NODManyNumbers;

		NODManyNumbers = NOD(array[0], array[1]);

		if (array.length > 2) {
			for (int i = 2; i < array.length; i++) {
				NODManyNumbers = NOD(NODManyNumbers, array[i]);
			}
		}

		return NODManyNumbers;

	}

	public static int NOD(int a, int b) {
		int NOD = 0;

		if (Math.abs(a) >= Math.abs(b) && a != 0 && b != 0) {

			int temp;
			NOD = Math.abs(b);

			do {
				temp = Math.abs(a) % NOD;

				if (temp != 0) {
					a = NOD;
					NOD = temp;

				}
			} while (temp != 0);

		}

		if (Math.abs(a) < Math.abs(b) && a != 0 && b != 0) {

			int temp;
			NOD = Math.abs(a);

			do {
				temp = Math.abs(b) % NOD;

				if (temp != 0) {
					b = NOD;
					NOD = temp;
				}
			} while (temp != 0);
		}
		return NOD;
	}

}
