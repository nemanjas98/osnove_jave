package d22_08_2022;

public class Z1_Knjiga {
//	Kreirati klasu Autor koja ima
//	-ime i prezime
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu:
//	(ime autora) (prezime autora)
//
//	Kreirati klasu Knjiga koji ima:
//	-ISBN
//	-naziv
//	-godina izdanja
//	-autor
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//	(ISBN)
//	(naziv) - (godina izdanja)
//	autor: (ime autora) (prezime autora) 
//
//		U glavnom programu napraviti vise autora sa vise knjiga.
	
	private String isbn;
	private String naziv;
	private int godinjaIzdanja;
	private Z1_Autor autor;
	
	public Z1_Knjiga (String isbn, String naziv, int godinaIzdanja, Z1_Autor autor) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinjaIzdanja = godinaIzdanja;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getGodinjaIzdanja() {
		return godinjaIzdanja;
	}

	public Z1_Autor getAutor() {
		return autor;
	}
	
	public void print() {
		System.out.println("ISBN: " + this.isbn);
		System.out.println("Naziv: " + this.naziv + " - " + "Godina izdavanja: " + this.godinjaIzdanja);
		System.out.print("Autor: ");
		autor.print();
		System.out.println("");
	}
	
}
