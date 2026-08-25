package DesignPatterns.DesignExamples.TicTacToe.Models;

public class Player {
    private String name;
    private PlayingPiece pp;
    public Player(String name, PlayingPiece pp){
        this.name=name;
        this.pp=pp;
    }

    public String getName(){
        return name;
    }
    
    public PlayingPiece getPiece(){
        return pp;
    }
}
