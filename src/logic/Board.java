package logic;

public class Board {
	
	private int[][] board = new int[9][9];
	
	public Board(int[][] board) {
		this.board = board;
	}
	
	public int[][] getBoard(){
		return board;
	}
	
}
