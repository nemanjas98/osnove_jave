package d06_09_2022;

public class Zadatak2 {
	
	public static void main(String[] args) {
	
//	(10 poena) U glavnom programu kreirati jedan planinarski dom, 
//	i u njemu učlaniti nekoliko rekreativnih planinara i 
//	nekoliko alpinista (minimum po 3), i istestirati svaku od metoda. 
	
	Planina pla = new Planina("Dinara", "Hrvatska", 1831);
	PlaninarskiDom pD = new PlaninarskiDom("Planinarski dom - Medijana", 1999);
	RekreativniPlaninar rP = new RekreativniPlaninar("14478154158", "J J", 10, "Niski", 2000);
	RekreativniPlaninar rP2 = new RekreativniPlaninar("654165", "N S", 5, "Toplicki", 2900);
	RekreativniPlaninar rP3 = new RekreativniPlaninar("56865", "M S", 0, "Pcinjski", 2700);
	Alpinista alp = new Alpinista("101", "N N", 2);
	Alpinista alp2 = new Alpinista("102", "S S", 0);
	Alpinista alp3 = new Alpinista("103", "M M", 3);
	
	pD.uclaniPlaninara(rP);
	pD.uclaniPlaninara(rP2);
	pD.uclaniPlaninara(rP3);
	pD.uclaniPlaninara(alp);
	pD.uclaniPlaninara(alp2);
	pD.uclaniPlaninara(alp3);
	pD.izbaciPlaninara("14478154158");
	
	rP.print();
	System.out.println("------------");
	rP2.print();
	System.out.println("------------");
	rP3.print();
	System.out.println("------------");
	alp.print();
	System.out.println("------------");
	alp2.print();
	System.out.println("------------");
	alp3.print();
	System.out.println("------------");
	System.out.println("Broj planinara koji su se popeli: " + pD.brojUspesnih(pla));
	System.out.println("------------");
	pD.print();
	System.out.println("------------");
	System.out.println("Mesecni prihod od clanarina: " + pD.mesecnaClanarina()+ "rsd");
	
	
	
	

}
}
