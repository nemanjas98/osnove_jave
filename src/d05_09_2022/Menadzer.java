package d05_09_2022;

import java.util.ArrayList;

public class Menadzer extends Radnik {

//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

	public Menadzer(String fullName) {
		super(fullName);
	}

	@Override
	public double plataRadnika() {
		double suma = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			suma = suma + this.sektori.get(i).plata;
		}
		return suma;
	}
	
}
