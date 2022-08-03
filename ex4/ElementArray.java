package by.array.ex4.main;

public class ElementArray {

	private int a;
	private int b;

	public ElementArray(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public ElementArray() {

	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return a + " and " + b;
	}

}
