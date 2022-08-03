package by.array.ex4.main;

//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать
// число, которое иеньше максимального, но больше остальных)

import java.util.Scanner;
import java.util.Arrays;

public class Zadacha5 {
	public static void main(String[] args) {

		int n;
		int[] a;
		int secondMax;

		n = enter("Enter the number of array elements");

		a = array(n);

		System.out.println(Arrays.toString(a));

		a = sortArray(a);

		secondMax = secondMax(a);

		// Проверка на наличие всех одинаковых элементов в массиве

		if (secondMax < a.length) {
			System.out.println("Second maximum element = " + a[secondMax]);

		} else {
			System.out.println("All elements in this array are the same ");
		}

	}

	public static int enter(String s) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s ", s);
		while (!sc.hasNextInt()) {
			System.out.printf("It is not integer. %s ", s);
			sc.next();
		}

		n = sc.nextInt();

		return n;
	}

	public static int[] array(int n) {

		int[] array;

		array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 40 - 20);
		}

		return array;
	}

	public static int[] sortArray(int[] array) {
		int temp;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			int j = i - 1;

			for (; j >= 0; j--) {
				if (array[j] < temp) {
					array[j + 1] = array[j];
				} else {
					break;
				}

			}
			array[j + 1] = temp;
		}
		return array;
	}

	// Проверка на наличии в отсортированном массиве двух и более максимальных
	// элементов

	public static int secondMax(int[] array) {

		int index = 1;

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				index = i + 2;

			}
			if (index == i + 1) {
				break;
			}
		}

		return index;
	}
}
