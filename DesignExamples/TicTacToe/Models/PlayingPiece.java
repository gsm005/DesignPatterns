package DesignPatterns.DesignExamples.TicTacToe.Models;

public class PlayingPiece {
    private PieceType pt;
    public PlayingPiece(PieceType pt){
        this.pt=pt;
    }
    public PieceType getType(){
        return pt;
    }
}
