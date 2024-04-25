package logic;

public class Board {
	
	private int[][] board;
	
	public Board(int[][] board) {
		
		if(BoardValidation.checkBoardValidity(board)) {
			this.board = board;
		} else {
			throw new IllegalArgumentException("The board size is not valid.");
		}
	}
	
	public int[][] getBoard(){
		return board;
	}
	
	
}
