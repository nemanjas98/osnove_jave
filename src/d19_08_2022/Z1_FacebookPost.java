package d19_08_2022;

public class Z1_FacebookPost {
	
//	1.Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post
//	(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	 Konstruktore:
//	difoltni konstuktor
//	konstuktor koji postavlja ime i prezime korisnika ko je objavio,
//	korisnika na kom je profilu objavnljen i tekst objave
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//
//	U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//	Primer stampanja:
//	Milan Jovanovic >>> Pera Peric
//	Ovo je tekst objave
//	Likes 3 | Shares 1
	
	private String fullName;
	private String fullName2;
	private String textPost;
	private int likes;
	private int shares;
	
	public Z1_FacebookPost() {
	}
	
	public Z1_FacebookPost(String fullName, String fullName2, String textPost) {
		this.fullName = fullName;
		this.fullName2 = fullName2;
		this.textPost = textPost;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void setFullName2(String fullName2) {
		this.fullName2 = fullName2;
	}
	
	public void setTextPost(String textPost) {
		this.textPost = textPost;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public void setShares(int shares) {
		this.shares = shares;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getFullName2() {
		return fullName2;
	}
	
	public String getTextPost() {
		return textPost;
	}
	
	public int getlikes() {
		return likes;
	}
	
	public int getshares() {
		return shares;
	}
	
	public void like() {
		this.likes = this.likes + 1;
	}
	
	public void dislike () {
		if (this.likes <= 0) {
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
		System.out.println("Likes " + this.likes + " | Shares " + this.shares);
		System.out.println("");
	}
	
}
