package by.itclass.array.main;

//Дан массив. Найти сумму елементов с четными номерами и отдельно - с нечетными

import java.util.Scanner;
import java.util.Arrays;

public class Zadacha2 {
	public static void main(String[] args) {

		int[] array;
		int n;
		int sumOfEven = 0;
		int sumOfOdd = 0;

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

		for (int i = 0; i < array.length; i++) {
			
			if (i % 2 != 0) {
				sumOfEven = sumOfEven + array[i];
				
			} else {
				sumOfOdd = sumOfOdd + array[i];
			}
		}
		
		System.out.println("Sum of even elements = " + sumOfEven);
		System.out.println("Sum of od elements = " + sumOfOdd);
	}

}
