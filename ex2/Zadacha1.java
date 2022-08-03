package by.array.ex2.main;

//Дана матрица. Вывести на экран все нечетный столбцы, у которых первый элемент больше последнего

import java.util.Scanner;

public class Zadacha1 {
	public static void main(String[] args) {
		int[][] a;
		int[] b;
		int[] c;
		int n;
		int index = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size, n = ");
		while (!sc.hasNextInt()) {
			System.out.print("enter an integer");
			sc.next();
		}

		n = sc.nextInt();
		a = new int[n][n];

		System.out.println("Matrix");

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = (int) (Math.random() * 10);
				System.out.print(a[i][j] + " | ");

			}
			System.out.println();

		}

		for (int j = 0; j < a[0].length; j++) {
			if (j % 2 == 0) {
				index++;
			}

		}

		b = new int[index];
		index = 0;
		
		for (int j = 0; j < a[0].length; j++) {
			
			if (j % 2 == 0) {
				b[index] = j;
				index++;

			}

		}

		int endElement = a.length - 1;
		index = 0;

		for (int i = 0; i < b.length; i++) {

			if (a[0][b[i]] <= a[endElement][b[i]]) {
				index++;
				b[i] = -1;
			}
		}

		c = new int[b.length - index];

		index = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] > -1) {
				c[index] = b[i];
				index++;

			}
		}

		if (c.length > 0) {
			System.out.println("New matrix");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < c.length; j++) {
					System.out.print(a[i][c[j]] + " | ");

				}
				System.out.println();

			}
		} else {
			System.out.println("Enter anothe matrix");
		}
	}

}
