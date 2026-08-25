package DesignPatterns.DesignExamples.TicTacToe.Models;

public class Board {
    private int size;
    private PlayingPiece[][] board;
    
    public Board(int size){
        this.size=size;
        board=new PlayingPiece[size][size];
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            System.out.print("| ");
            for(int j=0;j<size;j++){
                if(board[i][j]==null)
                    System.out.print("  ");
                else
                    System.out.print(board[i][j].getType()+" ");
            }
            System.out.println(" |");
        }
    }

    public boolean makeMove(int r,int c,PlayingPiece pp){
        if(r>=size || c>=size || r<0 || c<0 || board[r][c]!=null){
            return false;
        }
        board[r][c]=pp;
        return true;
    }
    
    public boolean isFull(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null)
                    return false;
            }
        }
        return true;
    }
    
    public boolean isWinner(PlayingPiece pp){
        //rows
        for(int i=0;i<size;i++){
            int c=0;
            for(int j=0;j<size;j++){
                if(board[i][j]!=null && board[i][j].getType()==(pp.getType()))
                    c++;
            }
            if(c==size)
                return true;
        }
        //columns
        for(int i=0;i<size;i++){
            int c=0;
            for(int j=0;j<size;j++){
                if(board[j][i]!=null && board[j][i].getType()==(pp.getType()))
                    c++;
            }
            if(c==size)
                return true;
        }
        //diagonals
        int c=0;
        for(int i=0;i<size;i++){
            if(board[i][i]!=null && board[i][i].getType()==(pp.getType()))
                c++;
        }
        if(c==size)
            return true;
        c=0;
        for(int i=size-1;i>=0;i--){
            if(board[i][size-i-1]!=null && board[i][size-i-1].getType()==(pp.getType()))
                c++;
        }
        if(c==size)
            return true;
        return false;

    }

}
