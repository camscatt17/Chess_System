package chess;

import boardgame.Board;

public class ChessMatch {
	
	private Board board;
		
	public ChessMatch() {
		board = new Board(8,8);//quem deve saber a dimens�o de um tabuleiro de xadrez � a classe ChessMatch
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][]mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i<board.getRows(); i++) {
			for (int j = 0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i,j);
			}
		}
		return mat;
	}
}
