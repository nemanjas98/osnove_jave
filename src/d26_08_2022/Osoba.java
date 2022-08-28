package d26_08_2022;

public class Osoba {
	
//	1.Zadatak
//	Kreirati klasu Osoba koja ima:
//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)
	
	String fullName;
	String jmbg;
	int godinaRodjenja;
	
	public Osoba() {
		super();
	}

	public Osoba(String fullName, String jmbg, int godinaRodjenja) {
		super();
		this.fullName = fullName;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;
	}



	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(int godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}
	
	public void print() {
		System.out.println("Puno ime: " + this.fullName + " - JMBG: " + this.jmbg + 
						" - Godina rodjenja: " + this.godinaRodjenja);
	}
	


}
