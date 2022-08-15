package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
//		Zadatak
//		Napisati metodu koja stampa podatke o korisniku u formatu:
//		JMBG: [jmbg]
//		Ime: [ime]
//		Prezime: [prezime]
//		God. rodjenja: [god]
//		Aktivan: [true/false]
//		Metoda prima jmbg, ime, prezime, god rodjenja
//		i da li je aktivan kao parametre metode.Metoda nista ne vraca.

		personalInfo(1010987735111L, "Nikola", "Nikolic", 2000, true);

	}

	public static void personalInfo(long jmbg, String ime,
			String prezime, int godRodjenja, boolean aktivnost) {

		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. Rodjenja: " + godRodjenja);
		System.out.println("Aktivan: " + aktivnost);
	}
}
