package by.array.ex2.main;

//Сформулировать квадратную матрицу порядка n по образцу (n - четное)

import java.util.Scanner;

public class Zadacha4 {
	public static void main(String[] args) {

		int a[][];
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size (even number), n = ");

		do {
			while (!sc.hasNextInt()) {
				System.out.print("Enter an integer, n = ");
				sc.next();
			}

			n = sc.nextInt();

			if (n <= 0 || n % 2 != 0) {
				System.out.print("Enter even number, n = ");
			}
		} while (n <= 0 || n % 2 != 0);

		a = new int[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i % 2 == 0) {
					a[i][j] = j + 1;
				} else {
					a[i][j] = n--;
				}
			}
			n = a.length;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d| ", a[i][j]);
			}
			System.out.println();
		}

	}

}
