package by.array.ex2.main;

//Отсортировать строки матрицы по возрастанию и убыванию значения элементов

import java.util.Scanner;

public class Zadacha12 {
	public static void main(String[] args) {

		int[][] a;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size, n = ");

		while (!sc.hasNextInt()) {
			sc.next();
		}

		n = sc.nextInt();

		a = new int[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 10);
				System.out.printf("%2d |", a[i][j]);
			}

			System.out.println();
		}

		System.out.println("Sort matrix line in ascending order");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int value = a[i][j];
				int temp = j - 1;

				for (; temp >= 0; temp--) {
					if (value < a[i][temp]) {
						a[i][temp + 1] = a[i][temp];
					} else {
						break;
					}
				}

				a[i][temp + 1] = value;
			}

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%2d |", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("Sort matrix line in descending order");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int value = a[i][j];
				int temp = j - 1;

				for (; temp >= 0; temp--) {
					if (value > a[i][temp]) {
						a[i][temp + 1] = a[i][temp];
					} else {
						break;
					}
				}

				a[i][temp + 1] = value;
			}

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%2d |", a[i][j]);
			}
			System.out.println();
		}
	}

}
