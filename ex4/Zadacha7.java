package by.array.ex4.main;

//Написать метод (методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

import java.util.Scanner;
import java.util.Arrays;

public class Zadacha7 {
	public static void main(String[] args) {

		int[] array;
		int[] oddNumbersArray;
		int oddNumbers;
		int factorialSum;

		int n;

		n = enter("Enter the number of array elements");

		array = array(n);
		
		oddNumbers = oddNumbers(array);
		
		oddNumbersArray = oddNumbersArray(array, oddNumbers);
		
		factorialSum = factorialSum(oddNumbersArray);
		
		print(array,oddNumbers, factorialSum);
		

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
			array[i] = (int) (Math.random() * 9 + 1);
		}

		return array;
	}

	public static int oddNumbers(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 != 0) {
				sum = sum + 1;
			}
		}

		return sum;
	}

	public static int[] oddNumbersArray(int[] array, int index) {

		int[] oddNumbersArray = new int[index];
		int j = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 != 0) {

				oddNumbersArray[j] = array[i];
				j++;
			}
		}

		return oddNumbersArray;

	}

	public static int factorial(int n) {

		int factorial = 1;

		for (int i = 2; i <= n; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}

	public static int factorialSum(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = factorial(array[i]);

		}

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		return sum;
	}

	public static void print(int[] array,int index, int factorialSum) {
		
		System.out.println(Arrays.toString(array));

		if (index > 0) {
			System.out.println("Sum factorials odd numbers = " + factorialSum);
		} else {
			System.out.println("They are not odd numbers in this array");
		}

	}
}
