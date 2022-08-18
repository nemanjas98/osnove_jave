package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		2.Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen 
//			post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 
//			(broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> 
//			(ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)

		FacebookPost f = new FacebookPost();
		FacebookPost g = new FacebookPost();
		
		f.fullName = "Nikolina Nikolic";
		f.fullName2 = "Nikola Nikolic";
		f.textPost = "Srecan rodjendan!";
		f.likes = 40; 
		f.shares = 1;
		
		f.like();
		f.like();
		f.dislike();
		f.share();
		
		f.print();
		
		g.fullName = "Andjela Andjelic";
		g.fullName2 = "Aleksa Andjelic";
		g.textPost = "Srecan rodjendan!";
		g.likes = 10;
		g.shares = 0;
		
		g.like();
		g.like();
		g.like();
		g.dislike();
		g.share();
		g.share();
		
		System.out.println("");
		g.print();
		
		
	}

}
