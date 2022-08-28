package d25_08_2022;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

	ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	private String brojIndeksa;
	private String fullName;
	private String tipStudija;

	public Student() {

	}

	public Student(String brojIndeksa, String fullName, String tipStudija) {

		this.brojIndeksa = brojIndeksa;
		this.fullName = fullName;
		this.tipStudija = tipStudija;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public String getNazivPredmeta() {
		return ispiti.get(0).getNazivPredmeta();
	}

	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}

	public int prosek() {
		int suma = 0;
		int counter = 0;
		for (int i = 0; i < this.ispiti.size(); i++) {
			if (this.ispiti.get(i).getOcena() > 5) {
				suma = suma + this.ispiti.get(i).getOcena();
				counter++;
			}
		}
		return suma = suma / counter;
		
	}
	
//	metodu stampaj koja stampa u formatu:
//		(broj indeksa) - (ime i prezime) - (tip studija)
//		Predmeti:
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		(naziv predmeta) - (profesor) - (ocena)
//		Prosecna ocena: (prosecna ocena)

		public void print() {
			System.out.println(this.brojIndeksa + " - " + this.fullName + " - " + this.tipStudija);
			System.out.println("Predmeti: ");
			for (int i = 0; i < this.ispiti.size(); i++) {
				System.out.println(this.ispiti.get(i).getNazivPredmeta() + " - " + 
								this.ispiti.get(i).getFullNameProf() + " - " + this.ispiti.get(i).getOcena());
			}
			System.out.println("Prosecna ocena: " + this.prosek());
		}

}
