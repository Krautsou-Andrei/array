package by.itclass.array.main;

//Дан массив, определить среднее арифметическое кратных 5 и не кратных 10

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Zadacha5 {
	public static void main(String[] args) {

		int[] array;
		int n;
		double mind = 0;

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

		ArrayList<Integer> newArray = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0 && array[i] % 10 != 0) {
				newArray.add(array[i]);
			}
		}

		if (newArray.size() != 0) {
			for (Integer i : newArray) {

				mind = mind + i;
			}

			mind = mind / newArray.size();
			System.out.println("Averege = " + mind);

		} else {
			System.out.println("Not reqared item");
		}

	}

}
