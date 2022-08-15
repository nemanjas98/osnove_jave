package d15_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		1. Napisati metodu stampajVrednostZa10Vecu
//		u kojoj se stampa prosledjena vrednost za 10 veca.
//		Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

		
		stampajVrednostZa10Vecu(15);
		System.out.println(stampajVrednostZa10Vecu(15));
		
		stampajVrednostZa10Vecu(15.5);
		System.out.println(stampajVrednostZa10Vecu(15.5));
		
		stampajVrednostZa10Vecu(10);
		System.out.println(stampajVrednostZa10Vecu(10));
		
	}
	public static double stampajVrednostZa10Vecu (double broj1) {
		return broj1 + 10;
	}
}
