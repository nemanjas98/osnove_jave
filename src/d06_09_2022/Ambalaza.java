package d06_09_2022;

public abstract class Ambalaza {
	
//	1.Zadatak
//	Kreirati abstraktnu klasu Ambalaza koja ima:
//	barkod (primer: 328232-2823)
//	naziv artikla
//	neto tezinu
//	bruto tezinu
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere
//	metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//	abstraktnu metodu koja vraca cenu artikla
//	abstraktnu metodu stampaj
	
	protected String barkod;
	protected String naziv;
	protected double netoTezina;
	protected double brutoTezina;
	
	public Ambalaza() {
		super();
	}

	public Ambalaza(String barkod, String naziv, double netoTezina, double brutoTezina) {
		super();
		this.barkod = barkod;
		this.naziv = naziv;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}

	public String getBarkod() {
		return barkod;
	}

	public String getNaziv() {
		return naziv;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}
	
	public double tezinaPakovanja() {
		return this.brutoTezina - this.netoTezina;
	}
	
	public abstract double cenaArtikla();
	public abstract void print();
	
	

}
