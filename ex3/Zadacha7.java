package by.array.ex3.main;

//пусть даны две неубывающие последовательности чисел a1 <=a2<=...<=an, и b1<=b2<=..<=bm,
// требуется указать те места, на которые нужно вставлять элементы последовательности  b1<=b2<=..<=bm
//в первую последовательность так, чтобы новая последовательность оставалась возрастающей

import java.util.Scanner;
import java.util.Arrays;

public class Zadacha7 {
	public static void main(String[] args) {

		int[] firstArray;
		int[] secondArray;
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
		firstArray = new int[n];
		firstArray[0] = (int) (Math.random() * 20 - 10);

		System.out.print("Enter the number of second array elements, m = ");
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, m =");
			sc.next();
		}

		m = sc.nextInt();
		secondArray = new int[m];
		secondArray[0] = (int) (Math.random() * 20 - 10);

		for (int i = 1; i < firstArray.length; i++) {
			do {
				firstArray[i] = (int) (Math.random() * 20 - 10);
			} while (firstArray[i - 1] > firstArray[i]);
		}

		for (int i = 1; i < secondArray.length; i++) {
			do {
				secondArray[i] = (int) (Math.random() * 20 - 10);

			} while (secondArray[i - 1] > secondArray[i]);

		}

		System.out.print("First array  " + Arrays.toString(firstArray));
		System.out.println();
		System.out.print("Second array  " + Arrays.toString(secondArray));
		System.out.println();
		
		for (int i = 0; i < secondArray.length; i++) {
			int index = 0;
			for (int j= 0; j < firstArray.length; j++) {
				if (secondArray[i] <= firstArray[j]) {
					index = i + j;
					break;
				}
				
			}
			System.out.printf("b[%d] insert in place in new array %d \n", i, index);
		}

	}

}
