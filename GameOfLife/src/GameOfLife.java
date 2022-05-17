
public class GameOfLife {

	private int gameRows;
	private int gameColumns;
	private boolean[][] gameCells;
	
	public GameOfLife(int rows, int columns) {
		this.gameRows = rows;
		this.gameColumns = columns;
		if (rows > 0 && columns > 0) {
			gameCells = new boolean[rows] [columns];
		}
		else {
			throw new IllegalArgumentException();
		}
	}



	public int getRows() {
		return gameRows;
	}


	public int getColumns() {
		return gameColumns;
	}

	public boolean isAlive(int rows, int columns) {	
		if((rows > gameRows || columns > gameColumns) || (rows < 0 || columns < 0)) {
			return false;
		}
		else {
			return gameCells[gameRows][gameColumns];
		}
	}


	public int getNeighbourCount(int rows, int columns) {
		int aliveNeighbours = 0;

		for(int i = rows - 1; i <= rows+1; i++){
	        for(int j = columns - 1; j <= columns + 1; j++){
	            if((i == rows && j == columns) || (i<0 || j<0) || (i >= gameRows || j >= gameColumns)){
	                continue;
	            }
	            if(gameCells[i][j] == true){
	            	aliveNeighbours++;
	            }
	        }
	    }
	    return aliveNeighbours;
	}
	

	public void calculateNextGeneration() {
		
		
	}

	public void setAlive(int rows, int columns, boolean b) {

		if((rows < 0 || columns < 0) || (rows > gameRows || columns > gameColumns)){
			
		}
		else {
			gameCells[rows][columns] = b;
		}
	}

}