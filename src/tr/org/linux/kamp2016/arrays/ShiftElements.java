package tr.org.linux.kamp2016.arrays;

public class ShiftElements {
	public static void main(String args[]){
		int[] erey = new int[10];
		for(int i = 0; i < erey.length;i++){
			erey[i] = i;
		}
		
		for(int i = 0; i < erey.length;i++){
			System.out.print(erey[i] + " ");
		}
		
		int temp;
		 for(int i = erey.length-1; i>=1; i--){

		     temp = erey[i];
		     erey[i] = erey[i-1];
		     erey[i-1] = temp;

		 }
		 System.out.println();
		 
			for(int i = 0; i < erey.length;i++){
				System.out.print(erey[i] + " ");
			}
			
		
	}
}
