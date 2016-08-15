package tr.org.linux.kamp2016.triangleexample;

public class RightTriangle {

	/*
	 * File: RightTriangle.java ------------------- This file defines a simple
	 * class for representing right triangles.
	 */

	private int a = 1;
	private int b = 1;

	public RightTriangle(int a, int b) {
		// Your code starts here
		if (0 < a) {
			this.a = a;
		}
		if (0 < b) {
			this.b = b;
		}
		// Your code ends here
	}

	public int getA() {
		// Your code starts here
		return a;
		// Your code ends here
	}

	public void setA(int a) {
		// Your code starts here
		if (0 < a) {
			this.a = a;
		}
		// Your code ends here
	}

	public int getB() {
		// Your code starts here
		return b;
		// Your code ends here
	}

	public void setB(int b) {
		// Your code starts here
		if (0 < b) {
			this.b = b;
		}
		// Your code ends here
	}

	public int perimeter() {
		// Your code starts here
		return a + b + hypotenuse();
		// Your code ends here
	}

	public int hypotenuse() {
		// Your code starts here
		return (int)Math.hypot(a, b);
		// Your code ends here
	}

	public int area() {
		// Your code starts here
		return a * b / 2;
		// Your code ends here
	}
	
	@Override
	public String toString(){
		return " A: " + this.getA() + " B: " + this.getB() 
		+  " Hypotenuse:" + this.hypotenuse()+ " Area: "+  this.area() 
		+ " Perimeter: " + this.perimeter();
	}

}
