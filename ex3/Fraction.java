package by.array.ex3.main;

public class Fraction {

	private int numerator;
	private int denominator;
	private double fraction;
	

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public double getFraction() {
		return fraction;
	}
	
	
	
	@Override
	public String toString () {
		return(" " + numerator + "/" + denominator + " ");
	}

}
