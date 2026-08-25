package DesignPatterns.DesignExamples.TicTacToe.Models;

public class PlayingPiece {
    private PieceType pt;
    public PlayingPiece(PieceType pt){
        this.pt=pt;
    }
    PieceType getPT(){
        return pt;
    }
}
