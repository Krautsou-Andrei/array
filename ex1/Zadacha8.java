package by.array.ex1.main;

//Дана последовательность целых чисел a1, a2,.., an. Образовать новую последовательность, выбросив из нее те 
// члены, которые равны min (a1, a2, .., an)

import java.util.Scanner;

public class Zadacha8 {
	public static void main(String[] args) {

		int[] a;
		int n;
		int sum = 0;
		int[] b;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number of array. n = ");

		while (!sc.hasNextInt()) {
			System.out.printf("It is not integer. Enter n = ");
			sc.next();
		}

		n = sc.nextInt();

		a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10);
			System.out.printf("%d |", a[i]);

		}

		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != min) {
				sum++;
			}
		}

		b = new int[sum];

		sum = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != min) {
				b[sum] = a[i];
				sum++;
			}

		}

		System.out.println();

		System.out.println("Min = " + min);

		System.out.println();
		System.out.println("New array");

		for (int i : b) {
			System.out.printf("%d |", i);
		}
	}

}
