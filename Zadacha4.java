package by.itclass.array.main;

import java.util.Arrays;
import java.util.Scanner;

//В массиве найти значение и индекс наибольшего из отрицательных элемента

public class Zadacha4 {
	public static void main(String[] args) {

		int[] array;
		int n;
		int index = 0;
		int maxNegative = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of arra elements n = ");
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer");
			sc.next();
		}

		n = sc.nextInt();
		array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 40 - 20);
		}

		System.out.println("Given an array");
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				maxNegative = array[i];
				index = i;
			}
		}

		if (maxNegative < 0) {
			for (int i = 1; i < array.length; i++) {
				if (array[i] < 0) {
					if (array[i] > maxNegative) {
						maxNegative = array[i];
						index = i;

					}
				}
			}

			System.out.println("Maximum negative element = " + maxNegative);
			System.out.println("Index maximum negative element = " + index);
		} else {

			System.out.println("They are not negative elements in this array");
		}

	}

}
