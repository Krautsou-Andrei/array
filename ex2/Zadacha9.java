package by.array.ex2.main;

//Задана матрица неотрицательных чисел. Подсчитать сумму элементов в каждом столбце.
//Определить какой столбец содержит максимальную сумму.

import java.util.Scanner;

public class Zadacha9 {
	public static void main(String[] args) {
		int[][] a;
		int n;
		int[] column;
		int sum = 0;
		int maxSumColumn = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size, n = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer");
			sc.next();
		}

		n = sc.nextInt();

		a = new int[n][n];

		column = new int[n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 10);
				System.out.printf("% 2d |", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("Sum of columns");

		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i][j];
			}

			System.out.printf("%2d |", sum);

			if (sum >= maxSumColumn) {
				maxSumColumn = sum;
				column[j] = sum;/*
								 * массив, для определения количества столбцов, если будет одинаковая сумма в
								 * столбцах
								 */
			}

			sum = 0;

		}

		System.out.println();
		System.out.print("Maximum sum in a colummn = " + maxSumColumn);
		System.out.println();
		System.out.print("Column number = ");

		for (int i = 0; i < column.length; i++) {

			if (column[i] == maxSumColumn) {

				System.out.print((i + 1) + "    ");
			}
		}

	}

}
