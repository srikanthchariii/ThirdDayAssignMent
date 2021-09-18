package com.app.venkey;

class NewArithmetic {
	public float add_values(float val1, float val2) {
		return val1 + val2;
	}

	public float sub_values(float val1, float val2) {
		return val1 - val2;
	}
}

class ArithmeticAdapter {
	private NewArithmetic obj;

	public ArithmeticAdapter() {
		obj = new NewArithmetic();
	}

	public int add_adptr(int val1, int val2) {
		return (int) obj.add_values(val1, val2);
	}

	public int sub_adptr(float val1, float val2) {
		return (int) obj.sub_values(val1, val2);
	}
}

class Arithmetic {
	public void add(int val1, int val2) {
		System.out.println("Added Result:" + new ArithmeticAdapter().add_adptr(val1, val2));
	}

	public void sub(int val1, int val2) {
		System.out.println("Subtraction Result:" + new ArithmeticAdapter().sub_adptr(val1, val2));
	}
}

public class AdapterCompositionExample {
	public static void main(String[] args) {
		Arithmetic obj = new Arithmetic();

		obj.add(23, 42);
		obj.sub(46, 21);
	}

}