package views;

public class Board {
	private static int tamanhoBoard = 9;
	private String[][] board = new String[tamanhoBoard][tamanhoBoard];
	
	public Board() {
		for(int i=0; i<tamanhoBoard; i++) {
			for(int j=0; j<tamanhoBoard; j++) {
				board[i][j] = " - ";
			}
		}
	}
	
	public String[][] getBoard() {
		return board;
	}
	
	public void setBoard(int posicaoI, int posicaoJ, String valor) {
		board[posicaoI][posicaoJ] = valor;
	}
	
	public void lookBoard() {
		for(int i=0; i<tamanhoBoard; i++) {
			for(int j=0; j<tamanhoBoard; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
}
