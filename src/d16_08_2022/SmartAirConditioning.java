package d16_08_2022;

public class SmartAirConditioning {

//	Kreirati klasu SmartAirConditioning koja ima:
//	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//	atribut za izabranu temperaturu 
//	atribut za mod (hladi/greje) - string
//	metodu za stampu (proizvoljno)
//	metodu koja vraca informaciju da li je napolju veca
//	temperatura od one na koju je klima postavljena.
//	Metoda kao parametar prima temperaturu koja je napolju.
//
//
//	U glavnom programu kreirati minimum 2 objekta klase
//	SmartAirConditioning i za svaki od njih pozvati metode

	String marka;
	int izabranaTemp;
	String mod;

	public void print() {
		System.out.println(this.marka);
		System.out.println(this.izabranaTemp + "C - " + this.mod);
	}

	public boolean compare(int spoljnaTemp) {
		if (spoljnaTemp > izabranaTemp) {
			return true;
		} else {
			return false;
		}
	}
}
