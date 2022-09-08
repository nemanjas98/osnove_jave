package d06_09_2022;

public class RekreativniPlaninar extends Planinar {
	

//	(20 poena) Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. 
//	Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja 
//	u konstuktoru: 
//		težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
//		naziv okruga odakle je rekreativni planinar. 
//		maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//		da li će rekreativni planinar uspešno popeti na planinu zavisi da li je
//		njegov najveći uspon manji od visine planine, s tim da oprema dodatno
//		otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje. 
//		rekeativci placaju clanarinu u iznosu od 1000 rsd
//		metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
//		Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug) 

	private int tezinaOpreme;
	private String nazivOkruga;
	private int maxUspon;
	
	public RekreativniPlaninar(String jcik, String fullName, int tezinaOpreme, 
								String nazivOkruga, int maxUspon) {
		super(jcik, fullName);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maxUspon = maxUspon;
	}
	

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}



	public String getNazivOkruga() {
		return nazivOkruga;
	}



	public int getMaxUspon() {
		return maxUspon;
	}



	@Override
	public void print() {
		System.out.println("Rekreativac: , id: " + this.jcik + " | ime: " + this.fullName 
			            	+ " | Okrug: " + this.nazivOkruga);
		
	}

	@Override
	public double vratiClanarinu() {
		return 1000;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		this.maxUspon = this.maxUspon - (this.tezinaOpreme * 50);
		if (this.maxUspon > planina.getVisinaPlanine()) {
			return true;
		}else {
			return false;
		}
	}
	
	
	

}
