
public class GameOfLife {

	private int columns;
	private int rows;
	private boolean[][] gameCells;
	
	public GameOfLife(int columns, int rows) {
		this.columns = columns;
		this.rows = rows;
		if (rows > 0 && columns > 0) {
			gameCells = new boolean[columns] [rows];
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	public int getColumns() {
		return columns;
	}

	public int getRows() {
		return rows;
	}

	public boolean isAlive(int columnsBound, int rowsBound) {	
		if((columns < 0 || rows < 0) || (columns < columnsBound || rows < rowsBound)){
			return false;
		}
		else {
			return gameCells[columns][rows];
		}
	}


	public int getNeighbourCount(int columns, int rows) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	public void calculateNextGeneration() {
		// TODO Auto-generated method stub
		
	}

	public void setAlive(int columns, int rows, boolean b) {
		// TODO Auto-generated method stub
		
	}

}
