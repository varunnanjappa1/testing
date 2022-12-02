package process;

import java.util.*;

public class sort {
    public void pivot(Integer arr[],int low,int high){
        if(low<high){
            int part= partition(arr,low,high);
            pivot(arr,low,part-1);
            pivot(arr,part+1,high);
        }
    }
    public int partition(Integer arr[],int low,int high){
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
    public void print(Integer arr[]){
        for(int item:arr)
            System.out.print(" "+item);
        System.out.println();
    }
}
class process{
    public static void main(String[] args) {
        sort sb=new sort();
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(23);
        Integer artr[]=new Integer[arr.size()];
        arr.toArray(artr);
            sb.print(artr);
        Integer a[]=new Integer[10];
        a[0]=5;
        a[1]=4;
        System.out.println(a.length);
    }
}
