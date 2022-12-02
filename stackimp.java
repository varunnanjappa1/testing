
import java.util.*;

public class stackimp {                       //stack using linkedlist    
    public static class stacks{
        node head;
        class node{
            String data;
            node next;
            node(String data){
                this.data=data;
                this.next=null;
            }
        }
        public boolean isempty(){
            return head==null;
        }
        public void push(String data){  
            node sew=new node(data);                    
            if(isempty()){
                head=sew;
                return;
            }
            sew.next=head;
            head=sew;
        }
        public void pop(){
            if(isempty()){
                System.out.println("the stack is empty add a few strings");
                return;
            }
            System.out.println("the deleated string is:-"+(head.data));
            head=head.next;
        }
        public void print(){
            node current= head;
            System.out.print("top -->");
            while(current!=null){
                System.out.print(current.data+"-->");
                current=current.next;
            }
            System.out.print(" null");
            System.out.println();
        }
        public void peek(){
            if(isempty())
                System.out.println("the stack is empty add few strings");
            String top=head.data;
            System.out.println("top of the stack:="+top);
        }
    }
    public static class stacks1{                                      //stack using arraylist
        ArrayList<Integer> list=new ArrayList<>();
        public boolean isempty(){
            return (list.size()==0);
        }
        public void push(int data){
            list.add(data);
        }
        public void pop(){
            if(isempty()){
                System.out.println("list is empty enter some elements");
                return;
            }
            list.remove((list.size()-1));
        }
        public void peek(){
            if(isempty())
                System.out.println("the stack is empty add few elements");
            System.out.println(list.get(list.size()-1));
        }
        public void print(){
            for(int item:list){
                System.out.print(" "+item);
            }
            System.out.println();
        }
    }  
    public static class stack2{                                          // stack using frame work;
        Stack<Character> list=new Stack<>();
        public void print(){
            for(Character item:list){
                System.out.print(" "+item);
            }
            System.out.println();
        }
        public void push(Character data){
            list.push(data);
        }
        public void pop(){
            if(list.isEmpty()){
                System.out.println("list is empty enter some elements");
                return;
            }
            list.pop();
        }
        public boolean isempty(){
            return (list.isEmpty());
        }
        public void size(){
            System.out.println(list.size());
        }
        public void peek(){
            System.out.println(list.peek());
        }
        public void addtobottom(Character data){
            if(list.isEmpty()){
                list.push(data);
                return;
            }
            Character top=list.pop();
            addtobottom(data);
            list.push(top);
        }
        public void reverse(){
            if(list.isEmpty()){
                return;
            }
            Character top=list.pop();
            reverse();
            addtobottom(top);
        }
        public void addtoindex(int n,Character data){
            int r=list.size()-n+1;
            int i=0;
            while(i==r){
                list.push(data);
                return;
            }
            Character top=list.pop();
            addtoindex(n, data);
            list.push(top);
        }
    }
}

class sort{
    public static void main(String[] args) {
        stackimp.stacks dv=new stackimp.stacks();
        Scanner read = new Scanner(System.in);
        dv.pop();dv.push("qwer");dv.push("fghu");dv.push("bnmk");
        dv.pop();dv.peek();dv.print();
        stackimp.stacks1 ds=new stackimp.stacks1();
        ds.pop();ds.push(23);ds.push(45);ds.push(61);ds.print();
        ds.pop();ds.peek();ds.print();
        stackimp.stack2 da=new stackimp.stack2();
        da.pop();da.push('a');da.push('b');da.push('c');da.print();
        da.peek();da.print();da.addtobottom('p');
        da.reverse();
        da.print();
        da.size();
        da.addtoindex(2, 'a');
        da.print();
    }
}
