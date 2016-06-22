public class PartTimeWerknemer extends Werknemer{
	private int urenGewerkt;
	
	// Constructor
	public PartTimeWerknemer(final int ID, String voornaam, String achternaam, int leeftijd, double salaris, int urenGewerkt){
		super(ID, voornaam, achternaam, leeftijd, salaris);			// calling base constructor
		this.urenGewerkt = urenGewerkt;
	}
	
	// Properties - Get and Set for urenGewerkt
	public int GetUrenGewerkt(){
		return urenGewerkt;
	}
	
	public void SetUrenGewerkt(int aantalUur){
		urenGewerkt = aantalUur;
	}
	
	// return het totaal salaris van x aantal uur te werken
	public double GetWeekSalaris(int aantalUur){
		return this.GetSalaris() * (double)aantalUur;
	}
	
	// override methode salarisverhoging voor parttime werknemers
	public void Raise(int percentage){
		if(percentage > 5)
			System.out.println("\nERROR: Parttime werknemers kunnen maar een salarisverhoging krijgen van maximum 5%!");
		else
			super.Raise(percentage);
	}
}