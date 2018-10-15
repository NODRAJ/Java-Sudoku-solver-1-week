import java.util.*;
public class SudokuSolverScript {

	public static void main(String[] args) {
		String userInput;
		int column;
		int row;
		int checkRow;
		int checkColumn;
		int viewRow;
		int viewColumn;
		int rowCount;
		int columnCount;
		int checkBoardIterator;
		int checkBoardCount = 0;
		int checkBoardIndex = 0;
		int iterationCount = 0;
		int boardPrintIterator = 0;
		int zeroCheckIterator;
		boolean containsZero = true;
		String[][] userInputSudokuBoard = new String [][] {{"0", "1", "2", "3", "4", "5", "6", "7", "8"},{"0", "1", "2", "3", "4", "5", "6", "7", "8"},{"0", "1", "2", "3", "4", "5", "6", "7", "8"},{"0", "1", "2", "3", "4", "5", "6", "7", "8"},{"0", "1", "2", "3", "4", "5", "6", "7", "8"},{"0", "1", "2", "3", "4", "5", "6", "7", "8"},{"0", "1", "2", "3", "4", "5", "6", "7", "8"},{"0", "1", "2", "3", "4", "5", "6", "7", "8"},{"0", "1", "2", "3", "4", "5", "6", "7", "8"}};
		List<String> valid = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
		
		System.out.println("Enter the value for each square of the sudoku board you want to solve, if there is no value enter a '0'\n");
		Scanner reader = new Scanner(System.in);
		String[] checkBoard = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
			
		for (row=0; row<9; row++) {
			
			for (column=0; column<9; column++) {
				
				userInput = "Incorrect";
				
				while (!(valid.contains(userInput))) {
					
					System.out.print("Please enter the value for row " + (row+1) + " column " + (column+1) + ": ");
					userInput = reader.nextLine();
					userInputSudokuBoard[row][column] = userInput;
				} 
				
			}
		}
		
		while (iterationCount < 70 && containsZero) {
			
			for (checkRow = 0; checkRow < 9; checkRow++) {
				
				for (checkColumn = 0; checkColumn < 9; checkColumn++) {
					
					if (userInputSudokuBoard[checkRow][checkColumn].equals("0")) {
						
						if (checkRow >= 0 && checkRow <3) {
							
							if (checkColumn >= 0 && checkColumn <3) {
								
								for (viewRow = 0; viewRow < 3; viewRow++) {
									
									for (viewColumn = 0; viewColumn < 3; viewColumn++) {
										
										if (Arrays.asList(checkBoard).contains(userInputSudokuBoard[viewRow][viewColumn])) {
											
											checkBoard[Integer.parseInt(userInputSudokuBoard[viewRow][viewColumn])-1] = "";
											
										}
										
									}
									
								}
								
							} else if (checkColumn >= 3 && checkColumn <6) {
								
								for (viewRow = 0; viewRow < 3; viewRow++) {
									
									for (viewColumn = 3; viewColumn < 6; viewColumn++) {
										
										if (Arrays.asList(checkBoard).contains(userInputSudokuBoard[viewRow][viewColumn])) {
											
											checkBoard[Integer.parseInt(userInputSudokuBoard[viewRow][viewColumn])-1] = "";
											
										}
										
									}
									
								}
								
							} else if (checkColumn >= 6 && checkColumn <9) {
								
								for (viewRow = 0; viewRow < 3; viewRow++) {
									
									for (viewColumn = 6; viewColumn < 9; viewColumn++) {
										
										if (Arrays.asList(checkBoard).contains(userInputSudokuBoard[viewRow][viewColumn])) {
											
											checkBoard[Integer.parseInt(userInputSudokuBoard[viewRow][viewColumn])-1] = "";
											
										}
										
									}
									
								}
								
							}
						
								
							} else if (checkRow >= 3 && checkRow <6) {
								
								if (checkColumn >= 0 && checkColumn <3) {
									
									for (viewRow = 3; viewRow < 6; viewRow++) {
										
										for (viewColumn = 0; viewColumn < 3; viewColumn++) {
											
											if (Arrays.asList(checkBoard).contains(userInputSudokuBoard[viewRow][viewColumn])) {
												
												checkBoard[Integer.parseInt(userInputSudokuBoard[viewRow][viewColumn])-1] = "";
												
											}
											
										}
										
									}
									
								} else if (checkColumn >= 3 && checkColumn <6) {
									
									for (viewRow = 3; viewRow < 6; viewRow++) {
										
										for (viewColumn = 3; viewColumn < 6; viewColumn++) {
											
											if (Arrays.asList(checkBoard).contains(userInputSudokuBoard[viewRow][viewColumn])) {
												
												checkBoard[Integer.parseInt(userInputSudokuBoard[viewRow][viewColumn])-1] = "";
												
											}
											
										}
										
									}
									
								} else if (checkColumn >= 6 && checkColumn <9) {
									
									for (viewRow = 3; viewRow < 6; viewRow++) {
										
										for (viewColumn = 6; viewColumn < 9; viewColumn++) {
											
											if (Arrays.asList(checkBoard).contains(userInputSudokuBoard[viewRow][viewColumn])) {
												
												checkBoard[Integer.parseInt(userInputSudokuBoard[viewRow][viewColumn])-1] = "";
												
											}
											
										}
										
									}
									
								}
							
									
								} else if (checkRow >= 6 && checkRow <9) {
									
									if (checkColumn >= 0 && checkColumn <3) {
										
										for (viewRow = 6; viewRow <9; viewRow++) {
											
											for (viewColumn = 0; viewColumn < 3; viewColumn++) {
												
												if (Arrays.asList(checkBoard).contains(userInputSudokuBoard[viewRow][viewColumn])) {
													
													checkBoard[Integer.parseInt(userInputSudokuBoard[viewRow][viewColumn])-1] = "";
													
												}
												
											}
											
										}
										
									} else if (checkColumn >= 3 && checkColumn <6) {
										
										for (viewRow = 6; viewRow < 9; viewRow++) {
											
											for (viewColumn = 3; viewColumn < 6; viewColumn++) {
												
												if (Arrays.asList(checkBoard).contains(userInputSudokuBoard[viewRow][viewColumn])) {
													
													checkBoard[Integer.parseInt(userInputSudokuBoard[viewRow][viewColumn])-1] = "";
													
												}
												
											}
											
										}
										
									} else if (checkColumn >= 6 && checkColumn <9) {
										
										for (viewRow = 6; viewRow < 9; viewRow++) {
											
											for (viewColumn = 6; viewColumn < 9; viewColumn++) {
												
												if (Arrays.asList(checkBoard).contains(userInputSudokuBoard[viewRow][viewColumn])) {
													
													checkBoard[Integer.parseInt(userInputSudokuBoard[viewRow][viewColumn])-1] = "";
													
												}
												
											}
											
										}
										
									}
								
										
									}
						
						
						for (rowCount = 0; rowCount < 9; rowCount++) {
							
							if ((Arrays.asList(checkBoard).contains(userInputSudokuBoard[rowCount][checkColumn]))) {
								
								checkBoard[Integer.parseInt(userInputSudokuBoard[rowCount][checkColumn])-1] = "";
						        
							}
							
						}
						
						for (columnCount = 0; columnCount < 9; columnCount++) {
							
							if (Arrays.asList(checkBoard).contains(userInputSudokuBoard[checkRow][columnCount])) {
								
								checkBoard[Integer.parseInt(userInputSudokuBoard[checkRow][columnCount])-1] = "";
								
							}
							
						}
							
						for (checkBoardIterator = 0; checkBoardIterator < 9; checkBoardIterator++) {
							
							
							if (checkBoard[checkBoardIterator] != "") {
								
								checkBoardCount ++;
								checkBoardIndex = checkBoardIterator;
							}
							
						}
						
						if (checkBoardCount == 1) {
							
							userInputSudokuBoard[checkRow][checkColumn] = Integer.toString(checkBoardIndex + 1);
						}
						
						checkBoardCount = 0;
						checkBoard = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
						
					}
				}
			}
			
			iterationCount++;
			containsZero = false;
			
			for (zeroCheckIterator = 0; zeroCheckIterator < 9; zeroCheckIterator++) {
				
				if (Arrays.asList(userInputSudokuBoard[zeroCheckIterator]).contains("0")) {
					
					containsZero = true;
				}
			}
			
			
			
		}
		
		if (!containsZero) {
			
			System.out.println();
			System.out.println("Solved board: ");
			System.out.println();
			
			for (boardPrintIterator = 0; boardPrintIterator < 9; boardPrintIterator ++) {
				
				System.out.println(Arrays.deepToString(userInputSudokuBoard[boardPrintIterator]));
			
			}
		} else {
			
			System.out.println();
			System.out.println("Couldn't find a solution...");
		}
		
		reader.close();
	}

}
