package d25_08_2022;

public class Ispit {

	
	private String nazivPredmeta;
	private int ocena;
	private String fullNameProf;
	
	public Ispit() {
	}

	public Ispit(String nazivPredmeta, int ocena, String fullNameProf) {
		
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.fullNameProf = fullNameProf;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getFullNameProf() {
		return fullNameProf;
	}

	public void setFullNameProf(String fullNameProf) {
		this.fullNameProf = fullNameProf;
	}
	
	public boolean polozenIspit() {
		if (this.ocena >= 6 && this.ocena <=10) {
			return true;
		}
		return false;
	}
	
	public void print() {
		System.out.println(this.nazivPredmeta + " - " + this.fullNameProf + " - " + this.ocena);
	}
	
	
	
	
}
