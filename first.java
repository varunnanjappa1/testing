import java.util.*;

class first1 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.print("enter a number");
        int n = read.nextInt();
        int i, j;
        for (i=1;i<=n;i++){
            for(j=1;j<=n;j++)
                System.out.print(" *");
            System.out.println();
        }
           
                
    }
}