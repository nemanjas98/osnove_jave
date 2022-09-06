package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
	
//	Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu
//		metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) 
//		koju treba izbaciti
//		privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao
//		parametar prima popust. 
//		metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), 
//		kao parametar funkcije se prima Super karticu iz koje se cita popust.

	private ArrayList<Ambalaza> ambalaza = new ArrayList<Ambalaza>();
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.ambalaza.add(ambalaza);
	}
	
	public void izbaciAmbalazu (String barkod) {
		for (int i = 0; i < this.ambalaza.size(); i++) {
			if (this.ambalaza.get(i).getBarkod().equals(barkod)) {
				this.ambalaza.remove(i);
			}
		}
	}
	
	private double cenaSaPopustom(int popust) {
		double suma = 0;
		int c = 1;
		for (int i = 0; i < this.ambalaza.size(); i++) {
			suma += this.ambalaza.get(i).cenaArtikla();
			c++;
		}
		return suma - (c * popust);
	}
	
	public double ukupnaCenaKorpe(SuperKartica s) {
		double suma = 0;
		for (int i = 0; i < this.ambalaza.size(); i++) {
			suma += this.ambalaza.get(i).cenaArtikla();
		}
		if (s.getPopust() > suma) {
			return 0;
		}else {
			return suma - s.getPopust();
		}
			
	}

}
