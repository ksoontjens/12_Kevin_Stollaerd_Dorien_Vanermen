import java.lang.*;

public class WerknemerOef{
	public static void main(String args[]){
		// Opdracht 1: maak vier objecten van het type werknemer
		Werknemer werknemers[] = new Werknemer[]{
			new Werknemer(1, "Kevin", "Stollaerd", 20, 30.0),
			new Werknemer(2, "Noa", "Sangulin", 19, 25.0),
			new Werknemer(3, "Rani", "Ghesqière", 19, 32.0),
			new Werknemer(4, "Ruben", "Siebens", 20, 31.0)
		};
		
		// Opdracht 3: Maak twee objecten van het type parttimewerknemer
		PartTimeWerknemer partTimeWerknemers[] = new PartTimeWerknemer[]{
			new PartTimeWerknemer(5, "Tim", "Boel", 19, 29.0, 25),
			new PartTimeWerknemer(6, "Lopke", "Hemelaer", 19, 22.0, 17)
		};
		
		// Opdracht 7: StudentWerknemer
		StudentWerknemer studentWerknemers[] = new StudentWerknemer[]{
			new StudentWerknemer(8, "Toon", "De Jonge", 19, 17.0, 12),
			new StudentWerknemer(9, "Katrien", "Smet", 19, 15.0, 9)
		};
		
		// Opdracht 10: Factuur
		Factuur facturen[] = new Factuur[]{
			new Factuur(1, 35.0),
			new Factuur(2, 107.0),
			new Factuur(3, 55.64),
			new Factuur(4, 84.0),
			new Factuur(5, 92.36)
		};
		
		// Opdracht 2: verhoog het salaris van 2 werknemers
		for(byte i = 0; i < 2; i++){
			werknemers[i].Raise(10);
		}
		
		// Maak een beetje ruimte in het cmd venster
		System.out.println("\n\t==================\n\tDisplay werknemers\n\t==================\n");
		
		// Foreach loop, geef alle werknemers weer met hun eigen toString() methode
		for(Werknemer wn : werknemers){
			System.out.println(wn.toString());
		}
		
		// Maak een beetje ruimte in het cmd venster
		System.out.println("\n\t==================\n\tDisplay parttime werknemers\n\t==================\n");
		
		// Foreach loop, geef alle partTimeWerknemers weer met de toString() methode van Werknemer
		for(PartTimeWerknemer wn : partTimeWerknemers){
			System.out.println(wn.toString());
		}
		
		// Opdracht 4: raise partTimeWerknemers
		partTimeWerknemers[0].Raise(4);
		System.out.println("\n\t==================\n\tOpdracht 4: Raise\n\t==================\n\n" + partTimeWerknemers[0].GetSurname() + " " + partTimeWerknemers[0].GetLastname() + "s nieuw salaris: " + partTimeWerknemers[0].GetSalaris());
		partTimeWerknemers[1].Raise(7);
		
		// Opdracht 6: Get and SetRSZ
		System.out.println("\n\t==================\n\tOpdracht 6: RSZ\n\t==================\n");
		System.out.println("Werknemer:\nRSZ van " + werknemers[0].GetSurname() + ": " + werknemers[0].GetRSZ());
		werknemers[0].SetRSZ(0.44f);
		System.out.println("Nieuwe RSZ van " + werknemers[0].GetSurname() +  ": " + werknemers[0].GetRSZ());
		
		System.out.println("\nParttime Werknemer:\nRSZ van " + partTimeWerknemers[0].GetSurname() + ": " + partTimeWerknemers[0].GetRSZ());
		partTimeWerknemers[0].SetRSZ(0.35f);
		System.out.println("Nieuwe RSZ van " + partTimeWerknemers[0].GetSurname() + ": " + partTimeWerknemers[0].GetRSZ());
		
		// Opdracht 7: Controleer RSZ studentWerknemers
		System.out.println("\n\t==================\n\tOpdracht 7: RSZ Student\n\t==================\n");
		
		for (StudentWerknemer wn : studentWerknemers){
			System.out.println(wn.toString());
		}
		
		for (byte i = 0; i < studentWerknemers.length; i++){
			System.out.println("\nStudent Werknemer:\nRSZ van " + studentWerknemers[i].GetSurname() + ": " + studentWerknemers[0].GetRSZ());
		}
		
		// Opdracht 9: Methode Betaal
		System.out.println("\n\t==================\n\tOpdracht 9: Betaal\n\t==================\n");
		System.out.println("Betaling werknemers:\n");
		
		for(Werknemer wn : werknemers){
			wn.Betaal();
		}
		
		System.out.println("\nBetaling parttime werknemers:\n");
		for(PartTimeWerknemer wn : partTimeWerknemers){
			wn.Betaal();
		}
		
		System.out.println("\nBetaling student werknemers:\n");
		for(StudentWerknemer wn : studentWerknemers){
			wn.Betaal();
		}
		
		// Opdracht 10: Facturen
		System.out.println("\n\t==================\n\tOpdracht 10: Facturen\n\t==================\n");
		
		for(Factuur f : facturen){
			f.Betaal();
		}
		
		
	}
}