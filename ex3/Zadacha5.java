package by.array.ex3.main;

//Сортировка вставками. Место помещение очередного элемента в отсортированную часть 
// производить с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Zadacha5 {
	public static void main(String[] args) {

		Integer[] a;
		int n;
		int index;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array elements, n = ");
		while (!sc.hasNextInt()) {
			System.out.print("Enter an integer, n = ");
			sc.next();
		}

		n = sc.nextInt();
		a = new Integer[n];
		a[0] = (int) (Math.random() * 10);

		for (int i = 1; i < a.length; i++) {
			// do {
			a[i] = (int) (Math.random() * 30);
			// } while (a[i - 1] > a[i]); //Цикл do-while нужен для упорядовачивания
			// последовательности случвйных чисел
		}

		ArrayList<Integer> array = new ArrayList<>();

		Collections.addAll(array, a);

		System.out.println("Arraylist");
		System.out.println(array.toString());

		for (int i = 1; i < array.size(); i++) {

			index = bynarry(array, i);

			if (index >= 0) {

				array.add(index, array.get(i));
				array.remove(i + 1);
			}

		}

		System.out.println("New arrayList");
		System.out.println(array.toString());

	}

	public static int bynarry(ArrayList<Integer> array, int element) {

		int lowIndex = 0;
		int highIndex = element;
		int index = -1;

		while (lowIndex <= highIndex) {

			int mindIndex = lowIndex + (highIndex - lowIndex) / 2;

			if (array.get(element) > array.get(mindIndex)) {
				index = mindIndex;
				highIndex = mindIndex - 1;

			} else if (array.get(element) < array.get(mindIndex)) {
				index = mindIndex;
				lowIndex = mindIndex + 1;
				highIndex = element; // Закомментировать данную строку, если последовательность упорядочена
			} else if (array.get(element) == array.get(mindIndex)) {
				index = mindIndex + 1;
				break;
			}
		}
		return index;

	}

}
