import java.lang.*;

public class GrootsteGetal{
	public static void main(String args[]){
		int a[] = {12, 34, 56, 78, 123, 234, 99, 88};
		int max = 0;
		
		for (byte i = 0; i < a.length; i++){
			if (a[i] > max)
				max = a[i];
		}
		
		System.out.println("\nHet grootste getal is: " + max);
	}
}