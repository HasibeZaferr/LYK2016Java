package tr.org.linux.kamp2016.dicegamearrayexample;

public class DiceArrayGame  {
	public static void main (String args[]) {
		// create two Die objects
		int[] playerGroup = new int[10];
		
		for(int i=0;i<playerGroup.length;i++){
			Dice zar = new Dice();
			zar.roll();
			playerGroup[i] = zar.getFaceValue();
			System.out.println("Player#" + (i+1) + " : " + playerGroup[i]);
		}
		
		int max = 0;
		
		int[] c = new int[10];
		int counter = 0;
		
		for(int i=0; i < playerGroup.length;i++){
			if(playerGroup[i]>=max){
				max = playerGroup[i];
			}
		}
		
		for(int i=0; i < playerGroup.length;i++){
			if(playerGroup[i]==max){
				max = playerGroup[i];
				c[counter] = i+1;
				counter++;
			}
		}
		
		System.out.print(max+" ile kazanan: ");
		for(int i = 0; i < counter;i++){		
		
		System.out.print( "Player#"+ c[i] + " ");
		}

	}
	
	
}
