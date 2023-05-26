
import java.util.*;

public class third {
    public boolean help(char[][] board,int r,int c){
        if(r==board.length)
            return true;
        int nr=0,nc=0;
        if(c!=board.length){
            nc=c+1;
            nr=r;
        }
        else{
            nr=r+1;
            nc=0;
        }
        if(board[r][c]!='0'){
            if(help(board,nr,nc))
                return true;
        }
        else{
            for(int i=1;i<9;i++){
                if(isafe(board,r,c,i)){
                    board[r][c]=(char)(i+'.');
                    if(help(board,nr,nc))
                        return true;
                    else    
                        board[r][c]='0';
                }
            }
        }
        return false;
    }
    public boolean isafe(char board[][],int r,int c,int i){
        for(int j=1;j<board.length;j++){
            if(board[r][j]==(i+'.'))
                return false;
            if(board[j][c]==(char)(i+'.'))
                return false;
        }
        int sc=(c/3)*3;
        int sr=(r/3)*3;
        for(int a=sr;a<=sr+3;a++){
            for(int b=sc;b<=sc+3;b++){
                if(board[a][b]==(char)(i+'.'))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        third buy=new third();
        System.out.println("enter matrix size(6 or 9)only");
        int n=read.nextInt();
        char board[][]=new char[n][n];
        int board1[][]=new int[n][n];
        System.out.println("enter the suduko matrix");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                board1[i][j]=read.nextInt();
                board[i][j]=(char)(board1[i][j]);
            }
        }
        System.out.println(buy.help(board,1,1));
    }
    
}
