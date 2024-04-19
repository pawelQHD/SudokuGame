package logic;

public class SudokuGame {

	public static void main(String[] args) {

		int[][] yesBoard = {
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9 },
				{ 2, 3, 4, 5, 6, 7, 8, 9, 1 },
				{ 3, 4, 5, 6, 7, 8, 9, 1, 2 },
				{ 4, 5, 6, 7, 8, 9, 1, 2, 3 },
				{ 5, 6, 7, 8, 9, 1, 2, 3, 4 },
				{ 6, 7, 8, 9, 1, 2, 3, 4, 5 },
				{ 7, 8, 9, 1, 2, 3, 4, 5, 6 },
				{ 8, 9, 1, 2, 3, 4, 5, 6, 7 },
				{ 9, 1, 2, 3, 4, 5, 6, 7, 8 }
		};
		
		int[][] noBoard = {
				{ 1, 1, 4, 4, 5, 6, 7, 8, 9 },
				{ 2, 3, 4, 5, 6, 7, 8, 9, 1 },
				{ 3, 4, 5, 6, 7, 8, 9, 1, 2 },
				{ 4, 5, 6, 7, 8, 9, 1, 2, 3 },
				{ 5, 6, 7, 8, 9, 1, 2, 3, 4 },
				{ 6, 7, 8, 9, 1, 2, 3, 4, 5 },
				{ 7, 8, 9, 1, 2, 3, 4, 5, 6 },
				{ 8, 9, 1, 2, 3, 4, 5, 6, 7 },
				{ 9, 1, 2, 3, 4, 5, 6, 7, 8 }
		};
		
		System.out.println(CheckingNumbers.checkFormat(yesBoard));
		System.out.println(CheckingNumbers.checkFormat(noBoard));

	}

}
