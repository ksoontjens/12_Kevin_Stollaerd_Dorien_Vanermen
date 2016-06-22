public class StudentWerknemer extends PartTimeWerknemer{
	
	// Constructor
	public StudentWerknemer(int ID, String voornaam, String achternaam, int leeftijd, double salaris, int urenGewerkt){
		super(ID, voornaam, achternaam, leeftijd, salaris, urenGewerkt);
		this.SetRSZ(0.05f);
	}
}