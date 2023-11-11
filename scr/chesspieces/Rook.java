package scr.chesspieces;


import scr.boardgame.Board;
import scr.chess.ChessPiece;
import scr.chess.Color;

public class Rook extends ChessPiece{ //Torre

    public Rook(Board board, Color color) {
        super(board, color);
    } 

    @Override
    public String toString(){
        return "R";
    }
}
