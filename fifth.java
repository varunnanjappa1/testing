import java.util.*;
import process.*;


class arraylist{
    Scanner read=new Scanner(System.in);
    public void add(ArrayList<Integer> list,int n){        // can be optimized
        System.out.println();
        for(int i=0;i< n;i++){
            int cart=read.nextInt();
            list.add(i,cart);
        }
    }
    public void delete(int a[],ArrayList<Integer> list,int r){
        if(a.length==0)
            return;
        if(r>=a.length)
            return;
        list.remove(a[r]-1);
        delete(a,list,r+1);
    }
    public void display(ArrayList<Integer> list){
        System.out.println(list);
    }
    public void reset(ArrayList<Integer> list){
        list.removeAll(list);
    }
    public void change(int f,ArrayList<Integer> list,int g){
        list.set(f,g);
    }
}

public class fifth {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Random rand=new Random();
        process.sort sw=new process.sort();
        arraylist se=new arraylist();
        ArrayList<Integer> list=new ArrayList<>();
        int ch=0,n=0;
        for(;;){
            System.out.println("...enter your choice...");
            System.out.print("1:add element\n"+"2:delete element\n"+"3:sort array\n"+"4:reset all elements\n"+"5:change element in array\n"+"6:display elements\n");
            ch=read.nextInt();
            switch(ch)
            {
                    case 1:{
                        System.out.println("enter the no elements you want to enter");
                        n=read.nextInt();
                        System.out.println("random(1) or unique(0).enter 'o' 0r '1':-");
                        int r=read.nextInt();
                        if(r==0)
                            se.add(list,n-1);
                        if(r==1){
                            for(int i=0;i<=n-1;i++){
                                int car=rand.nextInt(100);
                                list.add(i,car);
                            }
                        }
                        if(r>1||r<0){
                            System.out.println("enter 0 or 1");
                        }
                    }break;
                    case 2:{
                        System.out.println("enter the no elements you want to delete.(length of array ='1' to "+list.size()+" )");
                        int t=read.nextInt();
                        if(t<0||t==0||t>list.size()){
                            System.out.println("array out of bound");
                        }
                        se.display(list);
                        System.out.println("enter the position('s) you want to delete");
                        int a[]=new int[t];
                        for(int i=0;i<=t-1;i++){
                            a[i]=read.nextInt();
                            if(a[i]<0||a[i]>list.size())
                                System.out.println("error");
                        }
                        se.delete(a,list,0);
                    }break;
                    case 6:{
                        se.display(list);
                    }break;
                    case 4:{
                        se.reset(list);
                    }break;
                    case 5:{
                        se.display(list);
                        System.out.println("enter the index and element you want to swap with");
                        int f=read.nextInt();
                        int g=read.nextInt();
                        se.change(f-1, list, g);
                    }break;
                    case 3:{
                        Integer ar[]=new Integer[list.size()];
                        list.toArray(ar);
                        sw.pivot(ar,0,n-1);
                        sw.print(ar);
                        for(int i=0;i<ar.length;i++){
                            list.set(i,ar[i]);
                        }
                    }break;
                    default:  
                        System.out.println("error");    
            }
        }
        
    }
}