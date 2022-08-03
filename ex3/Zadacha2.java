package by.array.ex3.main;

//Даны две последовательности a1<=a2<=..<=an и b1<=b2<=...bm. Образовать из них новую последовательность
//чисел так, чтобы она тоже была не убывающей. Примечание. Дополнительный массив не использовать

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Zadacha2 {
	public static void main(String[] args) {

		Integer[] first;
		Integer[] second;
		int n;
		int m;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of first array elements, n = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();

		first = new Integer[n];

		System.out.print("Enter the number of second array elements, m = ");

		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, m = ");
			sc.next();
		}

		m = sc.nextInt();

		second = new Integer[m];

		System.out.println("First array");

		first[0] = (int) (Math.random() * 20);

		for (int i = 1; i < first.length; i++) {
			do {
				first[i] = (int) (Math.random() * 20);
			} while (first[i - 1] > first[i]);
		}

		System.out.println(Arrays.toString(first));
		System.out.println("Second array");

		second[0] = (int) (Math.random() * 20);

		for (int i = 1; i < second.length; i++) {
			do {
				second[i] = (int) (Math.random() * 20);
			} while (second[i - 1] > second[i]);
		}

		System.out.println(Arrays.toString(second));

		ArrayList<Integer> sum = new ArrayList<Integer>();
		Collections.addAll(sum, first);
		Collections.addAll(sum, second);
		Collections.sort(sum);

		System.out.println("Sum array");
		System.out.println(sum.toString());

	}

}
