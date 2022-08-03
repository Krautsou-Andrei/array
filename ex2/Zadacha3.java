package by.array.ex2.main;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Scanner;

public class Zadacha3 {
	public static void main(String[] args) {

		int a[][];
		int n;
		int k;
		int p;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size, n =");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer");
			sc.next();
		}

		n = sc.nextInt();

		a = new int[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 10);
				System.out.print(a[i][j] + " | ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.print("Enter line number, k = ");

		do {
			while (!sc.hasNextInt()) {
				System.out.print("Enter an integer, k = ");
				sc.next();
			}

			k = sc.nextInt();

			if (k < 1 || k > a.length) {
				System.out.print("This line is missing, enter another line number, k = ");

			}
		} while (k < 1 || k > a.length);

		System.out.printf("Line number %d = ", k);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[k - 1][i] + " | ");

		}

		System.out.println();

		System.out.println();
		System.out.print("Enter column number, p = ");

		do {
			while (!sc.hasNextInt()) {
				System.out.print("Enter an integer, p = ");
				sc.next();
			}
			p = sc.nextInt();

			if (p < 1 || p > a.length) {
				System.out.print("This column is missing, enter another column number, p = ");
			}

		} while (p < 1 || p > a.length);

		System.out.printf("Column number %d = ", p);

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d | ", a[i][p - 1]);
		}
	}

}
