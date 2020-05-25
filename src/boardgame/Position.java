package boardgame;

public class Position {

	private int row;
	private int column;
	
	public Position (int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	public void setRow (int row) {
		this.row = row;
	}
	
	public int getRow () {
		return row;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	public int getColumn() {
		return column;
	}
	
	@Override
	public String toString() {
		return row +", "+ column;
	}
}
