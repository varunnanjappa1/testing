
import java.util.*;


class first1 {
    public int pascal(int i){
        if(i==0)
            return 1;
        return i*pascal(i-1);
    }
    public int fib(int i){
        if(i==0||i==1)
            return 1;
        else
            return fib(i-1)+fib(i-2);
    }  
    public int gcd(int i,int j){
        if(i==j)
            return i;
        if(i>j)
            i-=j;
        else
            j-=i;
        return gcd(i,j);
    }
    public int sum(int i){
        if(i==0)
            return i;
        else
            return i+sum(i-1);
    }
    public void act(int i,String cp){
        if(i<0)
            return ;
        else{
            System.out.print(cp.charAt(i));
            act((i-1),cp);
        }
    }
    public boolean check(int i,int arr[]){
        if(i==arr.length-1)
            return true;
        if(arr[i]>=arr[i+1])
            return false;
        return check(i+1, arr);
    }
    public void per(String cp,String newsString){
        if(cp.length()==0)
            System.out.println(newsString);
        for(int i=0;i<cp.length();i++){
            char fun=cp.charAt(i);
            String per=cp.substring(0,i)+cp.substring(i+1);
            per(per,newsString+fun);
        }
    }
    public static  int maze(int i,int j,int n,int m){
        if(i==n||j==m)
            return 0;
        if(i==n-1 && j==m-1)
            return 1;
        int first=maze(i+1, j, n, m);
        int sec=maze(i, j+1, n, m);
        return first+sec;
    }
    public static void divide(int arr[],int low,int high){
        if(low<high){
        int mid=low+(high-low)/2;
        divide(arr,low, mid);
        divide(arr,mid+1,high);
        mergesort(arr,low,high,mid);
        }
    }
    public static void mergesort(int arr[],int low,int high,int mid){
        int merge[]=new int[high+1];
        int i=low,j=mid+1,x=low;
        while(i<=mid&&j<=high){
            if(arr[i]<=arr[j]){
                merge[x++]=arr[i++];
            }
            else{
                merge[x++]=arr[j++];
            }
        }
        while(i<=mid)
            merge[x++]=arr[i++];
        while(j<=high)
            merge[x++]=arr[j++];
        for(x=low;x<=high;x++)
            arr[x]=merge[x];
    }
    public void pivot(int arr[],int low,int high){
        if(low<high){
            int part= partition(arr,low,high);
            pivot(arr,low,part-1);
            pivot(arr,part+1,high);
        }
    }
    public int partition(int arr[],int low,int high){
        int pi=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pi){
                i++;
                arr[i]=(arr[i]+arr[j])-(arr[j]=arr[i]);
            }
        }
        i++;
        arr[i]=(arr[i]+arr[high])-(arr[high]=arr[i]);        
        return i;

    }
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.print("enter a number");
        int n = read.nextInt();
        int i,j;
        int m=4;
        first1 buy =new first1();
        Random rup =new Random();
    //    System.out.print(maze(0,0,3,3));            // maze solution
    //    String cp="swims";
    //    buy.per(cp,"");               //permutations of string
    //    buy.act(cp.length()-1,cp);            // string reverse using recursion
    //    System.out.println(buy.sum(n));     //sum of n natural numbers
    //    System.out.println(buy.gcd(n,m));   //gcd greatest common divisor
    //    for(i=0;i<=n;i++)
    //        System.out.print(" "+buy.fib(i));  //fibonacci sequence
        // 1d array
    //     System.out.println("enter a random element");
    //    int key=read.nextInt();
        int arr[] = new int[n];
       for(i=0;i<n;i++){
            arr[i]=rup.nextInt(100);
    //    System.out.println(buy.check(0,arr));  //check is arrray is sorted?
            System.out.print(" "+arr[i]);
    //        if(key==arr[i])
    //            System.out.println("element found");
        }
        //2d array manupulation
        System.out.println();
        int art[][]=new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                art[i][j]=rup.nextInt(1000);
                System.out.print(" "+art[i][j]);
            }
            System.out.println();
        }
    //    System.out.println("the transpose is");
    //    for(j=0;j<m;j++){
    //        for(i=0;i<n;i++){
    //            System.out.print(" "+art[i][j]);
    //       }
    //        System.out.println();
    //    }   
        // pascal triangle
        for(i=0;i<=n;i++){
            for(j=0;j<=n-i;j++)
                System.out.print(" ");
            for(j=0;j<=i;j++){
                System.out.print(" "+buy.pascal(i)/(buy.pascal(i-j)*buy.pascal(j)));
            }
            System.out.println();
        }
        //pattern
    //    for (i=1;i<=n;i++){
    //        for(j=1;j<=n;j++)
    //            System.out.print(" *");
    //        System.out.println();
    //    }
        // box
    //    for ( j=1;j<=n;j++){
    //        for( i=1;i<=n;i++){
    //            if(i==n||j==n||i==1||j==1)
    //                System.out.print("  *");
    //            else
    //                System.out.print("   ");        
    //        }
    //        System.out.println();
    //    } 
    //    for(i=1;i<=n;i++){
    //    for(j=1;j<=n-i;j++)
    //            System.out.print(" *");
    //        System.out.println();
    //    }
    //    for(i=n;i>=1;i--){
    //        for(j=1;j<=i;j++)
    //           System.out.print(" #");
    //        System.out.println();
    //    }
    //    for(i=1;i<=n;i++){
    //        for(j=1;j<=n-i;j++){
    //            System.out.print("  ");
    //        }
    //        for(j=1;j<=i;j++){
    //            System.out.print(" #");
    //        }
    //        System.out.println();
    //    }                                     //print prime numbers
        System.out.println("enter the prime number limit");
        int sum=read.nextInt();
        String prime="";
        for(i=1;i<=sum;i++){
            int count=0;
            for(j=i;j>=1;j--){
                if(i%j==0)
                    count+=1;
            }
            if(count==2||count==1)
                prime=prime+i+" ";
        }
        System.out.println(prime); 
        // x pattern
    //    for(i=1;i<=n;i++){
    //        for(j=1;j<=i;j++)
    //            System.out.print(" ");
    //        for(j=1;j<=2;j++)
    //            System.out.print("*");           
    //        int sp=2*(n-i);
    //        for(j=1;j<=sp;j++)
    //            System.out.print(" ");
    //        for(j=1;j<=2;j++)
    //            System.out.print("*");
    //        System.out.println();
    //    }
    //    for(i=n;i>=1;i--){
    //        for(j=1;j<=i;j++)
    //            System.out.print(" ");
    //        for(j=1;j<=2;j++)
    //            System.out.print("*");           
    //        int sp=2*(n-i);
    //        for(j=1;j<=sp;j++)
    //            System.out.print(" ");
    //        for(j=1;j<=2;j++)
    //            System.out.print("*");
    //        System.out.println();
    //    }
        // pattern
        /// strings                     // concatination
    //    String a ="vs";
    //    System.out.println("enter a word");
    //    String b=read.next();
    //    String c=a+b;
    //    for(i=0;i<c.length();i++)
    //        System.out.print(" "+c.charAt(i));
    //        System.out.println();
        // name1.compareTo(name2) op=+ve,-ve,0;
        // name.length( )
        // name.charAt(index)
        // new String("")==objects
        // name.substring(index start,index end) substring
        // name.contains(string) q/p boolean
                                            // length check
        System.out.println("enter your name");
        String name=read.next();
        StringBuilder sp=new StringBuilder(name);      //string builder
        try{
            System.out.println(sp.charAt(n));
        }
        // sp.setCharAt(index,replaceing word)
        // sp.insert(index,inserting word)
        // sp.delete(startindex,endindex) 
        // sp.append(" ")adds char at the end.
        catch(StringIndexOutOfBoundsException e){
            System.out.println("name is too short");
        }
                                            // char replace
        for(i=0;i<sp.length();i++){
            if(sp.charAt(i)=='a'){
                sp.setCharAt(i,'t');
            }
        }
                                              //reverse string
        for(i=0;i<sp.length()/2;i++){
            char end=sp.charAt(sp.length()-1-i);
            char start=sp.charAt(i);
            sp.setCharAt(i,end);
            sp.setCharAt(sp.length()-1-i,start);
        }
        System.out.println(sp);
    //    sp.append(a).append("var").toString();
        // bit operations
                                        // get bit
    //    System.out.println("enter a number and position");
    //    int t=read.nextInt();
    //    int a=read.nextInt();
    //    int bitmask=1<<a;
    //    if((bitmask & t)==0)
    //        System.out.println("bit was zero");
    //    else
    //        System.out.println("bit is one");
    //                                  // set bit
    //    //System.out.print(bitmask);
    //    //int num=bitmask | t;
    //    System.out.println(bitmask | t);
    //                                  //clear bit
    //    int num=(-bitmask);
    //    int su=num&t;
    //    System.out.println(su); 
    //    // sorting
    //                                   //bubble ascending
    //    for(i=0;i<=n-1;i++){
    //        for(j=0;j<n-1-i;j++){
    //            if(arr[j]>arr[j+1]){
    //            //    int temp=arr[j];
    //            //    arr[j]=arr[j+1];
    //            //    arr[j+1]=temp;
    //                arr[j]=(arr[j]+arr[j+1])-(arr[j+1]=arr[j]);
    //            }
    //        }
    //        System.out.print(arr[i]+" ");
    //    }
    //    System.out.println();
    //                                    //selection desending
    //    for(i=0;i<=n-1;i++){
    //        int big=i;
    //        for(j=i+1;j<=n-1;j++){
    //            if(arr[big]<arr[j])
    //                big=j;
    //        }
    //        arr[big]=(arr[big]+arr[i])-(arr[i]=arr[big]);
    //        System.out.print(arr[i]+" ");
    //    }
    //    System.out.println();
    //                                      // insertion sort
    //    for(i=0;i<=n-1;i++){
    //        int curr=arr[i];
    //        int k=i-1;
    //        while(k>=0 && curr < arr[k] ){
    //            arr[k+1]=arr[k];
    //            k--;
    //        }
    //        arr[k+1]=curr;
    //    }
                                            // merge sort
    //    divide(arr,0,n-1);
    //    for(i=0;i<n;i++)
    //        System.out.print(" "+arr[i]);
                                            //  quick sort
        buy.pivot(arr,0,n-1);
        for(i=0;i<n;i++)
            System.out.print(" "+arr[i]);
    }
}