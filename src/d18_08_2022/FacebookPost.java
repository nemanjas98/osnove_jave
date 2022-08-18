package d18_08_2022;

public class FacebookPost {
//	2.Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen 
//	post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 
//	(broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> 
//	(ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)

	String fullName;
	String fullName2;
	String textPost;
	int likes;
	int shares;
	
	public void like () {
		this.likes = this.likes + 1;
	}
	public void dislike () {
		if (this.likes <=0) {
			this.likes = 0;
		}else {
			this.likes = this.likes - 1; 
		}
	}
	public void share () {
		this.shares = this.shares + 1;
	}
	
	public void print () {
		System.out.println(this.fullName + " >>> " + this.fullName2);
		System.out.println(this.textPost);
		System.out.println("Likes " + this.likes + " | " + "Shares " + this.shares);
	}
}
