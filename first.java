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
        for ( j=1;j<=n;j++){
            for( i=1;i<=n;i++){
                if(i==n||j==n||i==1||j==1)
                    System.out.print("  *");
                else
                    System.out.print("   ");        
            }
            System.out.println();
        }   
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++)
                System.out.print(" #");
            System.out.println();
        }
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(" #");
            }
            System.out.println();
        }
        
                
    }
}