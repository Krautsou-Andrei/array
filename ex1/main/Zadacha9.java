package by.array.ex1.main;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. 
//Если таких чисел несколько, то определить найменьшее их них.

import java.util.Scanner;

public class Zadacha9 {
	public static void main(String[] args) {

		int[] a;
		int[] b;
		int[] c;
		int n;
		int repeat = 0;
		int value = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements n = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();

		a = new int[n];
		b = new int[n];// массив для количества подсчета повторов числа в массиве a.

		System.out.println("Array of integeres");

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10);
			System.out.printf("%d | ", a[i]);
		}

		System.out.println();
		System.out.println("Number of repetitions of a number in an array");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					repeat++;
				}
				b[i] = repeat;
			}
			repeat = 0;
			System.out.printf("%d | ", b[i]);
		}

		System.out.println();

		int max = b[0];

		for (int i = 0; i < b.length; i++) {
			if (max < b[i]) {
				max = b[i];

			}
		}

		for (int i = 0; i < b.length; i++) {
			if (max == b[i]) {
				value++;
			}
		}

		c = new int[value];

		int temp = 0;

		for (int i = 0; i < b.length; i++) {
			if (max == b[i]) {
				c[temp] = a[i];
				temp++;

			}
		}

		int min = c[0];

		for (int i = 0; i < c.length; i++) {
			if (min > c[i]) {
				min = c[i];
			}

		}

		System.out.println("Commonly encountered minimum number = " + min);

	}
}
