package d05_09_2022;

public class Sektor {
	
//	Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor
	
	String nazivSektora;
	double plata;
	
	public Sektor(String nazivSektora, double plata) {
		super();
		this.nazivSektora = nazivSektora;
		this.plata = plata;
	}
	public String getNazivSektora() {
		return nazivSektora;
	}
	public double getPlata() {
		return plata;
	}
	
	

}
