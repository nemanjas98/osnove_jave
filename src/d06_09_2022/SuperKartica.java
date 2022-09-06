package d06_09_2022;

public class SuperKartica {
//	
//	Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)

	private String brojKartice;
	private String fullName;
	private int popust;
	
	public SuperKartica() {
		super();
	}

	public SuperKartica(String brojKartice, String fullName, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.fullName = fullName;
		this.popust = popust;
	}
	
	
	
	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}

	public void print() {
		System.out.println("Broj Kartice: " + this.brojKartice);
		System.out.println("Ime i prezime: " + this.fullName);
	}

}
