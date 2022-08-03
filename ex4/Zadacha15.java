package by.array.ex4.main;

//Найти все натуральные n-значные числа, цифры в которых формируют 
//строго возратсающую последоватеьность

import java.util.Scanner;
import java.util.ArrayList;

public class Zadacha15 {
	public static void main(String[] args) {

		int n;
		ArrayList<Integer> arrayNumber;

		n = enter("Enter the number of difit");

		arrayNumber = arrayList(n);

		print(arrayNumber, n);

	}

	public static int enter(String str) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.printf("%s", str);
			while (!sc.hasNextInt()) {
				System.out.printf("It is not integer. %s", str);
				sc.next();
			}

			n = sc.nextInt();

		} while (n < 1);

		return n;
	}

	public static ArrayList<Integer> arrayList(int n) {

		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = (int) (Math.pow(10, n - 1)); i < (int) (Math.pow(10, n)); i++) {
			int[] temp;
			temp = arrayDigit(i);

			int sum;

			sum = element(temp);

			if (sum == 0) {

				arrayList.add(i);
			}

		}

		return arrayList;
	}

	public static int[] arrayDigit(int number) {

		int[] array;
		String temp;
		char[] arrayChar;

		temp = String.valueOf(number);
		arrayChar = new char[temp.length()];
		arrayChar = temp.toCharArray();
		array = new int[arrayChar.length];

		for (int i = 0; i < arrayChar.length; i++) {
			array[i] = Character.digit(arrayChar[i], 10);
		}

		return array;

	}

	public static int element(int[] arrayTemp) {

		int sum = 0;

		for (int j = 0; j < arrayTemp.length - 1; j++) {
			if (arrayTemp[j] > arrayTemp[j + 1] - 1) {
				sum++;

			}
		}

		return sum;

	}

	public static void print(ArrayList<Integer> arrayNumber, int n) {

		System.out.println("The number of digit in a number " + n);
		System.out.println("rising sequence");
		System.out.println(arrayNumber);
	}

}
