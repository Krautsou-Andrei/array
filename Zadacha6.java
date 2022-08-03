package by.itclass.array.main;

//Дан массив. Переписать его положительные елементы во второй массивб отрицательные - в третий


import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Zadacha6 {
	public static void main(String[] args) {

		int[] array;
		int n;

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

		/*
		 * можно сделать с помощью обычного массива, но нужно считать количество
		 * элементов положительных, потом от общего количества элементов отнять
		 * количество положительных и создать два массива нужной длины
		 */
		ArrayList<Integer> arrayPositive = new ArrayList<Integer>();
		ArrayList<Integer> arrayNegative = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0) {
				arrayPositive.add(array[i]);
			} else {
				arrayNegative.add(array[i]);
			}
		}

		System.out.println("Positive elements " + arrayPositive);
		System.out.println("Negative elements " + arrayNegative);

	}

}

