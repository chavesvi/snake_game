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
	
	public void movimentacao() {
		board.setBoard(posicoes[0], posicoes[1], " - ");
		posicoes[1] ++;
		board.setBoard(posicoes[0], posicoes[1], snake.getCorpoPosicao(snake.getSize()));
	}
}
