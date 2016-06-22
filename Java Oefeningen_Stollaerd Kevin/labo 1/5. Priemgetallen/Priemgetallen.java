import java.lang.*;

public class Priemgetallen{
	public static void main(String args[]){
		String primeNumbers = "";
		
		for (byte i = 3; i < 100; i++){
			byte counter = 0;
			
			// check for the current index i if it's divisble by itself and 1
			// we also need to check if it's divisble by any other number between those two
			for (byte currentNumber = i; currentNumber >= 1; currentNumber--){
				if (i % currentNumber == 0)
					// If this is the case then we add 1 to the counter
					++counter;
			}
			
			// Meaning it's only divisble by 1 and itself
			// we can say it's a prime
			if (counter == 2)
				primeNumbers += i + " ";
		}
		
		System.out.println("\nResultaat: " + primeNumbers);
    }
}