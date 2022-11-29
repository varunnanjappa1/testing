import java.util.*;
class sec1{
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
    public List<List<String>> queen(int n){
        List<List<String>> all=new ArrayList<>();
        char board[][]= new char[n][n];
        help(board,all,0);
        return all;
    }
    public void help(char[][] board,List<List<String>> all,int col){
        if(col==board.length){
            saveb(board,all);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(isafe(row,col,board)){
                board[row][col]='q';
                help(board,all,col+1);
                board[row][col]='.';
            }
        }
    }
    int count=0;
    public int saveb(char[][] board,List<List<String>> all){
        String row="";
        List<String> newboard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='q')
                    row+='q';
                else    
                    row+='.';
            }
            newboard.add(row);
        }
        all.add(newboard);
        return count++;
    }
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("enter the no of rows");
        sec1 ob=new sec1();
        int n=read.nextInt();
        System.out.println(ob.queen(n));
        System.out.println(ob.count);
    }
}