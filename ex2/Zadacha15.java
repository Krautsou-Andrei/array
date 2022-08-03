package by.array.ex2.main;

//Найти наибольший элемент матрицы и заменить все нечетный элементы на него

import java.util.Scanner;

public class Zadacha15 {

	public static void main(String[] args) {

		int[][] a;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size, n = ");
		
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer");
			sc.next();
		}

		n = sc.nextInt();
		
		a = new int[n][n];
		
		int max = a[0][0];
		
		int line = 0;
		
		int column = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 20 - 10);
				if (a[i][j] > max) {
					max = a[i][j];
					line = i + 1;
					column = j + 1;
				}
				System.out.printf("%3d |", a[i][j]);
			}
			System.out.println();
		}

		System.out.print("Maximum = " + max);
		System.out.println();
		System.out.printf("Element index = [ %d, %d ]", line, column);
		System.out.println();
		System.out.println("New matrix");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if ((i + j) % 2 == 0) {
					a[i][j] = max;
				}
				System.out.printf("%3d |", a[i][j]);
			}
			System.out.println();
		}
	}

}
