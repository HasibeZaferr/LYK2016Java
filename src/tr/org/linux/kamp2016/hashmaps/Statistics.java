package tr.org.linux.kamp2016.hashmaps;
import java.util.HashMap;
import java.util.Scanner;

import tr.org.linux.kamp2016.dicegameexample.*;
public class Statistics{

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		HashMap<Integer,Integer> table = new HashMap<Integer,Integer>();
		System.out.print("Please enter student number");
		int size = input.nextInt();
		generateRandomValues(table,size);
		printTable(table);
		System.out.println("mean = " + mean(table));
	}

	/* Fills 2D Table with random values between 0 and 100 */
	private static void generateRandomValues(HashMap<Integer,Integer> map, 
			int size) {
		// Your code starts here
		
		for(int i = 0; i < size;i++){
			int random = RandomTest.randomIntegerRandom(0, 100);
			map.put(i+1, random);
		}

		// Your code ends here
	}

	
	public static double mean(HashMap<Integer,Integer> map) {
		double answer = 0;
		// Your code starts here
		double sum = 0;
//		for(Integer key: map.keySet()){
//			sum += map.get(key);
//		}
		for(Integer value : map.values()){
			sum += value;
		}
		answer = sum/map.size();
		// Your code ends here
		return answer;
	}
	
	public static void printTable(HashMap<Integer,Integer> map){
		for(Integer i : map.keySet()){
			System.out.println("Student#" + i 
					+ " score: " + map.get(i) );
		}
	}
	
}
