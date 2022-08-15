package d15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
//		7. (Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca
//		najmanji od ta 3.
//		U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

		int rezultat = najmanjiBroj(2, 150, 250);
		System.out.print("Najmanji broj je: " + rezultat);
	}

	public static int najmanjiBroj(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		}else if (b < a && b < c) {
			return b;
		}else if(c < a && c < b) {
		}
		return c;
		
	}
}
