package d06_09_2022;

import java.util.ArrayList;

public class PlaninarskiDom {
	
//	(25 poena) Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute: 
//		naziv doma 
//		godinu kada je osnovan. 
//		članove doma koji su planinari (klasa vodi računa o nizu) 
//		Dok od javnih: 
//		default-ni konstuktor i konstuktor koji postavlja sve parametre 
//		gettere i settere koji su potrebni 
//		metodu učlani planinara, koja dodaje planinara u niz 
//		metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu 
//		(metoda za parametar prima Planinu za koju se proverava informacija) 
//		metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju 
//		metodu koja štampa podatke o domu i o svim članovima doma
//		metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
//		(10 poena) U glavnom programu kreirati jedan planinarski dom, i u njemu 
//		učlaniti nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3), 
//		i istestirati svaku od metoda.

	private String nazivDoma;
	private int godinaOsnivanja;
	private ArrayList<Planinar> p = new ArrayList<Planinar>();
	
	public PlaninarskiDom() {
		super();
	}

	public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
		super();
		this.nazivDoma = nazivDoma;
		this.godinaOsnivanja = godinaOsnivanja;
	}

	public String getNazivDoma() {
		return nazivDoma;
	}

	public void setNazivDoma(String nazivDoma) {
		this.nazivDoma = nazivDoma;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public void uclaniPlaninara (Planinar p) {
		this.p.add(p);
	}
	
	public int brojUspesnih(Planina planina) {
		int c = 0;
		for (int i = 0; i < this.p.size(); i++) {
			if (this.p.get(i).uspesanUspon(planina) == true) {
				c++;
			}
		}
		return c;
	}
	
	public void izbaciPlaninara (String jcik) {
		for (int i = 0; i < this.p.size(); i++) {
			if(jcik.equals(this.p.get(i).jcik)) {
				this.p.remove(i);
			}
		}
	}
	
	public void print() {
		System.out.println("Naziv doma: " + this.nazivDoma + " | Godina osnivanja: " + this.godinaOsnivanja);
		System.out.print("Clanovi doma: ");
		for (int i = 0; i < this.p.size(); i++) {
			System.out.print(this.p.get(i).fullName + ", ");
		}
		System.out.println("");
	}
	
	public double mesecnaClanarina() {
		double suma = 0;
		for (int i = 0; i < this.p.size(); i++) {
			suma = suma + this.p.get(i).vratiClanarinu();
		}
		return suma;
	}
	
}
