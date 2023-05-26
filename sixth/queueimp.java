package sixth;



public class queueimp {
    public static class queue1{                             // queue using stack
        int arr[];
        int size;
        int rear=-1;
        queue1(int size){
            arr=new int[size];
            this.size=size;
        }
        public boolean isempty(){
            return (rear==-1);
        }
        public void print(){
            int i=0;
            int r=rear+1;
            while(i!=r){
                System.out.print(" "+arr[i]);
                i++;
            }
        }
        public void add(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public void remove(){
            if(isempty()){
                System.out.println("queue is empty");
                return;
            }
            for(int i=0;i<rear;i++)
                arr[i]=arr[i+1];
            rear--;
            System.out.println();
        }
        public int peek(){
            if(isempty()){
                System.out.println("queue is empty");
                return rear;
            }
            int front=arr[0];
            return front;
        }
    }
    public static class cqueue{                         //cqueue using stack                                                  
        int arr[];
        int size;
        int rear=-1;
        int front=-1;
        cqueue(int size){
            arr=new int[size];
            this.size=size;
        }
        public boolean isempty(){
            return (rear==-1&&front==-1);
        }
        public boolean isfull(){
            return((rear+1)%size==front);
        }
        public void print(){
            int i=front;
            int r=(rear+1)%size;
            System.out.println();
            while(i!=r){
                System.out.print(" "+arr[i]);
                i++;
            }
        }
        public void add(int data){
            if(isfull()){
                System.out.println("queue is full");
                return;
            }
            if(front==-1)
                front=0;
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public void remove(){
            if(isempty()){
                System.out.println("queue is empty");
                return;
            }
            if(rear==front)
                rear=front=-1;
            front=(front+1)%size;
        }
        public int peek(){
            if(isempty()){
                System.out.println("queue is empty");
                return rear;
            }
            System.out.println();
            int f=arr[front];
            return f;
        }
    }
    public static class node{                       //queue using linkedlist
        node head=null;
        node tail=null;
        String data;
        node next;
        node(String data){
            this.data=data;
            next=null;
        }
        public boolean isempty(){
            return(head==null&&tail==null);
        }
        public void print(){
            if(isempty()){
                System.out.println("queue is empty");
                return;
            }
            node curr=head;
            while(curr!=null){
                System.out.print(" "+curr.data);
                curr=curr.next;
            }

        }
        public void add(String data){
            node fat=new node(data);
            if(isempty()){
                tail=head=fat;
                return;
            }
            tail.next=fat;
            tail=fat;
        }
        public void remove(){
            if(isempty()){
                System.out.println("queue is empty");
                return;
            }
            if(head==tail)
                tail=null;
            head=head.next;
            System.out.println();
        }
    }
    
}


class sum{
    public static void main(String[] args) {
        queueimp.queue1 sw=new queueimp.queue1(10);
        sw.add(23);sw.add(45);sw.add(67);
        System.out.println(sw.peek());sw.print();sw.remove();sw.print();
        queueimp.cqueue se=new queueimp.cqueue(10);
        se.add(29);se.add(90);se.add(34);
        se.print();se.remove();se.print();
        System.out.println(se.peek());
        queueimp.node sq=new queueimp.node("null");
        sq.print();sq.add("qwee");sq.add("asdf");sq.add("fghj");
        sq.print();sq.remove();sq.print();
    }
}
