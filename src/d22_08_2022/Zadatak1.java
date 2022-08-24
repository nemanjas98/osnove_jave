package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.

		Z1_Autor a = new Z1_Autor("Nikola", "Nikolic");
		Z1_Knjiga k = new Z1_Knjiga("755-4219637-528", "Nikolina", 2010, a);
		k.print();
		
		Z1_Autor b = new Z1_Autor("Andjela", "Andjelic");
		Z1_Knjiga l = new Z1_Knjiga("575-1423769-825", "Andjeo", 2006, b);
		l.print();
		
		Z1_Autor c = new Z1_Autor("Jelena", "Jelic");
		Z1_Knjiga m = new Z1_Knjiga("557-1247396-258", "Jelen", 2003, c);
		m.print();
		

	}

}
