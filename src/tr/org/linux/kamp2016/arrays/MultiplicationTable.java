package tr.org.linux.kamp2016.arrays;

public class MultiplicationTable {
	public static void main(String args[]){
		arrayToPrint(initializeMultiplicationTable(5));		
	}
	
	//Initializes multiplication table with respect to n
	public static int[][] initializeMultiplicationTable(int n){
		int[][] matrices = new int[n][n];
		
		for(int j= 0; j < matrices.length/*n*/;j++){
			for(int k = 0; k < matrices[j].length;k++){
				matrices[j][k] = (j+1)*(k+1);
			}
		}		
		
		return matrices;
	}
	
	public static void arrayToPrint(int[][] matrices){
	
		for(int j= 0; j < matrices.length/*n*/;j++){
			for(int k = 0; k < matrices[j].length;k++){
				System.out.printf("%-5d",matrices[j][k]);
			}
			System.out.println();
		}	
		
	}
	
	
}
