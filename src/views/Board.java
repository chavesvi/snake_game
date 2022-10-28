package views;

public class Board {
	private String[][] board = new String[9][9];
	
	public void getBoard() {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	public void criarBoard() {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				board[i][j] = " - ";
			}
		}
	}
	
}
