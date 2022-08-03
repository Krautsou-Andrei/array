package by.array.ex4.main;

//Вычислить площадь правильного шестиугольника со стороною а, используя метод вычисления
// площади треугольника

import java.util.Scanner;

public class Zadacha3 {
	public static void main(String[] args) {

		int a;
		double areaHexagon;

		a = enter("Enter the side of the hexagon");
		areaHexagon = triangle(a) * 6;

		System.out.printf("Area hexagon = %.2f ", areaHexagon);

	}

	public static double triangle(int a) {
		double area;

		area = Math.pow(a, 2) * Math.sqrt(3) / 4;

		return area;
	}

	public static int enter(String s) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s ", s);
		while (!sc.hasNextInt()) {
			System.out.printf("It is not integer. %s", s);
			sc.next();
		}

		n = sc.nextInt();

		return n;

	}

}
