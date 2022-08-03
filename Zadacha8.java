package by.itclass.array.main;

//Дан двумерный массив. Отсортировать строки двумерного массива по возрвстанию их сумм элементов



import java.util.Scanner;
import java.util.Arrays;

public class Zadacha8 {
	public static void main(String[] args) {

		int[][] array;
		int[] tempArray;
		int n;
		int sum = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of matrix elements, n = ");
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();

		array = new int[n][n];
		tempArray = new int[n];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 20);
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				System.out.printf("|%3d |", array[i][j]);

			}
			System.out.println();
		}

		for (int j = 0; j < array.length; j++) {
			sum = sum + array[0][j];
		}

		for (int i = 0; i < array.length; i++) {
			int temp = 0;
			for (int j = 0; j < array[i].length; j++) {
				temp = temp + array[i][j];

			}

			tempArray[i] = temp;
		}

		System.out.println(Arrays.toString(tempArray));

		for (int i = 1; i < tempArray.length; i++) {
			int temp = tempArray[i];
			int j = i - 1;

			for (; j >= 0; j--) {
				if (tempArray[j] > temp) {
					tempArray[j + 1] = tempArray[j];
					
					for (int k = 0; k < array[i].length; k++) {
						int newTemp = array[j+1][k];
						array[j+1][k] = array[j][k];
						array[j][k] = newTemp;
						
					}
				} else
					break;
			}

			tempArray[j + 1] = temp;
		}
		
		System.out.println(Arrays.toString(tempArray));
		
		System.out.println("New Matrix");
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				System.out.printf("|%3d |", array[i][j]);

			}
			System.out.println();
		}
	}

}
