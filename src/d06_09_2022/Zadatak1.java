package d06_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		U glavnom programu kreirati jednu Korpu i
//		u nju dodati nekoliko Ambalaza razlicitih tipova
//		i istestirati sve metode i ispisati ukupnu cenu sa popustom.

		SuperKartica batman = new SuperKartica("420840", "NS", 500);
		Korpa k = new Korpa();
		
		StaklenaAmbalaza s = new StaklenaAmbalaza("120-1000", "Coca Cola", 0.25, 0.80);
		s.setKaucijaZaFlasu(50);
		s.setPlacanjeKaucije(true);
		s.setOsnovnaCena(100);
		System.out.println(s.getNaziv());
		s.print();
		k.dodajAmbalazu(s);
		
		Tetrapak t = new Tetrapak("1000-69", "Nectar Family Ananas", 1, 1.2);
		t.setOsnovnaCena(100);
		t.setReciklaza(false);
		System.out.println("----------");
		System.out.println(t.getNaziv());
		t.print();
		k.dodajAmbalazu(t);
		
		StaklenaAmbalaza s1 = (new StaklenaAmbalaza("150-150", "Pepsi", 1.5, 1.9));
		s1.setOsnovnaCena(150);
		System.out.println("----------");
		System.out.println(s1.getNaziv());
		s1.print();
		k.dodajAmbalazu(s1);
		
		Tetrapak t1 = (new Tetrapak("741-555", "Alpsko mleko", 2.0, 2.2));
		t1.setOsnovnaCena(370);
		t1.setReciklaza(true);
		System.out.println("----------");
		System.out.println(t1.getNaziv());
		t1.print();
		k.dodajAmbalazu(t1);
		
		System.out.println("----------");
		System.out.println("Ukupna cena sa popustom je: " + 
							Math.round(k.ukupnaCenaKorpe(batman) * 100.0) / 100.0 + "rsd");
		
		
	}

}
