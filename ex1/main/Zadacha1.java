package by.array.ex1.main;

//В массив a[n] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному k.

import java.util.Scanner;

public class Zadacha1 {
	public static void main(String[] args) {
		int[] a;
		int n;
		int k;
		int sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements n =");
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();

		a = new int[n];

		System.out.print("Enter a multiple k = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, k = ");
			sc.next();
		}

		k = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10 + 1);
			System.out.printf("%d | ", a[i]);

			if (k % a[i] == 0) {

				sum = sum + a[i];
			}

		}
		System.out.println();
		System.out.printf("The sum of numbers is a multiple of a number k %d = %d", k, sum);

	}

}
