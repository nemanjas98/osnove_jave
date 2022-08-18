package d18_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
//		3. (ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
//			atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//			atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//			atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//			atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//			atribut za mod (hladi/greje)
//			metodu za stampu - stampa u formatu 
//			marka - mod - termperatura
//			metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//			30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//			metodu koja racuna koliko klima novca potrosi za mesec dana
//			Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//			Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//			Metoda vraca ukupnu cenu za taj mesec
//
//			U glavnom programu krairati objekat klase SmartAirConditioning i 
//			testirati sve metode.

		SmartAirConditioning c = new SmartAirConditioning();
		
		c.marka = "Samsung";
		c.potrosnjaH = 1;
		c.potrosnjaG = 2;
		c.temp = 21;
		c.mod = "hladi";
		
		
		c.print();
		System.out.println("Mesecna potrosnja: " + c.mesecnaPotrosnja() + "kW/h");
		System.out.println("Mesecni racun: " + c.potrosnjaNovac() + "rsd");
	}

}
