package miniProjekat;

import java.util.ArrayList;

public class XandOGame extends Player {

//
//Kreirati klasu XandOGame koja ima:
//table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//playerX - igrac X
//playerO - igrac O
//Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i 
//difoltni samo sto dodatno postavlja i igraca
//gettere i settere za igrace
//Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. 
//Ako je niz iz primera iznad stampa izgleda:
//x | x | 0 |
//0 | x | 0 |
//x | 0 | x |
//
//Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “
//i zatim postavlja da je na redu igrac X.
//Metodu isGameOver, igra je gotova ako su sva polja popunjena.
//
//Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od 
//parametara prima niz i poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o
//Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x
//prebacuje ga na o i obrnuto
//Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//Ako je trenutno stanje u igri i sledeci na redu je igrac x
//x | x | 0 |
//0 |   |   |
//x |   |   |
//I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je 
//x | x | 0 |
//0 |   | x |
//x |   |   |
//Metodu isWinnerX - metoda vraca rezultat igre za igraca X. 
//Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//Metodu isWinnerO -  metoda vraca rezultat igre za igraca O. Pobednik je 
//ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac
//zeli da odigra potez validna. Pozicija je validna ako je u opsegu od 0 do 8
//Metodu gameScore, metoda vraca informaciju za kraj igre.
//Ukoliko je pobednik igrac x, metoda vraca 1
//Ukoliko je pobednik igrac o, metoda vraca 2
//Ukoliko nemam pobednika vracamo 0

	ArrayList<String> table = new ArrayList<String>();
	String playerX;
	String playerO;
	String nextPlayer;

	public XandOGame() {
		super();
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
	}

	public XandOGame(String playerX, String playerO) {
		super();
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.table.add(" ");
		this.playerX = playerX;
		this.playerO = playerO;
	}

	public String getPlayerX() {
		return playerX;
	}

	public void setPlayerX(String playerX) {
		this.playerX = playerX;
	}

	public String getPlayerO() {
		return playerO;
	}

	public void setPlayerO(String playerO) {
		this.playerO = playerO;
	}

	public void print() {
		for (int i = 0; i < 3; i++) {
			System.out.print(this.table.get(i) + " | ");
		}
		System.out.println("");
		for (int i = 3; i < 6; i++) {
			System.out.print(this.table.get(i) + " | ");
		}
		System.out.println("");
		for (int i = 6; i < 9; i++) {
			System.out.print(this.table.get(i) + " | ");
		}
		System.out.println("");
	}

	public void startGame() {
		for (int i = 0; i < table.size(); i++) {
			this.table.set(i, " ");
		}
		this.nextPlayer = "x";
	}

	public boolean isGameOver() {
		if (this.table.get(0) == " ") {
			return false;
		} else if (this.table.get(1) == " ") {
			return false;
		} else if (this.table.get(2) == " ") {
			return false;
		} else if (this.table.get(3) == " ") {
			return false;
		} else if (this.table.get(4) == " ") {
			return false;
		} else if (this.table.get(5) == " ") {
			return false;
		} else if (this.table.get(6) == " ") {
			return false;
		} else if (this.table.get(7) == " ") {
			return false;
		} else if (this.table.get(8) == " ") {
			return false;
		}else {
			return true;
	}

	}

	public boolean isFieldFree(int pozicija) {
		if (this.table.get(pozicija) == " ") {
			return true;
		} else {
			return false;
		}
	}

	public void playNext() {
		if (this.nextPlayer.equals("x")) {
			this.nextPlayer = "o";
		} else {
			this.nextPlayer = "x";
		}
	}

	public void makeAMove(int pozicija) {
		if (nextPlayer == "x") {
			this.table.set(pozicija, "x");
		} else {
			this.table.set(pozicija, "o");
		}
	}

	public boolean isWinnerX() {
		if (this.table.get(0) == "x" && this.table.get(1) == "x" && this.table.get(2) == "x") {
			return true;
		} else if (this.table.get(3) == "x" && this.table.get(4) == "x" && this.table.get(5) == "x") {
			return true;
		} else if (this.table.get(6) == "x" && this.table.get(7) == "x" && this.table.get(8) == "x") {
			return true;
		} else if (this.table.get(0) == "x" && this.table.get(3) == "x" && this.table.get(6) == "x") {
			return true;
		} else if (this.table.get(1) == "x" && this.table.get(4) == "x" && this.table.get(7) == "x") {
			return true;
		} else if (this.table.get(2) == "x" && this.table.get(5) == "x" && this.table.get(8) == "x") {
			return true;
		} else if (this.table.get(0) == "x" && this.table.get(4) == "x" && this.table.get(8) == "x") {
			return true;
		} else if (this.table.get(2) == "x" && this.table.get(4) == "x" && this.table.get(6) == "x") {
			return true;
		} else {
			return false;
		}
	}

	public boolean isWinnerO() {
		if (this.table.get(0) == "o" && this.table.get(1) == "o" && this.table.get(2) == "o") {
			return true;
		} else if (this.table.get(3) == "o" && this.table.get(4) == "o" && this.table.get(5) == "o") {
			return true;
		} else if (this.table.get(6) == "o" && this.table.get(7) == "o" && this.table.get(8) == "o") {
			return true;
		} else if (this.table.get(0) == "o" && this.table.get(3) == "o" && this.table.get(6) == "o") {
			return true;
		} else if (this.table.get(1) == "o" && this.table.get(4) == "o" && this.table.get(7) == "o") {
			return true;
		} else if (this.table.get(2) == "o" && this.table.get(5) == "o" && this.table.get(8) == "o") {
			return true;
		} else if (this.table.get(0) == "o" && this.table.get(4) == "o" && this.table.get(8) == "o") {
			return true;
		} else if (this.table.get(2) == "o" && this.table.get(4) == "o" && this.table.get(6) == "o") {
			return true;
		} else {
			return false;
		}
	}

	public boolean isValidMove(int pozicija) {
		if (pozicija > 8 || pozicija < 0) {
			return false;
		} else {
			return true;
		}
	}

	public int gameScore() {
		if (this.isWinnerX() == true) {
			return 1;
		} else if (this.isWinnerO() == true) {
			return 2;
		} else {
			return 0;
		}
	}

	public void printWinner() {
		if (this.gameScore() == 1) {
			System.out.println(this.playerX + " won");
		} else if (this.gameScore() == 2) {
			System.out.println(this.playerO + " won");
		} else {
			System.out.println("Draw! Play again!");
		}
	}
	
	public void printPlayers() {
		System.out.println("Players - " + "x: " + this.playerX + 
		" - " + "o: " + this.playerO);
	}

	public void printBreak() {
		System.out.println("-------------------");
	}
}
