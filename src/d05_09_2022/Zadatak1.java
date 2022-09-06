package d05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		1. Zadatak  
//		Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor
//
//		Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//		Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, 
//		postaviti sektore u kojima rade i ispisati platu za svakog

		Sektor prodaja = new Sektor("Prodaja", 135116);
		Sektor odrzavanje = new Sektor("Odrzavanje", 33360);
		Sektor logistika = new Sektor("Logistika", 41000);
		Sektor menadzment = new Sektor("Menadzment", 90120);
		Sektor hR = new Sektor("HR", 71482.57);
		Sektor nabavka = new Sektor("Nabavka", 34000);
		Magacioner magacioner = new Magacioner("Milan Milanovic");
		Menadzer menadzer = new Menadzer("Nikola Nikolic");
		magacioner.zaposliUSektor(logistika);
		magacioner.zaposliUSektor(odrzavanje);
		magacioner.zaposliUSektor(nabavka);
		menadzer.zaposliUSektor(prodaja);
		menadzer.zaposliUSektor(menadzment);
		menadzer.zaposliUSektor(hR);

		System.out.println("Ime i prezime: " + magacioner.getFullName());
		System.out.println("Zaposljen u sledecim sektorima: ");
		for (int i = 0; i < magacioner.sektori.size(); i++) {
			System.out.print(magacioner.sektori.get(i).nazivSektora + ", ");
		}
		System.out.println(" ");
		double plata2 = Math.round(magacioner.plataRadnika() * 100.0) / 100.0;
		System.out.println("Plata: " + plata2 + "rsd");
		System.out.println("-------------------------------");
		System.out.println("Ime i prezime: " + menadzer.getFullName());
		System.out.println("Zaposljen u sledecim sektorima: ");
		for (int i = 0; i < menadzer.sektori.size(); i++) {
			System.out.print(menadzer.sektori.get(i).nazivSektora + ", ");
		}
		System.out.println(" ");
		plata2 = Math.round(menadzer.plataRadnika() * 100.0) / 100.0;
		System.out.println("Plata: " + plata2 + "rsd");

	}

}
