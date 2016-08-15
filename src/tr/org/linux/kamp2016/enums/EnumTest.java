package tr.org.linux.kamp2016.enums;

public class EnumTest {
	
	Day day;
	
	public EnumTest(Day day){
		this.day = day;
	}
	
	public void tellItLikeItIs(){
		
		switch(day){
		case MONDAY:
			System.out.println("Pazartesi iğrenç.");
			break;
		case FRIDAY:
			System.out.println("Ehehehehe :))");
			break;
		case SATURDAY: case SUNDAY:
			System.out.println("Haftasonları <3 Biz");
			break;
		default:
			System.out.println("Haftasonunu bekliyoruz :(");
			break;
		}
		
		
	}
	
	public static void main(String[] args){
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
			thirdDay.tellItLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellItLikeItIs();
	}

}
