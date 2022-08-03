package by.array.ex1.main;

//Даны действительные числа a1, a2, .. aN. Поменять местами наибольший и наименьший элемент

import java.util.Scanner;

public class Zadacha4 {
	public static void main(String[] args) {

		double[] a;
		int n;

		int indexMin = 0;
		int indexMax = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements, n = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n =");
			sc.next();
		}

		n = sc.nextInt();

		a = new double[n];

		double min = a[0];
		double max = a[0];

		for (int i = 0; i < a.length; i++) {
			a[i] = (Math.random() * 1000 - 500);
			System.out.printf("%,.2f | ", a[i]);

			if (a[i] > max) {
				max = a[i];
				indexMax = i;
			}

			if (a[i] < min) {
				min = a[i];
				indexMin = i;
			}

		}

		a[indexMin] = max;
		a[indexMax] = min;

		System.out.println();
		System.out.println("New array");

		for (int i = 0; i < a.length; i++) {

			System.out.printf("%,.2f | ", a[i]);

		}

		System.out.println();
		System.out.printf("Minimum = %,.2f \nMaximum = %,.2f ", min, max);
	}

}
