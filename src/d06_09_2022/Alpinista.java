package d06_09_2022;

public class Alpinista extends Planinar{
	

//	(20 poena) Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. 
//	Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario 
//	(celobrojna vrednost) i poeni se mogu menjati. Alpinista može da 
//	savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500
//	pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu: 
//		Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni) 

	
	private int brojPoena;
	


	public Alpinista(String jcik, String fullName, int brojPoena) {
		super(jcik, fullName);
		this.brojPoena = brojPoena;
	}

	
	public int getBrojPoena() {
		return brojPoena;
	}



	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}



	@Override
	public void print() {
		System.out.println("Alpinista: , id: " + this.jcik + " | ime: " + this.fullName 
            	+ " | Broj poena: " + this.brojPoena);
		
	}

	@Override
	public double vratiClanarinu() {
		return 1500 - (this.brojPoena * 50);
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (planina.getVisinaPlanine() < 4000) {
			return true;
		}else {
			return false;
		}
	}

	
	
	
}
