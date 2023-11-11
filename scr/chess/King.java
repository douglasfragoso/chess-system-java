package scr.chess;

import scr.boardgame.Board;

public class King extends ChessPiece{ //Rei

    public King(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "K";
    }
}
