package by.array.ex3.main;

//Дана последовательность чисел a1<=a2<= .. an. Требуетя переставить числа в порядке убывания.
//Для этогосравнивают два соседних числа a[i] и a[i+1]. Если a[i] < a[i+1], то делается перестановка
//Так продолжается до тех пор, пока все элементы не станут в порядке убывания.
//Составить алгоритм сортировки, подсчитывая при этом количество перестановок.

import java.util.Scanner;
import java.util.Arrays;


public class Zadacha4 {
	public static void main(String[] args) {

		int[] a;
		int n;
		int temp;
		int sum = 0;

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

		boolean max;

		do {
			max = true;
			for (int i = 0; i < a.length - 1; i++) {

				if (a[i] < a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					max = false;
					sum++;
				}
			}
		} while (max == false);

		System.out.println();
		System.out.print(Arrays.toString(a));
		System.out.println();
		System.out.println("Amount of exchange = " + sum);
	}

}
