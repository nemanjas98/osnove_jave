package d15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
//		5. Metoda prima dva parametra N i karakter za stampu.
//		Metoda stampa N karaktera.
//		Ako se za N prosledi 5 i za karakter prosledi
//		npr kosa crta (/) stampa se
//		/ / / / /
//		Napomena: Metoda nista ne vraca.
		
		printChar(5, '$');


	}
	public static void printChar(int brojKaraktera, char karakter) {
		int i = 0;
		while (i < brojKaraktera) {
			System.out.print(karakter + " ");
			i++;
		}
	}

}
