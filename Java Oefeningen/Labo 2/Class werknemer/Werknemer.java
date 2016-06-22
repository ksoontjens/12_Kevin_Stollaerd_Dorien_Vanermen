public class Werknemer implements Betaalbaar{
	private String surname, lastname;
	private int age;
	private final int ID;
	private double salaris;
	private float RSZpercentage;
	
	// Constructor
	public Werknemer(final int ID, String surname, String lastname, int age, double salaris){
		this.surname = surname;
		this.lastname = lastname;
		this.age = age;
		this.ID = ID;
		this.salaris = salaris;
		RSZpercentage = 0.33f;
	}
	
	// Properties, getters and setters
	public double GetSalaris(){
		return salaris;
	}
	
	public String GetSurname(){
		return surname;
	}
	
	public String GetLastname(){
		return lastname;
	}
	
	// Opdracht 5: Write Set and Get for RSZ
	public void SetRSZ(float rsz){
		RSZpercentage = rsz;
	}
	
	public float GetRSZ(){
		return RSZpercentage;
	}
	
	// toString() method which returns 
	public String toString(){
		return "ID: " + ID + "\tName: " + surname + " " + lastname + "\tAge: " + age + "\tSalaris: " + salaris + "\tType werknemer: " + this.getClass().getName();
	}
	
	// Opdracht 2: verhoog het salaris
	public void Raise(int percentage){
		salaris += (salaris * ((double)percentage/100));
	}
	
	// Opdracht 9: implementeer methode betaal()
	public void Betaal(){
		System.out.println("Betaling salaris van: " + this.surname + " " + this.lastname + "\tSalaris: " + this.salaris);
	}
}