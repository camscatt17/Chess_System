package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {//de uso interno da camada de tabuleiro, por isso será protected
		return board;
	}
	
}
