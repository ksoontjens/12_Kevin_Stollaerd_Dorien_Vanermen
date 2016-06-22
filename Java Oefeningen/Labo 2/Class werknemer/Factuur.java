public class Factuur implements Betaalbaar{
	public int factuurNr;
	public double factuurBedrag;
	
	public Factuur(int factuurNr, double factuurBedrag){
		this.factuurNr = factuurNr;
		this.factuurBedrag = factuurBedrag;
	}
	
	public void Betaal(){
		System.out.println("Betaling factuur " + factuurNr + "\tTe betalen bedrag: " + factuurBedrag);
	}
}