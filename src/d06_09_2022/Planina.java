package d06_09_2022;

public class Planina {
	

//	2.Zadatak (za vezbanje)
//	(10 poena) Kreirati klasu ​Planina ​koja od privatnih atributa ima: 
//	ime planine 
//	naziv države u kojoj se nalazi 
//	visinu planine. 
//	a od javnih metoda: 
//	default-ni konstruktor i konstuktor koji postavlja sve parametre 
//	gettere i settere za sve atribute 

	private String imePlanine;
	private String drzava;
	private double visinaPlanine;
	
	public Planina() {
		super();
	}

	public Planina(String imePlanine, String drzava, double visinaPlanine) {
		super();
		this.imePlanine = imePlanine;
		this.drzava = drzava;
		this.visinaPlanine = visinaPlanine;
	}

	public String getImePlanine() {
		return imePlanine;
	}

	public void setImePlanine(String imePlanine) {
		this.imePlanine = imePlanine;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public double getVisinaPlanine() {
		return visinaPlanine;
	}

	public void setVisinaPlanine(double visinaPlanine) {
		this.visinaPlanine = visinaPlanine;
	}
	
	


}
