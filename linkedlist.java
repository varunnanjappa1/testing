import sixth.*;

import java.util.*;

public class linkedlist{
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        sixth.LL sem=new sixth.LL();
        int ch,n;
        for(;;){
            System.out.println(".......enter your choice.......");
            System.out.print("1:add elements to linkedlist\n"+"2:delete elements from linkedlist\n"+"3:display elements of linkedlist\n"+"4:reverse the linkedlist\n"+"5:check for palendrome\n"+"6:size of linkedlist\n"+"7:find data of a particular index\n"+"8:check for loops and remove them\n");
            System.out.println("choice:-");
            ch=read.nextInt();
            switch(ch){
                case 1:{
                    System.out.println("...enter the no of elements you want to enter:-");
                    n=read.nextInt();
                    System.out.println("...enter the type of data...");
                    System.out.print("1:data type:- integer\n"+"2:data type:- character\n"+"3:data type:- string\n");
                    int ch1=read.nextInt();
                    switch(ch1){
                        case 1:{
                            System.out.println("enter "+n+" integer elements(one by one).");
                            for(int i=0;i<n;i++){
                                Integer ass=read.nextInt();
                                String ast=Integer.toString(ass);
                                sem.addback(ast);
                            }
                        }break;
                        case 2:{
                            System.out.println("enter "+n+" characters(one by one).");
                            for(int i=0;i<n;i++){
                                char ass=read.next().charAt(0);
                                String ast=Character.toString(ass);
                                sem.addback(ast);
                            }
                        }break;
                        case 3:{
                            System.out.println("enter "+n+" string elements(one by one).");
                            for(int i=0;i<n;i++){
                                String ast=read.next();
                                sem.addback(ast);
                            }
                        }break;
                        default: System.out.println("other data types are not avilable");
                    }
                }break;
                case 2:{
                    System.out.println("..enter the no of elements you want to delete :-");
                    n=read.nextInt();
                    System.out.println("...enter the type of delete...");
                    System.out.print("1:delete from front\n"+"2:delete from back\n"+"3:delete the index('s) from behind\n");
                    int ch1=read.nextInt();
                    switch(ch1){
                        case 1:{
                            for(int i=0;i<n;i++){
                                sem.delfront();
                            }
                        }break;
                        case 2:{
                            for(int i=0;i<n;i++){
                                sem.delback();
                            }
                        }break;
                        case 3:{
                            System.out.println("enter the index('s) you want to delete(one by one).");
                            sem.print();
                            for(int i=0;i<n;i++){
                                int ass=read.nextInt();
                                sem.delintex(ass);
                            }
                        }
                    }
                }break;
                case 3:{
                    System.out.print("the elements are:- ");
                    sem.print();
                }break;
                case 4:{
                    System.out.print("the original list:- "); 
                    sem.print(); System.out.println();
                    System.out.print("the reverse list:- ");
                    sem.reverse();
                }break;
                case 5:{
                    System.out.println("is th linkedlist palendrome?");
                    System.out.println(sem.pal());
                }break;
                case 6:{
                    System.out.print("the size of linkedlist is:- ");
                    int size=sem.sizelist();
                    System.out.println(size);
                }break;
                default:System.out.println("error");
            }
        }
    }
}
