import java.util.Scanner;
//write a program that print 1 to n using recursive function
public class Exp2 {
     static void callup(int i,int n){
             if(i>n) return;

             System.out.print(i+" ");
             callup(i+1, n);
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){

        
        System.out.print("enter the number of times name has to print:");
        int n=sc.nextInt();

        callup(1,n);

        sc.close();
        }
    }
     
}
