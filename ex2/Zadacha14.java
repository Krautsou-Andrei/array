package by.array.ex2.main;

//Сформировать случайную матрицу mxn, состоящую из нулей и единиц, причем в каждом столбце
// число единиц равно номеру столбца

import java.util.Scanner;

public class Zadacha14 {
	public static void main(String[] args) {

		int[][] a;
		int m;
		int n;
		int sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount line, m = ");
		
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, m = ");
			sc.next();
		}

		m = sc.nextInt();

		System.out.print("Enter amount column, n = ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Enter an integer, n = ");
				sc.next();
			}

			n = sc.nextInt();
			
			if (m < n) {
				// невозможно поместить в столбец больше единиц, чем имеется строк
				System.out.print("n must be less than or equal to m, n = ");

			}
		} while (m < n);

		a = new int[m][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				do {
					sum = 0;
					for (int h = 0; h < a.length; h++) {
						a[h][j] = (int) (Math.random() * 2);
						sum = sum + a[h][j];
					}
				} while (sum != j + 1);// Нумеровать столбцы начал с первого, для нумерации с нулевого нужно удалить +1
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
