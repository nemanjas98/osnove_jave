package d23_08_2022;

public class Racun {
//	2. Zadatak
	
//	Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera za stanje na racunu
//		metodu koja menja stanje na racunu za prosledjenu vrednost
//		(stanje na racunu ne moze da bude manje od nule)
//		metodu koja stampa podatke o racunu u formatu:
//		Ime i prezime  -  broj racuna
//		stanje na racunu je (trenutno stanje) rsd.

	private String brojRacuna;
	private String fullName;
	private double trenutnoStanje;
	
	
	
	public Racun(String brojRacuna, String fullName, double trenutnoStanje) {
		this.brojRacuna = brojRacuna;
		this.fullName = fullName;
		this.trenutnoStanje = trenutnoStanje;
	}
	
	public String getBrojRacuna() {
		return brojRacuna;
	}
	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getTrenutnoStanje() {
		return trenutnoStanje;
	}
	
	public void promeniVrednost(double prosledjenaVrednost) {
		if (prosledjenaVrednost < 0) {
	}else {
		this.trenutnoStanje = prosledjenaVrednost;
	}
	}
	
	public void print() {
		System.out.println(this.fullName + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je: " + this.trenutnoStanje + "rsd");
	}
	
}
