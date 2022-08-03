package by.array.ex1.main;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые 
//номера которых являются простыми числами

import java.util.Scanner;

public class Zadacha6 {
	public static void main(String[] args) {

		int m;
		double[] n;
		double sum = 0;
		int x = 1;
		int y;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nubmer of array elements m = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an Integer, m = ");
			sc.next();
		}

		m = sc.nextInt();

		n = new double[m];

		for (int i = 0; i < n.length; i++) {
			n[i] = (Math.random() * 100 - 50);
			System.out.printf("%f | ", n[i]);

			if (i >= 1 && 2 > Math.sqrt(i + 1)) {
				sum += n[i];

			}
			if (2 < Math.sqrt(i + 1)) {
				for (y = 2; y <= Math.sqrt(i + 1); y++) {
					x = (i + 1) % y * x;

				}
				if (x != 0) {

					sum += n[i];
				}
				x++;
			}

		}

		System.out.println();
		System.out.println("Sum of numbers = " + sum);

	}

}
