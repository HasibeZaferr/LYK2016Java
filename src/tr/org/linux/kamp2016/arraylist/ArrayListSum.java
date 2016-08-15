package tr.org.linux.kamp2016.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while(true){
			System.out.print("Enter a number to sum/0 to quit: ");
			int i = input.nextInt();
			if(i == 0) break;
			arrayList.add(i);
		}
		
		System.out.println("Sum: " + sumArrayList(arrayList));
	}




public static int sumArrayList(ArrayList<Integer> arrayList) {
	int sum = 0;
	
	for(Integer i : arrayList){
		sum += i;
	}	
//	for(int i = 0; i < arrayList.size();i++){
//		sum += arrayList.get(i);
//	}
	
	return sum;
}
}
