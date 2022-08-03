package by.array.ex1.main;

//Даны целые числа a1, a2, .. aN. Вывести на печать только те числа, для которых a[i] > i

import java.util.Scanner;

public class Zadacha5 {
	public static void main(String[] args) {

		int[] a;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements n = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer number, n = ");
			sc.next();
		}

		n = sc.nextInt();

		a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10 - 5);

			System.out.printf("%d | ", a[i]);

		}

		System.out.println();
		System.out.println("New array");

		for (int i = 0; i < a.length; i++) {
			if (a[i] > i) {
				System.out.printf("%d | ", a[i]);
			}
		}

	}

}
