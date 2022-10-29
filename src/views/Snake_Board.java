package views;

import entities.Snake;

public class Snake_Board{
	private Snake snake;
	private Board board;
	private static int posicoesStart[] = {4, 3};
	private int posicoes[] = {4, 3};
	
	public Snake_Board(Snake snake, Board board) {
		this.snake = snake;
		this.board = board;
		board.setBoard(posicoesStart[0], posicoesStart[1], snake.getCorpoPosicao(snake.getSize()));
	}
	
	public void direitaD() {
		posicoes[1] ++;
		board.setBoard(posicoes[0], posicoes[1], snake.getCorpoPosicao(snake.getSize()));
		board.setBoard(posicoes[0], (posicoes[1] - (snake.getSize() + 1)), " - ");
		if(snake.getSize() > 0) {
			for(int i=1; i<=snake.getSize(); i++) {
				board.setBoard(posicoes[0], (posicoes[1] + i), " O ");
			}
		}
	}
	
	public void esquerdaA() {
		board.setBoard(posicoes[0], posicoes[1], " - ");
		posicoes[1] --;
		board.setBoard(posicoes[0], posicoes[1], snake.getCorpoPosicao(snake.getSize()));
	}
	
	public void subirW() {
		board.setBoard(posicoes[0], posicoes[1], " - ");
		posicoes[0] ++;
		board.setBoard(posicoes[0], posicoes[1], snake.getCorpoPosicao(snake.getSize()));
	}
	
	public void baixoS() {
		board.setBoard(posicoes[0], posicoes[1], " - ");
		posicoes[0] --;
		board.setBoard(posicoes[0], posicoes[1], snake.getCorpoPosicao(snake.getSize()));
	}
	
}
