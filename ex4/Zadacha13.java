package by.array.ex4.main;

//Два простых числа называются близнецами, если они отличаются друг от друга на 2( 41 и 43)
// Найти и напечатать все пары блзнецов из отрезка (n,2n), где n - натуральное число больше 2.

import java.util.Scanner;
import java.util.ArrayList;

public class Zadacha13 {
	public static void main(String[] args) {

		int n;
		ArrayList<ElementArray> array;
		ArrayList<String> arrayString = new ArrayList<>();

		n = validation("Enter natural number more two, n = ");

		array = new ArrayList<>();

		array = array(n);
		arrayString = arrayString(n);

		print(array, arrayString);

	}

	public static int enter(String str) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s", str);
		while (!sc.hasNextInt()) {
			System.out.printf("It is not integer. %s", str);
			sc.next();
		}

		n = sc.nextInt();

		return n;
	}

	public static int validation(String str) {

		int n;
		int sum = 0;
		do {
			if (sum == 0) {
				n = enter(str);
				sum++;
			} else {
				n = enter("It is not natural number. Enter natural namber more two, n = ");
			}

		} while (n < 3);

		return n;
	}

	public static ArrayList<ElementArray> array(int n) {

		ArrayList<ElementArray> array = new ArrayList<>();

		for (int i = n; i < n * 2 - 2; i++) {
			ElementArray element = new ElementArray();
			element.setA(i);
			element.setB(i + 2);
			array.add(element);
		}

		return array;
	}

	public static ArrayList<String> arrayString(int n) {

		String elementFirst;
		String elementSecond;
		String element;

		ArrayList<String> array = new ArrayList<>();

		for (int i = n; i < n * 2 - 2; i++) {
			elementFirst = String.valueOf(i);
			elementSecond = String.valueOf(i + 2);
			element = elementFirst + " and " + elementSecond;

			array.add(element);
		}

		return array;
	}

	public static void print(ArrayList<ElementArray> array, ArrayList<String> arrayString) {

		System.out.println(array);
		System.out.println();
		System.out.println(arrayString);

	}
}
