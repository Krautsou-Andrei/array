package by.array.ex4.main;

//Н плоскости заданы своими координатами n точек. Написать метод (методы), определяющие, между 
// какими из пар точексамое большое расстояние. Координаты точек занесены в массив.

import java.util.Scanner;
import java.awt.Point;
import java.util.Arrays;

public class Zadacha4 {
	public static void main(String[] args) {

		int n;
		Point[] pointArray;
		Point[] betweenPointMax;

		n = enter("Enter the number of points");

		pointArray = point(n);

		betweenPointMax = distanceMax(pointArray);

		System.out.println(Arrays.toString(pointArray));
		System.out.println();
		System.out.println("Maximum distance between points " + Arrays.toString(betweenPointMax));

	}

	public static int enter(String s) {

		int n;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s", s);
		while (!sc.hasNextInt()) {
			System.out.printf("It is not integer. %s", s);
			sc.next();
		}

		n = sc.nextInt();

		return n;
	}

	public static Point[] point(int n) {

		Point[] pointArray = new Point[n];

		for (int i = 0; i < pointArray.length; i++) {
			int x = (int) (Math.random() * 10);
			int y = (int) (Math.random() * 10);
			Point point = new Point(x, y);

			pointArray[i] = point;

		}

		return pointArray;

	}

	public static double distance(Point a, Point b) {

		double distance;

		distance = Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow(a.getY() - b.getY(), 2));

		return distance;
	}

	public static Point[] distanceMax(Point[] pointArray) {

		Point[] betweenPoint;
		double distance;
		double max = 0;
		betweenPoint = new Point[2];

		for (int i = 0; i < pointArray.length - 1; i++) {
			for (int j = i + 1; j < pointArray.length; j++) {
				distance = distance(pointArray[i], pointArray[j]);

				if (max < distance) {
					max = distance;
					betweenPoint[0] = pointArray[i];
					betweenPoint[1] = pointArray[j];
				}

			}
		}

		return betweenPoint;

	}

}
