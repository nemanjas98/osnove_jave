package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
	
//	Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

	String fullName;
	ArrayList<Sektor> sektori = new ArrayList<Sektor>();


	public Radnik(String fullName) {
		super();
		this.fullName = fullName;
	}



	public String getFullName() {
		return fullName;
	}



	public void setFullName(String fullName) {
		this.fullName = fullName;
	}



	public ArrayList<Sektor> getSektori() {
		return sektori;
	}



	public abstract double plataRadnika();
	public void zaposliUSektor(Sektor sektori) {
		this.sektori.add(sektori);
	};

}
