package JavaBases;

public class SwitchCase {

	public static void main(String[] args) {

		int i=2;
		String day;
		
		switch(i){
		
		case 1:
			day="Monday";
			break;
		case 2:
			day="Tuesday";
			break;
		default:
		day="Invalid Date";
		break;		
		}
		System.out.println(day);

	}

}
