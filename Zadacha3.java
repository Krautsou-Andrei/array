package by.itclass.array.main;

//Дан массив. Все элементы массива расположить в обратном порядке

import java.util.Scanner;
import java.util.Arrays;

public class Zadacha3 {
	public static void main(String[] args) {

		int[] array;
		int n;
		int temp;

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

		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}

		System.out.println("New array");
		System.out.println(Arrays.toString(array));
	}
}
