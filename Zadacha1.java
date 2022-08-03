package by.itclass.array.main;

//В массиве производьных чисел положительные елементы уменьшить в двое, а отрицательные елементы
// заменить на значение их индексов

import java.util.Scanner;
import java.util.Arrays;

public class Zadacha1 {
	public static void main(String[] args) {

		double[] array;
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements n = ");
		while (!sc.hasNextInt()) {
			System.out.print("Enter an enteger");
			sc.next();
		}

		n = sc.nextInt();
		array = new double[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 30 - 15);
		}
		
		System.out.println("Given an array");
		System.out.println(Arrays.toString(array));
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				array[i] = array[i] / 2;
			}
			
			if (array[i] < 0) {
				array[i] = i;
			}
		}
		
		System.out.println("New array");
		System.out.println(Arrays.toString(array));

	}

}
