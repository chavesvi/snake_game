package snake_game;

import java.util.ArrayList;
import java.util.List;
import entities.*;
import views.*;

public class program {

	public static void main(String[] args) {
		Board board = new Board();
		List<String> corpo = new ArrayList<>();
		Snake cobra = new Snake(corpo);
		cobra.addCorpo();
		cobra.addCorpo();
		cobra.addCorpo();
		cobra.addCorpo();
		System.out.println(cobra.toString());
		System.out.println(cobra.getSnake());
		System.out.println(cobra.getSize());
		board.criarBoard();
		board.getBoard();
		
		

	}

}
