package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za izabranu temperaturu 
//			atribut za mod (hladi/greje) - string
//			metodu za stampu (proizvoljno)
//			metodu koja vraca informaciju da li je napolju veca
//			temperatura od one na koju je klima postavljena.
//			Metoda kao parametar prima temperaturu koja je napolju.
//
//
//			U glavnom programu kreirati minimum 2 objekta klase
//			SmartAirConditioning i za svaki od njih pozvati metode

		SmartAirConditioning klima = new SmartAirConditioning();
		SmartAirConditioning klima2 = new SmartAirConditioning();

		klima.marka = ("Samsung");
		klima.izabranaTemp = 23;
		klima.mod = ("hladi");

		klima.print();
		boolean spoljasnjaTemp = klima.compare(40);
		if (spoljasnjaTemp == true) {
			System.out.println("Napolju je veca temperatura");
		} else {
			System.out.println("Napolju je manja temperatura");
		}

		klima2.marka = ("Fox");
		klima2.izabranaTemp = 29;
		klima2.mod = ("greje");

		System.out.println("");
		klima2.print();
		spoljasnjaTemp = klima2.compare(17);
		if (spoljasnjaTemp == true) {
			System.out.println("Napolju je veca temperatura");
		} else {
			System.out.println("Napolju je manja temperatura");
		}

	}

}
