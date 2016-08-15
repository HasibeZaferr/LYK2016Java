package tr.org.linux.kamp2016.triangleexample;

import java.util.Random;

/*
 * Test for RightTriangle Class
 * Creates a number of random right triangles and displays the maximum area and perimeter
 */
public class RightTriangleTest{

	public static void main(String args[]) {
		
		for (int i = 0; i < 10; i++) {
			int a = randomIntegerRandom(1, 50);
			int b = randomIntegerRandom(1, 50);
			

			RightTriangle r = new RightTriangle(a, b);
			System.out.println( (1+i)+ "-"+r);
		}
		
		for (int i = 0; i < 10; i++) {
			
			int a = randomIntegerRandom(1, 100);
			int b = randomIntegerRandom(1, 100);
			
			RightTriangle r = new RightTriangle(a, b);
			
			System.out.println( (1+i)+ "-" 
					+ r);
			
		}



	}
	
	public static int randomIntegerRandom(int min, int max){
		Random rgen = new Random();
		int range = Math.abs(max - min)+1;
		int random = min+rgen.nextInt(range);
		
		return random;
	}
}
