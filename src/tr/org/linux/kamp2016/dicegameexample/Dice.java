package tr.org.linux.kamp2016.dicegameexample;

public class Dice {

	private int faceValue;

	//constructor
	public Dice(){
		// Your code starts here
			faceValue = 1;
		// Your code ends here
	}

	//roll the die 
	public void roll(){
		// Your code starts here
		
		faceValue = 1+ (int)((Math.random()*6));
		// Your code ends here		
	}

	//get the face value
	public int getFaceValue(){
		// Your code starts here
		return faceValue;
        // Your code ends here
	}	


}
