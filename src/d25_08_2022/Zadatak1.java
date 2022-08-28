package d25_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Student s = new Student("e029", "Nikola Nikolic", "osnovne");
		Ispit i = new Ispit ("Osnove C", 6, "Grozdan Grozdanovic");
		Ispit i1 = new Ispit ("Osnove C", 5, "Grozdan Grozdanovic");
		Ispit i2 = new Ispit ("Ekonomija", 8, "Srboslavka Srbic");
		
		
		s.dodajIspit(i);
		s.dodajIspit(i1);
		s.dodajIspit(i2);
		i.polozenIspit();
		s.print();
		
	}

}
