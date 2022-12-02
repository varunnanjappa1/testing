package bank;
import java.util.*;

public class account {
    Random read=new Random();
    public String name;
    public String password;
    public String email;
    public String setemail(String name){
        String newstring=name+"@gmail.com";
        return newstring;
    }
    public String getpassword(String name){
        int s=read.nextInt(10000,100000);
        String add=String.valueOf(s);
        return (name+add);
    }
}

class bank {
    public static void main(String[] args) {
    account account1=new account();
    Scanner re=new Scanner(System.in);
    account1.name="qwerty";
    System.out.println(account1.name);

 }
    
}  




