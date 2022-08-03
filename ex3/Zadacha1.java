package by.array.ex3.main;

//Заданы два одномерные массива с различным количеством элементов и натуральное число k
// Объединить их в один массив, включив второй массив между k-м и k+1 элементами первого,
//при этом не используя дополнительный массив

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Zadacha1 {
	public static void main(String[] args) {

		Integer[] first;
		Integer[] second;
		int k;
		int n;
		int m;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of first array elements, n = ");
		
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n =");
			sc.next();
		}

		n = sc.nextInt();
		
		first = new Integer[n];

		System.out.print("Enter the number of second array elements, m =");
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, m = ");
			sc.next();
		}

		m = sc.nextInt();
		
		second = new Integer[m];

		System.out.print("Enter natural number, k = ");
		do {
			while (!sc.hasNextInt()) {
				System.out.print("Enter an integer, k = ");
				sc.next();
			}

			k = sc.nextInt();

			if (k < 0 || k > first.length) {
				System.out.print("Enter k from 0 to n, k = ");
			}
		} while (k < 0 || k > first.length);

		System.out.println("First array  ");
		
		for (int i = 0; i < first.length; i++) {
			first[i] = (int) (Math.random() * 10);
			System.out.print(first[i] + " | ");
		}

		System.out.println();
		
		System.out.println("second array  ");
		
		for (int i = 0; i < second.length; i++) {
			second[i] = (int) (Math.random() * 10);
			System.out.print(second[i] + " | ");
		}

		System.out.println();
		System.out.println("Sum array  ");

		ArrayList<Integer> sum = new ArrayList<Integer>();

		Collections.addAll(sum, first);

		for (int i = 0; i < second.length; i++) {
			sum.add(k + i, second[i]);
		}
		System.out.println(sum.toString());

	}

}
