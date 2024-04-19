package logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckingNumbers {
	
	public static Map<Integer, Integer> duplicateCoordinates = new HashMap<>();
	
	public static boolean checkFormat(int[][] board) {
		if(board.length != 9) {
			System.out.println("The Game Board has more or less than 9 elements Vertically");
			throw new IllegalArgumentException();
		}
		for(int i = 0; i < board.length; i++) {
			checkBoardSize(board[i]);
			checkBoardNumbers(board[i]);
		}
		checkBoardNumbersRows(board);
		return true;
	}
	
	private static void checkBoardSize(int[] board) {
		if(board.length != 9) {
			System.out.println("The Game Board has more or less than 9 elements Horizontally");
			throw new IllegalArgumentException();
		}
		
	}
	
	private static void checkBoardNumbers(int[] board) {
		for(int i = 0; i < board.length; i++) {
			if(board[i] < 1 || board[i] > 9 ) {
				System.out.println("Numbers in the Game Board cannot be less than 1 or higher than 9");
				throw new IllegalArgumentException();
			}
		}
	}
	
	private static void checkBoardNumbersRows(int[][] board) {
		
		Map<Integer, Integer> doubleCheck = new HashMap<>();
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(doubleCheck.containsKey(board[i][j])) {
					doubleCheck.put(board[i][j], doubleCheck.get(board[i][j]) + 1);
					duplicateCoordinates.put(i, j);

				} else {
					doubleCheck.put(board[i][j], 1);
				}
				
			}
			/*
			 * Do not need this but will keep it in case I need to display which number 
			 * is being duplicated
			 * 
			for(Map.Entry<Integer, Integer> v: doubleCheck.entrySet() ) {
				if(v.getValue() > 1) {
					return false;
				}
			}
			*/
			doubleCheck.clear();
		}
	}
}
