package by.array.ex4.main;

// Написать метод (методы)для нахождения наибольшего общего делителя и наименьшего общего кратного
//двух натуральных чисел NOK(A,B) = (A*B)/ NOD(A,B)
import java.util.Scanner;

public class Zadacha1 {
	public static void main(String[] args) {

		int a;
		int b;
		int NOK;
		int NOD;

		a = enter("A");
		b = enter("B");

		NOD = NOD(a, b);
		NOK = a * b / NOD;
		
		System.out.println("NOD = " + NOD);
		System.out.println("NOK = " + NOK);

	}

	public static int enter(String a) {
		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter %s, %s =  ", a, a);
		while (!sc.hasNextInt()) {
			System.out.printf("Enter an integer, %s = ", a);
			sc.next();
		}

		n = sc.nextInt();
		return n;
	}

	public static int NOD(int x, int y) {

		int NOD = 0;
		int temp;

		if (x > y) {
			NOD = y;
			do {

				temp = x % NOD;
				if (temp != 0) {
					x = NOD;
					NOD = temp;
				}

			} while (temp != 0);

		} else {
			NOD = x;
			do {
				temp = y % NOD;
				if (temp != 0) {
					y = NOD;
					NOD = temp;
				}
			} while (temp != 0);

		}

		return NOD;
	}

}
