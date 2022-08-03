package by.array.ex2.main;

//найти положительные элементы главной диагонали квадратной матрицы

import java.util.Scanner;

public class Zadacha10 {
	public static void main(String[] args) {

		int[][] a;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size, n = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();

		a = new int[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 20 - 10);
				System.out.printf("%3d |", a[i][j]);
			}

			System.out.println();
		}

		System.out.println("Positive elements of the main diagonal of the matrix");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j && a[i][j] > 0) {

					System.out.printf("%3d |", a[i][j]);

				}
			}
		}
	}

}
