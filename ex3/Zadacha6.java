package by.array.ex3.main;

//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. 
//Делается это следующим образом. Сравнивается два соседних элемента a[i],  a[i+1],
//если a[i] <= a[i+1], передвигаются на один элемент вперед. Если a[i] > a[i+1], то 
//производится перестановка и сдвигаются на один элемент назад. Составить алгоритм

import java.util.Scanner;

public class Zadacha6 {
	public static void main(String[] args) {

		double[] array;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements, n = ");
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();
		array = new double[n];

		System.out.println("Array");

		for (int i = 0; i < array.length; i++) {
			array[i] = (Math.random() * 50 - 25);
			System.out.printf("| %.2f |", array[i]);
		}
		System.out.println();

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {

				double temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;

				if (i > 0) {
					i = i - 2;

				}
			}
		}

		System.out.println("New array");

		for (int i = 0; i < array.length; i++) {
			System.out.printf("| %.2f |", array[i]);
		}

	}

}
