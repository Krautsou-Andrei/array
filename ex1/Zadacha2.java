package by.array.ex1.main;

//Дана последовательность действительных чисел a1, a2 .. an. Заменить все ее члены, болше 
//даного числа z этим числом. Подсчитать количество замен.

import java.util.Scanner;



public class Zadacha2 {
	public static void main(String[] args) {
		
		double [] a;
		int n;
		double z;
		int sum = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a real number n =");
		
		while (! sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}
		
		n = sc.nextInt();
		
		a = new double[n];
		
		System.out.print("Enter number z = ");
		
		while (!sc.hasNextDouble()) {
			System.out.print("Enter an double number z = ");
			sc.next();
		}
		
		z = sc.nextDouble();
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (Math.random()*1000-500);
			System.out.printf(" %,.2f |", a[i]);
		}
		
		System.out.println();
		System.out.println("New massiv");
		
		for (int i = 0; i < a.length; i++) {
		
		if(a[i] > z) {
				a[i] = z;
				sum++;
				
			}
			
			System.out.printf(" %,.2f |",a[i]);
			
		}
		System.out.println();
		System.out.println("Number of replacements = " + sum);
	}

}
