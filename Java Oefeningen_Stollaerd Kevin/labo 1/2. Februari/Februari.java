import java.lang.*;

public class Februari{
	public static void main(String args[]){
		final byte START = 1;
		final byte END = 29;
		final byte END_OF_WEEK = 7;
		
		String dagen[] = new String[]{"zondag", "maandag", "dinsdag", "woensdag", "donderdag", "vrijdag", "zaterdag"};
		byte weekdag = 0;
		
		for (byte i = START; i < END; i++){
			System.out.println(dagen[weekdag] + " " + i + " februari");
			weekdag++;
			
			if (weekdag == END_OF_WEEK)
				weekdag = 0;
		}
		
	}
}