package logic;

import java.util.HashMap;
import java.util.Map;
import exceptions.*;

public class BoardValidation {
	
	static BoardValidation helper = new BoardValidation();
	
	public static boolean checkBoardValidity(int[][] board) {
		if(!checkSize(board)) {
			throw new IllegalBoardSizeException("The size of the board is incorrect");
		} else if(!checkNumbersRange(board)) {
			throw new IllegalNumberRangeException("Number(s) range is outside the normal 1 to 9");
		} else if(!checkDuplicates(board)) {
			throw new IllegalRowDuplicateException("There is a duplicate(s) in one of the row(s)");
		} else if(!checkColumnDuplicates(board)) {
			throw new IllegalColumnDuplicateException("There is a duplicate(s) in one of the column(s)");
		} else {
			return true;
		}
		
	}
	
	/*
	 * Testing for the right grid
	 * Grid should be 9 x 9
	 * Any more or less should cause an error
	 */
	
	public static boolean checkSize(int[][] board) {
		if(helper.checkColumnSize(board)) {
			for(int[] row: board) {
				if(!helper.checkSingleRowSize(row)) {
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}
	
	private boolean checkColumnSize(int[][] board) {
		if(board.length != 9) {
			System.out.println("Incorect Column Size");
			return false;
		} else {
			return true;
		}
	}
	
	private boolean checkSingleRowSize(int[] row) {
		if(row.length != 9) {
			System.out.println("Incorect Row Size");
			return false;
		} else {
			return true;
		}
	}
	
	/*
	 * Testing for the right numbers
	 * The numbers should be between 1 and 9
	 * Numbers should also not repeat
	 * For Example, you can't have 1 twice in a single row, column or grid
	 * Grids are divided into 3x3 across 9 x 9 area
	 * There are 9 grids total
	 * 
	 */
	
	
	/*
	 * Testing number range
	 */
	
	public static boolean checkNumbersRange(int[][] board) {
		for(int[] row: board) {
			if(!helper.checkNumberRange(row)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkNumberRange(int[] row) {
		for(int n: row) {
			if(n < 1 || n > 9) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Testing rows duplicates
	 */
	
	public static boolean checkDuplicates(int[][] board) {
		for(int[] row: board) {
			if(!helper.checkSingleRowDuplicates(row)) {
				return false;
			}
		}
		return true;
	}
	
	private boolean checkSingleRowDuplicates(int[] row) {
		Map<Integer, Integer> duplicates = new HashMap<>();
		for(int n: row) {
			if(duplicates.containsKey(n)) {
				duplicates.put(n, duplicates.get(n) + 1);
			} else {
				duplicates.put(n, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
			if(entry.getValue() > 1) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Testing column duplicates
	 */
	
	public static boolean checkColumnDuplicates(int[][] board) {
		for(int i = 0; i < board.length; i++) {
			Map<Integer, Integer> duplicates = new HashMap<>();
			for(int j = 0; j < board[i].length; j++) {
				//System.out.println("[" + (j +1) +"] [" + (i +1) + "]");
				if(duplicates.containsKey(board[j][i])) {
					duplicates.put(board[j][i], duplicates.get(board[j][i]) + 1);
				} else {
					duplicates.put(board[j][i], 1);
				}
			}
			for(Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
				if(entry.getValue() > 1) {
					return false;
				}
			}
		}
		
		return true;
	}
		
	/*
	 * Testing grid duplicates (3x3)
	 *
	
	private boolean checkGridDuplicates(int[][] board) {
		
	}
	*/
}
