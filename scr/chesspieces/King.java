package scr.chesspieces;

import scr.boardgame.Board;
import scr.chess.ChessPiece;
import scr.chess.Color;

public class King extends ChessPiece{ //Rei

    public King(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString(){
        return "K";
    }
}
