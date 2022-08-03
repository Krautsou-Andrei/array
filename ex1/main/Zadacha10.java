package by.array.ex1.main;

//Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него 
//каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный
//массив не использовать

import java.util.Scanner;

public class Zadacha10 {
	public static void main(String[] args) {

		int[] a;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements n = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();

		a = new int[n];

		System.out.println("Array of integers");

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
			System.out.printf("%d | ", a[i]);
		}

		System.out.println();
		System.out.println("New array");

		for (int i = 0; i < a.length; i++) {
			if (i % 2 != 0) {
				a[i] = 0;
			}

		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				for (int j = i; j < a.length; j++) {
					if (a[j] != 0) {
						int temp = a[j];
						a[j] = a[i];
						a[i] = temp;
						break;
					}
				}
			}
		}

		for (int i : a) {
			if (i != 0) {
				System.out.printf("%d |", i);
			}
		}

	}

}
