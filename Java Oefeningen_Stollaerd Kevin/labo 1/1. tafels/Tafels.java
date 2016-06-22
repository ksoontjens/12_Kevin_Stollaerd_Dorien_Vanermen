import java.lang.*;

public class Tafels{
	public static void main(String args[]){
		final byte START = 1;
		final byte END = 10;
		
		for (byte a = START; a < END; a++){
			for(byte b = START; b < END; b++){
				System.out.println(a + " * " + b + " = " + a*b);
			}
			
			System.out.println();
		}
	}
}