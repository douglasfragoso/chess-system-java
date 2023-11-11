package scr.chess;

import scr.boardgame.Board;

public class Rook extends ChessPiece{ //Torre

    public Rook(Board board, Color color) {
        super(board, color);
    } 

    @Override
    public String toString(){
        return "R";
    }
    
}
