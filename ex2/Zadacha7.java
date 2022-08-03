package by.array.ex2.main;

//Сформировать квадратную матрицу порядка N по правилу : a[i,j] = sin((i*i - j*j) / n)
// и подсчитать количество положительных элементов в ней.

import java.util.Scanner;

public class Zadacha7 {
	public static void main(String[] args) {

		double[][] a;
		int n;
		int sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter matrix size, n = ");
		
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();
		
		a = new double[n][n];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
				System.out.printf("%7.3f |",a[i][j]);
				if ( a[i][j] > 0) {
					sum ++;
				}
			}
			System.out.println();
		}
		System.out.println ("Number positive of elements = " + sum);
	}
}
