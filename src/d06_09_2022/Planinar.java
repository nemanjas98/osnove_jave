package d06_09_2022;

public abstract class Planinar {
	
//	(15 poena) Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima: 
//		jedinstveni celobrojni identifikacioni broj
//		ime i prezime 
//		Dok od javnih metoda: 
//		konstruktor koji postavlja sve atribute klase. 
//		gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije
//				tj. posle njihovog postavljanja u konstruktoru)
//		apstraktnu metodu štampaj
//		apstraktnu metodu koja vraca clanarinu planinara
//		apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar
//		upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina. 

	protected String jcik;
	protected String fullName;
	
	public Planinar(String jcik, String fullName) {
		super();
		this.jcik = jcik;
		this.fullName = fullName;
	}

	public String getJcik() {
		return jcik;
	}

	public String getFullName() {
		return fullName;
	}
	
	public abstract void print();
	public abstract double vratiClanarinu();
	public abstract boolean uspesanUspon(Planina planina);
}
