package by.array.ex3.main;

//Даны дроби p1/q1, p2/q2 .. pn/qn. p[i], q[i] - натуральные числаю Составить программу, 
//которая приводит данные дроби к общему знаменателю и упорядочивает их в порядке возрастания
import java.util.Scanner;
import java.util.Arrays;

public class Zadacha8 {
	public static void main(String[] args) {

		int[] numerator;
		int[] denominator;
		Fraction[] fractionArray;
		int n;
		int sum;
		int NOK = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements, n = ");
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();
		numerator = new int[n];
		denominator = new int[n];

		for (int i = 0; i < numerator.length; i++) {
			numerator[i] = (int) (Math.random() * 9 + 1);
		}

		for (int i = 0; i < denominator.length; i++) {
			do {
			denominator[i] = (int) (Math.random() * 10 + 1);
			} while (denominator[i] <= numerator[i]);
		}

		fractionArray = new Fraction[n];

		for (int i = 0; i < fractionArray.length; i++) {
			Fraction fraction = new Fraction();
			fraction.setNumerator(numerator[i]);
			fraction.setDenominator(denominator[i]);

			fractionArray[i] = fraction;

		}

		System.out.println(Arrays.toString(fractionArray));

		int max = fractionArray[0].getDenominator();

		for (int i = 0; i < fractionArray.length; i++) {

			if (max < fractionArray[i].getDenominator()) {
				max = fractionArray[i].getDenominator();
			}
		}

		NOK = max;

		do {
			sum = 0;
			for (int i = 0; i < fractionArray.length; i++) {

				if (NOK % fractionArray[i].getDenominator() != 0) {
					sum++;
				}
			}

			if (sum != 0) {
				NOK = NOK + max;
			}
		} while (sum != 0);

		System.out.println("Common denominator = " + NOK);

		for (int i = 0; i < fractionArray.length; i++) {

			int factor;
			int newNumerator;

			factor = NOK / fractionArray[i].getDenominator();
			newNumerator = fractionArray[i].getNumerator() * factor;
			fractionArray[i].setNumerator(newNumerator);
			fractionArray[i].setDenominator(NOK);
		}

		System.out.println("New array with common denominator");
		System.out.println(Arrays.toString(fractionArray));

		for (int i = 0; i < fractionArray.length; i++) {

			int left;
			int j;
			Fraction temp;

			left = fractionArray[i].getNumerator();
			j = i - 1;
			temp = fractionArray[i];

			for (; j >= 0; j--) {

				if (fractionArray[j].getNumerator() > left) {
					fractionArray[j + 1] = fractionArray[j];
				} else {
					break;
				}
			}

			fractionArray[j + 1] = temp;
		}

		System.out.println("Sort array in ascending order");
		System.out.println(Arrays.toString(fractionArray));

	}
}
