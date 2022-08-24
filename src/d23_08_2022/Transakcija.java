package d23_08_2022;

public class Transakcija {
//	Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
//		gettere i settere
//		konstruktore
//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije,
//		znaci da metoda prima parametar koji predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu,
//		u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
//		Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
//		a na drugi racun dodaje samo (trazena suma).
//		(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna

	String idTranskacije;
	Racun posiljalac;
	Racun primalac;
	
	public Transakcija(String idTranskacije, Racun posiljalac, Racun primalac) {
		this.idTranskacije = idTranskacije;
		this.posiljalac = posiljalac;
		this.primalac = primalac;
	}
	
	private double cenaProvizije (double visinaTransakcije) {
		if (visinaTransakcije < 4500) {
			return 45;
		}else{
			return 0.01 * visinaTransakcije;
		}
	}
	
	public void izvrsiTransakciju(double visinaTransakcije) {
		if (this.posiljalac.getTrenutnoStanje() < visinaTransakcije) {
			System.out.println("Neuspela transakcija, nemate dovoljno sredstava na racunu.");
		}else {
		this.posiljalac.promeniVrednost(this.posiljalac.getTrenutnoStanje() - this.cenaProvizije(visinaTransakcije)
										- visinaTransakcije);
			this.primalac.promeniVrednost(this.primalac.getTrenutnoStanje() + visinaTransakcije);
		}
		
	}
	
	public void print() {
		System.out.println("Racun sa: " + posiljalac.getFullName() + " - " + posiljalac.getBrojRacuna());
		System.out.println("Racun na: " + primalac.getFullName() + " - " + primalac.getBrojRacuna());
		System.out.println("");
	}

	
	
}
