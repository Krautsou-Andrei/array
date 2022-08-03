package by.array.ex2.main;

//матрицу 10х20 заполнить случайными числами от 0 до 15. 
//Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.

public class Zadacha11 {
	public static void main(String[] args) {
		
		int[][] a = new int[10][20];
		int counterElement = 0;
		int counterLine = 0;
		int[] lineNumber;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 15);
				System.out.printf("%3d |", a[i][j]);
				if (a[i][j] == 5) {
					counterElement++;
				}

			}
			System.out.println();

			if (counterElement >= 3) {
				counterLine++;
			}
			counterElement = 0;
		}

		lineNumber = new int[counterLine];

		counterLine = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] == 5) {
					counterElement++;
				}

			}

			if (counterElement >= 3) {

				lineNumber[counterLine] = i + 1;
				counterLine++;
			}

			counterElement = 0;

		}

		System.out.println();
		
		if (lineNumber.length > 0) {

			System.out.println("Line number");

			for (int i = 0; i < lineNumber.length; i++) {

				System.out.printf("%3d |", lineNumber[i]);
			}
		} else {
			System.out.println("There are no line satisfying the condition");
		}
	}

}
