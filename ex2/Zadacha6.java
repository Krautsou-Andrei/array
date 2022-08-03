package by.array.ex2.main;

//Сформулировать квадратную матрицу порядка n по образцу (n - четное)

import java.util.Scanner;

public class Zadacha6 {
	public static void main(String[] args) {

		int[][] a;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size, n = ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Enter an integer, n = ");
				sc.next();
			}

			n = sc.nextInt();

			if (n == 0 || n < 0 || n % 2 != 0) {
				System.out.print("Enter even number, n = ");
			}
		} while (n == 0 || n < 0 || n % 2 != 0);

		a = new int[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j < a.length / 2 || i < a.length / 2) {
					if (j >= i && j < a.length - i) {
						a[i][j] = 1;
					}
				}
				if (j >= a.length / 2 || i >= a.length / 2) {
					if (j >= a.length - i - 1 && j <= i) {
						a[i][j] = 1;
					}
				}
				System.out.printf("%2d |", a[i][j]);
			}
			System.out.println();
		}
	}

}
