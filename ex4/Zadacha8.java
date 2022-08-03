package by.array.ex4.main;

//Дан массив D. составить методы для вычисления суммы трех последовательно расположенных элементво
//массива с номерами от k до m

import java.util.Scanner;
import java.util.Arrays;

public class Zadacha8 {
	public static void main(String[] args) {

		int[] array;
		int n;
		int k;
		int sumElement;

		n = enter("Enter the number of array elements");

		array = array(n);

		k = validation("Enter item number", array);

		sumElement = sumThreeElments(array, k);

		print(array, sumElement, k);

	}

	public static int enter(String s) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s ", s);
		while (!sc.hasNextInt()) {
			System.out.printf("It is not enteger. %s ", s);
			sc.next();
		}

		n = sc.nextInt();

		return n;
	}

	public static int validation(String s, int[] array) {

		int k;
		int sum = 0;
		do {
			if (sum == 0) {
				k = enter(s);
				sum = sum + 1;
			} else {
				k = enter("This index is not in this array. Enter anoher index");
			}

		} while (k < 0 || k > array.length);

		return k;

	}

	public static int[] array(int n) {

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20);
		}

		return array;
	}

	public static int sumThreeElments(int[] array, int n) {

		int sum = 0;

		if (n > 0 && n <= array.length - 2) {
			for (int i = n - 1; i < n + 2; i++) {
				sum = sum + array[i];
			}
		}

		if (n > 0 && n > array.length - 2) {
			for (int i = n - 1; i < array.length; i++) {
				sum = sum + array[i];
			}

		}
		return sum;
	}

	public static void print(int[] array, int sum, int index) {

		System.out.println(Arrays.toString(array));

		if (index <= array.length - 2) {

			System.out.println("Sum of three elements = " + sum);

		} else {

			System.out.printf("Array has %d elements. Their sum = %d ", array.length - index + 1, sum);
		}

	}
}
