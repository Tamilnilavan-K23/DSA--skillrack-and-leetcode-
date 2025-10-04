import java.util.Scanner;
//write a program that print from name for the "n" number of time using recursive
public class Exp1 {

    public static void callup(int i,int n,String name){
             if(i>n) return;

             System.out.println("The name is :"+name);
             callup(i+1, n, name);
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){

        
        System.out.print("enter the number of times name has to print:");
        int n=sc.nextInt();
        System.out.print("enter the name:");
        String name=sc.next();

        callup(1,n,name);

        sc.close();
        }
    }
}
