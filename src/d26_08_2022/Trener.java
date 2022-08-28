package d26_08_2022;

public class Trener extends Osoba{
//	
//	Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.


	int godineIskustva;
	String tipTrenera;
	
	
	
	public Trener(int godineIskustva, String tipTrenera) {
		super();
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}



	public void print() {
		super.print();
		System.out.println("Godine iskustva: " + this.godineIskustva + " - Tip: " + this.tipTrenera);
	}
	
}
