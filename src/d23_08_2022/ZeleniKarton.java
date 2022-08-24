package d23_08_2022;

public class ZeleniKarton {
//	1. Zadatak
	
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
//
//		U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
	
	private String fullName;
	private String brojIndeksa;
	private String nazivPredmeta = "Uvod u C";
	private String fullNameProf = "Grozdan Grozdic";
	private int ocena;
	
	public ZeleniKarton() {
		
	}
	
	public ZeleniKarton(String fullName, String brojIndeksa, int ocena) {
		this.fullName = fullName;
		this.brojIndeksa = brojIndeksa;
		this.ocena = ocena;
	}
	
	
	
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}



	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}



	public String getFullNameProf() {
		return fullNameProf;
	}



	public void setFullNameProf(String fullNameProf) {
		this.fullNameProf = fullNameProf;
	}


	public String getFullName() {
		return fullName;
	}



	public String getBrojIndeksa() {
		return brojIndeksa;
	}



	public int getOcena() {
		return ocena;
	}
	
	

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean polozenIspit() {
		if (this.ocena > 5) {
			return true;
		}else {
			return false;
		}
	}
	
	public void print() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.fullName + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.fullNameProf);
		System.out.println("");
	}
	
}
