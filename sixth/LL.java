package sixth;
import java.util.*;

public class LL{
    node head;
    class node{
        String data;
        node next;
        node(String data){
            this.data=data;
            this.next=null;
        }
    } 
                            // addd front
    public void addfront(String data){
        node node1=new node(data);
        if(head==null){
            head=node1;
            return;
        }
        node1.next=head;
        head=node1;
    }
                            // addd end
    public void addback(String data){
        node node1=new node(data);
        if(head==null){
            head=node1;
            return;
        }
        node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=node1;
    }
    public void print(){                //print linkedlist
        node current= head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print(" null");
        System.out.println();
    }
                                    // delete front
    public void delfront(){
        if(head==null){
            System.out.println("list is empty,add elements first");
            return;
        }
        if(head.next==null){
            head=null;
        }
        else{
        head=head.next;
        }
    }
                                    //delete end
    public void delback(){
        if(head==null){
            System.out.println("list is empty,add elements first");
            return;
        }
        node current=head;
        if(current.next==null){
            head=null;
        }
        else{
            while(current.next.next!=null){
            current=current.next;
            }
        current.next=null;
        }
    }
    public void reverse(){             // using scrach code
        if(head==null||head.next==null){
            System.out.println("only one element present");
            return;
        }
        node prev=head;
        node curr=head.next;
        while(curr!=null){
            node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head.next=null;
        head=prev;  
        print();     
    }
    public void delintex(int r){
        if(head==null||head.next==null)
            return;
        int size=0;
        node curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        if(r==size)
            head=head.next;
        else{
            int in=size-r;
            node prev=head;
            for(int i=1;i<in;i++){
                prev=prev.next;
            }
            prev.next=prev.next.next;
        }
        print();
    }
    public boolean pal(){
        if(head==null||head.next==null)
            return true;
        node mid=middle();
        node sec=reverseforpalendrome(mid.next);
        node first=head;
        while(sec!=null){
            if(first.data!=sec.data)
                return false;
            first=first.next;
            sec=sec.next;    
        }
        return true;  
    }
    public node reverseforpalendrome(node head){
        if(head==null){
            System.out.println("only one element present");
            return null;
        }
        node prev=null;
        node curr=head;
        while(curr!=null){
            node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        } 
        return prev;
    }
    public int sizelist(){
        int size=1;
        node curr=head;
        while(curr.next!=null){
            size++;
            curr=curr.next;
        }
        return size;
    }
    public node lastnode(){
        node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        node r=curr;
        return r;
   }
   public node findnode(int index){
        node ind;int i;
        node curr=head;
        for(i=1;i<index;i++)
            curr=curr.next;
        ind=curr;
        return ind;
   }
   public node middle(){
        int s=sizelist()/2;
        node w=findnode(s);
        return w;
   }
   public boolean cheackloop(){
    if(head==null&&head.next==null)
        return false;
    node st=head;
    node sp=head;
    while(sp!=null&&st!=null){
        st=st.next.next;
        sp=sp.next;
        if(st==sp){
            removeloop(sp,head);
            return true;
        }
    }
    return false;
    }
    public void removeloop(node sp,node head){
        node pt1=sp;
        node pt2=sp;
        int k=1,i;
        while(pt2.next!=pt1){
            pt2=pt2.next;
            k++;
        }
        pt1=head;
        pt2=head;
        for(i=0;i<k;i++){
            pt2=pt2.next;
        }
        while(pt2!=pt1){
            pt1=pt1.next;
            pt2=pt2.next;
        }
        while(pt2.next!=pt2)
            pt2=pt2.next;
        pt2.next=null;
    }
    
}


class sixth  {
    public static void main(String[] args) {
        LL sb=new LL();

         sb.addfront("abc");
        sb.addfront("ade");sb.addback("abc");sb.addback("ade");sb.print();
        System.out.println(sb.pal());
        sb.reverse();
           // sb.dele();
        // sb.reverse();
        // sb.delintex(3);
        System.out.println(sb.findnode(2).data);
        //LinkedList <Integer> list=new LinkedList<>();                
        // list.addFirst(21);
        // list.addFirst(20);
        // list.addLast(22);
        // System.out.println(list);
        // list.remove(0);
        // System.out.println(list);
        // list.removeLast();
        // System.out.println(list);
        // list.add(0, 20);
        // System.out.println(list);
        // list.get(0);
        
    }
}

