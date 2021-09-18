package com.app.venkey;

class NewArithmetic1 {
	public float add_values(float val1, float val2) {
		return val1 + val2;
	}

	public float sub_values(float val1, float val2) {
		return val1 - val2;
	}
}

class ArithmeticAdapter1 extends NewArithmetic1 {
	public int add_adptr(int val1, int val2) {
		return (int) add_values(val1, val2);
	}

	public int sub_adptr(float val1, float val2) {
		return (int) sub_values(val1, val2);
	}
}

class Arithmetic1 {
	public void add(int val1, int val2) {
		System.out.println("Added Result:" + new ArithmeticAdapter().add_adptr(val1, val2));
	}

	public void sub(int val1, int val2) {
		System.out.println("Subtraction Result:" + new ArithmeticAdapter().sub_adptr(val1, val2));
	}
}

public class AdapterInheritanceExample {
	public static void main(String[] args) {
		Arithmetic1 obj = new Arithmetic1();

		obj.add(23, 42);
		obj.sub(46, 21);
	}

}