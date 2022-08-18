package d18_08_2022;

public class SmartAirConditioning {
	
//	3. (ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//		atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
//		atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
//		atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//		atribut za mod (hladi/greje)
//		metodu za stampu - stampa u formatu 
//		marka - mod - termperatura
//		metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
//		30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
//		metodu koja racuna koliko klima novca potrosi za mesec dana
//		Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
//		Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
//		Metoda vraca ukupnu cenu za taj mesec
//
//		U glavnom programu krairati objekat klase SmartAirConditioning i 
//		testirati sve metode.

	String marka;
	int potrosnjaH;
	int potrosnjaG;
	int temp;
	String mod;
	
	public void print() {
		System.out.println(this.marka + " - " + this.mod + " - " + this.temp + "C");
	}
	
	public int mesecnaPotrosnja() {
		if (this.mod == "hladi") {
			return 30 * 15 * this.potrosnjaH;
		}else {
			return 30 * 15 * this.potrosnjaG;
		}
	}
	
	public int potrosnjaNovac() {
		int ukupnaPotrosnja = this.mesecnaPotrosnja();
		int ukupnaPotrosnja2 = 0;
		if (ukupnaPotrosnja > 350) {
			while (ukupnaPotrosnja > 350) {
				ukupnaPotrosnja--;
				ukupnaPotrosnja2++;
			}
			return ukupnaPotrosnja = (ukupnaPotrosnja * 6) + (ukupnaPotrosnja2 * 9);
		}
		else {
			return ukupnaPotrosnja = ukupnaPotrosnja * 6;
		}
	}
}

