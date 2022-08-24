package d23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Zadatak
//		Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//				(naziv predmeta) - (ocena)
//				Student: ime i prezime, broj indeksa
//				Profesor: ime i prezime
//
//			U glavnoj klasi:
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

		Scanner s = new Scanner(System.in);
		ArrayList<ZeleniKarton> karton = new ArrayList<ZeleniKarton>();
		int suma = 0;
		int sumaPolozenih = 0;
		int counter = 0;
		
		for (int i = 0; i < 3; i++) {
			ZeleniKarton k = new ZeleniKarton();
			System.out.print("Unesite ime i prezime: ");
			k.setFullName(s.nextLine());
			System.out.print("Unesite broj indeksa: ");
			k.setBrojIndeksa(s.nextLine());
			System.out.print("Unesite ocenu: ");
			k.setOcena(s.nextInt());
			s.nextLine();
			k.polozenIspit();
			karton.add(k);
			System.out.println("");
		}
		for (int i = 0; i < karton.size(); i++) {
			karton.get(i).print();
			karton.get(i).getOcena();
			suma = suma + karton.get(i).getOcena();
			if(karton.get(i).polozenIspit() == true) {
				sumaPolozenih = sumaPolozenih + karton.get(i).getOcena();
				counter++;
			}
		}
		System.out.println("Prosecna ocena polozenih ispita je: " + sumaPolozenih / counter);
		System.out.println("Prosecna ocena je: " + suma / karton.size());
		
	}

}
