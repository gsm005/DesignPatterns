package DesignPatterns.DesignExamples.TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DesignPatterns.DesignExamples.TicTacToe.Models.Board;
import DesignPatterns.DesignExamples.TicTacToe.Models.PieceO;
import DesignPatterns.DesignExamples.TicTacToe.Models.PieceX;
import DesignPatterns.DesignExamples.TicTacToe.Models.Player;

public class Game {
    private int noOfPlayers;
    private int boardSize;
    private Board board;
    private List<Player> players;
    public Game(int s){
        noOfPlayers=2;
        boardSize=s;
    }
    public void initializeGame(){
        board=new Board(boardSize);
        players=new ArrayList<>();
        PieceX px=new PieceX(); 
        PieceO po=new PieceO();
        Player p1=new Player("gsm",px);
        Player p2=new Player("random",po);
        players.add(p1);
        players.add(p2);

    }
    public void startGame(){
        initializeGame();
        System.out.println("Welcome to the Game XO");
        board.printBoard();

        Scanner sc=new Scanner(System.in);
        int cr,cc;
        while(true){
            for(int i=0;i<noOfPlayers;i++){
                System.out.println("Player "+players.get(i).getName()+" turn\nEnter row and column no.");
                while(true){
                    cr=sc.nextInt();
                    cc=sc.nextInt();
                    if(board.makeMove(cr,cc,players.get(i).getPiece())){
                        break;
                    }
                    System.out.println("Invalid move!! Enter valid row and column no.");
                }
                board.printBoard();
                if(board.isWinner(players.get(i).getPiece()))
                {
                    System.out.println("Player "+players.get(i).getName()+" is the winner!!");
                    sc.close();
                    return;
                }
                if(board.isFull())
                {
                    System.out.println("--Tie--");
                    sc.close();
                    return;
                }
            }
        }
    }
}
