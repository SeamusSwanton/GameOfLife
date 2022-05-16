
public class GameOfLife {

	private int gameRows;
	private int gameColumns;
	private boolean[][] gameCells;
	
	public GameOfLife(int rows, int columns) {
		this.gameRows = rows;
		this.gameColumns = columns;
		if (columns > 0 && rows > 0) {
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

	public boolean isAlive(int rowsBound, int columnsBound) {	
		if((rowsBound < 0 || columnsBound < 0) || (gameRows < rowsBound || gameColumns < columnsBound)){
			return false;
		}
		else {
			return gameCells[gameRows][gameColumns];
		}
	}


	public int getNeighbourCount(int rows, int columns) {
		int neighbourCount = 0;
		
		for (int i = rows - 1; i <= rows + 1; i++) {
			for(int j = columns - 1; j <= columns + 1; j++) {
					if((i < 0 || j < 0) || (gameRows < i || gameColumns < j) || gameCells[i][j] == false || gameCells[i][j] == gameCells[rows][columns]){
						break;
					}
					else {
						neighbourCount++;
					}
			}
		}
		return neighbourCount;
	}
	

	public void calculateNextGeneration() {
		// TODO Auto-generated method stub
		
	}

	public void setAlive(int rows, int columns, boolean b) {
		gameCells[rows][columns] = b;
	}

}