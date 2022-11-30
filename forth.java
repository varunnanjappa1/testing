

import java.util.*;

import bank.*;
class student{
    String name;
    char us;
    //student(student ob){          //copy constructor
    //    this.name=ob.name;
    //   this.us=ob.us;
    //}
    student(String v, char n){
        this.name=v;
        this.us=n;
    }
    void print(){
        System.out.println(this.name+" "+this.us);
    }
    int pi=(int)3.14;
    public int area(int i,int j){
        return pi*i*j;
    }
    public int area(int i,int j,int a){
        return pi*i*j*a;
    }
}
//class tam extends student{
//
//    tam(String v, char n) {
//        super(v, n);
//    }
//}
abstract class animal{
    abstract void eat();
    public void alive(){
        System.out.println("animal is alive");
    }
    public void dead(){
        System.out.println("animal is dead");
    }
}
class rat extends animal{
    void eat(){
        System.out.println("eats every thing");
        super.alive();
    }
}
class snake extends animal{
    void eat(){
        System.out.println("eats rats");
        super.dead();
    }
}
public class forth {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        bank.account acc=new bank.account();
        rat rat =new rat();
        rat.eat();
        snake s=new snake();
        s.eat();
        System.out.println("enter your name");
        acc.name=read.nextLine();
        System.out.println("your nameis :-"+acc.name);
        System.out.println("your emailID is:-"+acc.setemail(acc.name));
        System.out.println("your password is:-"+acc.getpassword(acc.name));
//        student oc=new student("var",'q');
//        tam as=new tam("arn",'e');        call for inheritance
//        as.print();
//        oc.name="var";oc.us='a';
//        student ob=new student(oc);       //call for copy constructor
//        oc.print();
//        System.out.println(oc.area(3,4)+" "+oc.area(3,4,5));      //function overload(compiletime)
    }
}
