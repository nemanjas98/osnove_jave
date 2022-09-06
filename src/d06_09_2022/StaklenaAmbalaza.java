package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza{

//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flasa.
	
	int kaucijaZaFlasu;
	boolean placanjeKaucije;
	double osnovnaCena;
	
	public StaklenaAmbalaza() {
		super();
	}
	
	public StaklenaAmbalaza(String barkod, String naziv, double netoTezina, double brutoTezina) {
		super(barkod, naziv, netoTezina, brutoTezina);
	}

	public int getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}

	public void setKaucijaZaFlasu(int kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}

	public boolean isPlacanjeKaucije() {
		return placanjeKaucije;
	}

	public void setPlacanjeKaucije(boolean placanjeKaucije) {
		this.placanjeKaucije = placanjeKaucije;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	

	@Override
	public double cenaArtikla() {
		if (this.placanjeKaucije == true) {
			return this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
		}else {
			return this.osnovnaCena * 1.2;
		}
	}

	@Override
	public void print() {
		System.out.println("Kaucija za flasu: " + this.kaucijaZaFlasu + "rsd");
		System.out.println("Placanje kaucije: " + this.placanjeKaucije);
		System.out.println("Osnovna cena: " + this.cenaArtikla() + "rsd");
	}
	
	

	
}
