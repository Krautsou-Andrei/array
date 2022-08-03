package by.array.ex2.main;

//Дана квадратная матрица.Вывести на экран элементы стоящие по диагонали

import java.util.Scanner;

public class Zadacha2 {
	public static void main(String[] args) {

		int a[][];
		int firstDiagonal[];
		int secondDiagonal[];
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marix size, n = ");
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();

		a = new int[n][n];

		firstDiagonal = new int[n];

		secondDiagonal = new int[n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 10);
				System.out.print(a[i][j] + " | ");
			}

			System.out.println();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == j) {
					firstDiagonal[i] = a[i][j];
				}

				if (((a.length - 1) - i) == j) {
					secondDiagonal[i] = a[(a.length - 1) - i][(a.length - 1) - j];

				}
			}
		}
		System.out.println("First diagonal");
		for (int i : firstDiagonal) {
			System.out.print(i + " | ");
		}
		System.out.println();
		System.out.println("Second diagonal");

		for (int i : secondDiagonal) {
			System.out.print(i + " | ");
		}
	}

}
