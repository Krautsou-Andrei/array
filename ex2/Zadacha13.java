package by.array.ex2.main;

//Отсортировать столбцы матрицы во позрастанию и убыванию элементов

public class Zadacha13 {
	public static void main(String[] args) {

		int[][] a = { { 2, 2, 5, 8, 5 }, { 5, 8, 7, 9, 6 }, { 7, 9, 5, 4, 3 }, { 8, 9, 10, 5, 8 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%2d |", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("Sort matrix column in ascending order ");

		for (int left = 0; left < a.length; left++) {
			for (int j = 0; j < a[left].length; j++) {
				int value = a[left][j];
				int i = left - 1;

				for (; i >= 0; i--) {
					if (value > a[i][j]) {
						a[i + 1][j] = a[i][j];

					} else {
						break;
					}

				}
				a[i + 1][j] = value;
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%2d |", a[i][j]);
			}
			System.out.println();
		}

		System.out.println("Sort matrix column in descending order ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int value = a[i][j];
				int temp = i - 1;

				for (; temp >= 0; temp--) {
					if (value < a[temp][j]) {
						a[temp + 1][j] = a[temp][j];

					} else {
						break;
					}

				}
				a[temp + 1][j] = value;
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
