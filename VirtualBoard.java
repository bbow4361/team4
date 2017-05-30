package JFrame_Tests;

public class VirtualBoard {
	
	int[][] board = new int[10][10];
	final int AIRCRAFT_CARRIER = 5;
	final int BATTLESHIP = 4;
	final int CRUISER = 3;
	final int SUBMARINE_LENGTH = 3;
	final int SUBMARINE_ID = 2;
	final int DESTROYER_LENGTH = 2;
	final int DESTROYER_ID = 1;
	final int EMPTY = 0;
	final int[] SHIP_LENGTHS_FOR_ID = {EMPTY, DESTROYER_LENGTH, SUBMARINE_LENGTH, CRUISER, BATTLESHIP, AIRCRAFT_CARRIER};
	
	public void reset(){
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				board[i][j] = EMPTY;
			}
		}
		System.out.print(board);
	}
	
	public void placeShip(int shipIdentification, int xValue, int yValue, boolean vert_OR_horiz){
		int shipID = shipIdentification;
		int xVal = xValue;
		int yVal = yValue;
		boolean vORh = vert_OR_horiz;
		
		//vertical
		if(vORh == true){
			for(int i = 0; i < SHIP_LENGTHS_FOR_ID[shipID]; i++ ){
				board[xVal + i][yVal] = shipID; 
			}
		}
		//horizontal
		else if(vORh == false){
			for(int i = 0; i < SHIP_LENGTHS_FOR_ID[shipID]; i++){
				board[xVal][yVal + i] = shipID;
			}
		}
		return;
	}
}
