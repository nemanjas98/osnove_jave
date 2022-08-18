package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}},
//		{{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost
//		povećanje za koju treba povećati cenu. Ova funkcija treba da
//		menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//		a povratnu vrednost je cena proizvoda kada se uračuna popust.
//		Ova funkcije ne menja atribut cena. Smatrati da je parametar popust 
//		u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina 
//		da se proizvod šalje preko kurirske sluzbe. Funkcija je bez 
//		ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od 
//		njih pozvati svaku od definisanih funkcija.

		Proizvod p = new Proizvod();
		Proizvod q = new Proizvod();
		
		p.nazivProizvoda = ("Grand kafa");
		p.cenaProizvoda = 170;
		p.tezinaProizvoda = 100;
		
		p.stampaj();
		
		p.povecajCenu(50);
		System.out.println("Nova cena proizvoda: " + p.cenaProizvoda + 
				"rsd");
		
		p.vratiCenuSaPopustom(20);
		System.out.println("Cena sa popustom: " + p.vratiCenuSaPopustom(20)
		+ "rsd");
		
		System.out.println("Postarina za ovaj prozivod iznosi: " + 
		p.racunajPostarinu() + "rsd");
		
		q.nazivProizvoda = ("Banana");
		q.cenaProizvoda = (175.50);
		q.tezinaProizvoda = (210);
		
		System.out.println("");
		q.stampaj();
		
		q.povecajCenu(4.6);
		System.out.println("Nova cena proizvoda: " + q.cenaProizvoda + 
				"rsd");
		
		q.vratiCenuSaPopustom(0.1);
		
		System.out.println("Cena sa popustom: " + q.vratiCenuSaPopustom(0.1)
		+ "rsd");
		
		System.out.println("Postarina za ovaj prozivod iznosi: " + 
				q.racunajPostarinu() + "rsd");
		

	}

}
