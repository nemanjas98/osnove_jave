package miniProjekat;

public class Player {

//	Kreirati klasu Player koja ima:
//	ime i prezime
//	gettere i settere
//	konstuktore
//	metodu print, koja stampa ime i prezime igraca

	String fullName;

	public Player() {
		super();
	}

	public Player(String fullName) {
		super();
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void print() {
		System.out.println(this.fullName);
	}

}
