package test;
import java.util.*;
public class sec{
    public boolean isafe(int row,int col,char[][] board){
        int j,i,c,r;
        for(j=0;j<board.length;j++){
            if(board[row][j]=='q')
                return false;
        }
        for(i=0;i<board.length;i++){
            if(board[i][col]=='q')
                return false;
        }   
        for(c=col,r=row;c>=0&&r>=0;r--,c--){
            if(board[r][c]=='q')
            return false;
        }
        for(c=col,r=row;r>=0&&c<board.length;c++,r--){
            if(board[r][c]=='q')
            return false;
        }
        for(c=col,r=row;r<board.length&&c>=0;c--,r++){
            if(board[r][c]=='q')
            return false;
        }
        for(c=col,r=row;r<board.length&&c<board.length;r++,c++){
            if(board[r][c]=='q')
            return false;
        }
        return true;
    }
    public List<List<String>> queen(int n){                      //start
        List<List<String>> all=new ArrayList<>();              //to store result
        char board[][]= new char[n][n];                         //chess board
        help(board,all,0);                                 //call for iteration through col
        return all;
    }
    public void help(char[][] board,List<List<String>> all,int col){
        if(col==board.length){                                // return condition
            saveb(board,all);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isafe(row,col,board)){                          // check if queen is safe
                board[row][col]='q';                           //if safe add q then col+1 and rest of the row is added with '.'
                help(board,all,col+1);
                board[row][col]='.';
            }
        }
    }
    int count=0;
    public int saveb(char[][] board,List<List<String>> all){
        String row="";
        List<String> newboard=new ArrayList<>();                //new array list for storing every answer
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='q')
                    row+='q';
                else    
                    row+='.';
            }
            newboard.add(row);                                    // storing individual answers of each row
        }
        all.add(newboard);                                         // storing every answer
        return count++;
    }
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("enter the no of rows");
        sec ob=new sec();
        int n=read.nextInt();
        long st=System.currentTimeMillis();
        System.out.println(ob.queen(n));
        long et=System.currentTimeMillis();
        System.out.println("time taken ="+(et-st));
        System.out.println(ob.count);
    }
}