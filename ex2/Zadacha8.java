package by.array.ex2.main;

//В числовой матрице поменять местами два столбца любых столбца, т.е. все элементы одного столбца
//поставить на соответсвующие им позиции другого, а его элементы второго поместить в первый.
//Номера столбцов вводит пользователь  с клавиатуры

import java.util.Scanner;

public class Zadacha8 {
	public static void main(String[] args) {
		int[][] a;
		int n;
		int columnFirst;
		int columnSecond;
		int change;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size, n = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer");
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

		System.out.print("Enter number first columt = ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Enter an integer = ");
				sc.next();
			}

			columnFirst = sc.nextInt();

			if (columnFirst <= 0 || columnFirst > a.length) {
				System.out.print("This column is missing, enter another column number= ");
			}

		} while (columnFirst <= 0 || columnFirst > a.length);

		System.out.print("Enter number second column = ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Enter an integer = ");
				sc.next();
			}

			columnSecond = sc.nextInt();

			if (columnSecond <= 0 || columnSecond > a.length) {
				System.out.print("This column is missing, enter another column number= ");
			}

		} while (columnSecond <= 0 || columnSecond > a.length);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (j == columnFirst - 1) {

					change = a[i][j];
					a[i][j] = a[i][columnSecond - 1];
					a[i][columnSecond - 1] = change;

				}

			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf(" %d |", a[i][j]);
			}
			System.out.println();

		}

	}
}