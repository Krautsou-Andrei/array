package by.itclass.array.main;

//Даны два массива. Получить третий массив из отрицательных элементов первого, крытных трем
// и четных положительных элементов второго. Полученный массив отсортировать по убыванию.

// в задаче рассматриваю, что элемент находится на четном месте второго массива и он положительный.

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class Zadacha7 {
	public static void main(String[] args) {

		int[] firstArray;
		int[] secondArray;
		int n;
		int m;

		n = enter("Enter the number of first array elements, n = ");
		m = enter("Enter the number of second array elements, m = ");

		firstArray = array(n);
		secondArray = array(m);

		ArrayList<Integer> newArray = negativeElement(firstArray);
		ArrayList<Integer> secondElement = positiveElement(secondArray);
		newArray.addAll(secondElement);
		newArray.sort(Comparator.reverseOrder());

		print(newArray, firstArray, secondArray);

	}

	public static int enter(String s) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s ", s);
		while (!sc.hasNextInt()) {
			System.out.printf("It is not integer. %s", s);
			sc.next();
		}

		n = sc.nextInt();

		return n;
	}

	public static int[] array(int n) {

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 20 - 10);
		}

		return array;
	}

	public static ArrayList<Integer> negativeElement(int[] array) {

		ArrayList<Integer> negativeArray = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0 && array[i] % 3 == 0) {

				negativeArray.add(array[i]);

			}
		}

		return negativeArray;
	}

	public static ArrayList<Integer> positiveElement(int[] array) {

		ArrayList<Integer> positiveArray = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0 && array[i] > 0) {

				positiveArray.add(array[i]);

			}
		}

		return positiveArray;

	}

	public static void print(ArrayList<Integer> array, int[] firstArray, int[] secondArray) {

		System.out.println("First array");
		System.out.println(Arrays.toString(firstArray));

		System.out.println("Second array");
		System.out.println(Arrays.toString(secondArray));

		if (array.size() == 0) {
			System.out.println("Not reqared items");
		} else {
			System.out.println("New array");
			System.out.println(array);
		}
	}

}
