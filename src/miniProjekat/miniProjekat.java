package miniProjekat;

import java.util.Scanner;

public class miniProjekat {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		XandOGame xO = new XandOGame("ns98", "ms94");
		xO.startGame();

		while (xO.isGameOver() == false && xO.isWinnerO() == false && xO.isWinnerX() == false) {
			System.out.print("Enter your placement (0-8): ");
			int pozicija = s.nextInt();
			if (xO.isValidMove(pozicija) == true && xO.isFieldFree(pozicija) == true) {
				xO.makeAMove(pozicija);
				xO.playNext();
				xO.print();
			} else {
				System.out.println("You entered invalid position.");
			}
		}

		xO.printBreak();
		xO.print();
		xO.printWinner();
		xO.printPlayers();
	}

}
