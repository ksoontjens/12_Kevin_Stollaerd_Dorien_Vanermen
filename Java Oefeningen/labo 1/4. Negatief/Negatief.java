import java.lang.*;

public class Negatief{
	public static void main(String args[]){
		// Sla het getal op als een String; converteer dit eerst naar een binair getal en daarna terug naar een string
		String getal = Integer.toString(Integer.parseInt(args[0]), 2);
		// som van het geïnverteerde getal en 1, hiervan wordt 2 tot de macht van het aantal bits afgetrokken
		double result;				
		
		result = (Integer.parseInt(Invert(getal), 2) + 1) - Math.pow(2, getal.length());
		
		System.out.println("\nResultaat: " + result);
	}
	
	static String Invert(String arg){
		String nieuwGetal = "";
		
		for (int i = 0, n = arg.length(); i < n; i++){
			char c = arg.charAt(i);
			
			if(c == '1')
				nieuwGetal += '0';
			else 
				nieuwGetal += '1';
		}
		
		return nieuwGetal;
	}
}