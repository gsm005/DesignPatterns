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
                    System.out.print(board[i][j].getPT()+" ");
            }
            System.out.println(" |");
        }
    }

    public void makeMove(int r,int c,PlayingPiece pp){
        board[r][c]=pp;
    }
    
    public boolean validMove(int r,int c){
        if(r>=size || c>=size || r<0 || c<0 || board[r][c]!=null){
            System.out.println("Invalid move");
            return false;
        }
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
                if(board[i][j]!=null && board[i][j].getPT().equals(pp.getPT()))
                    c++;
            }
            if(c==size)
                return true;
        }
        //columns
        for(int i=0;i<size;i++){
            int c=0;
            for(int j=0;j<size;j++){
                if(board[j][i]!=null && board[j][i].getPT().equals(pp.getPT()))
                    c++;
            }
            if(c==size)
                return true;
        }
        //diagonals
        int c=0;
        for(int i=0;i<size;i++){
            if(board[i][i]!=null && board[i][i].getPT().equals(pp.getPT()))
                c++;
        }
        if(c==size)
            return true;
        c=0;
        for(int i=size-1;i>=0;i--){
            if(board[i][i]!=null && board[i][i].getPT().equals(pp.getPT()))
                c++;
        }
        if(c==size)
            return true;
        return false;

    }

}
