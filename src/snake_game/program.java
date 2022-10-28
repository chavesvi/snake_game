package snake_game;

//import java.util.Scanner;
import entities.*;
import views.*;

public class program {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		
		Board board = new Board();
		Snake cobra = new Snake();
		Snake_Board sb = new Snake_Board(cobra, board);
		
//		String parteG = "erro";
//		String controle;
//		int posI = 4 , posJ = 3;
//	
//		for(String parteL : cobra.getSnake()) {
//			parteG = parteL;
//		}
//		
//		board.setBoard(posI, posJ, parteG);
//		board.lookBoard();
//		controle = scan.next();
//		if(controle.equals("d")) {
//			board.setBoard(posI, posJ, " - ");
//			posJ += 1;
//			board.setBoard(posI, posJ, parteG);
//		}
		
		board.lookBoard();
		sb.movimentacao();
		board.lookBoard();
		sb.movimentacao();
		board.lookBoard();

	}

}
