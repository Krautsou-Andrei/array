package by.array.ex3.main;

//Дана последовательность чисел a1<=a2<= .. an, Требуется переставить элемены так, что бы
//Чтобы они были расположены по убыванию. ля этого в массиве, начиная с первого, выбирается
// наибольший элемент и ставиться на первое место, а первый на место наибольшего. Затем начиная со
//второго, эта процедура повторяется. Написать алгоритм сортировки выбором

import java.util.Scanner;
import java.util.Arrays;

public class Zadacha3 {
	public static void main(String[] args) {

		int[] a;
		int n;
		int temp;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements, n = ");
		
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();
		
		a = new int[n];

		a[0] = (int) (Math.random() * 30);

		for (int i = 1; i < a.length; i++) {
			do {
				a[i] = (int) (Math.random() * 30);
			} while (a[i - 1] > a[i]);
		}

		System.out.print(Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			int max = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] > a[max]) {
					max = j;
				}
			}
			temp = a[i];
			a[i] = a[max];
			a[max] = temp;
			
		}

		System.out.println();
		System.out.print(Arrays.toString(a));

	}

}
