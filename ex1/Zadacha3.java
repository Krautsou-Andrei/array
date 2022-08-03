package by.array.ex1.main;

//Дан массив действительных чисел, размерность которого N. Подсчитать сколько в нем отрицательных
//положительных и нулевых элементов

import java.util.Scanner;

public class Zadacha3 {
	public static void main(String[] args) {

		double[] a;
		int n;
		int sumPositive = 0;
		int sumNegative = 0;
		int sumNull = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements, n = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();

		a = new double[n];

		for (double i : a) {
			i = (Math.random() * 1000 - 500);
			System.out.printf(" %,.2f | ", i);

			if (i > 0) {
				sumPositive++;
			} else if (i == 0) {
				sumNull++;
			} else {
				sumNegative++;
			}
		}

		System.out.println();
		System.out.println("Number of positive numbers - " + sumPositive);

		System.out.println("Number of negative numbers - " + sumNegative);

		System.out.println("Number of null numbers - " + sumNull);

	}

}
