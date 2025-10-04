import java.util.Scanner;
//write the prgm to print the number in reverse order from user input using recursive call
public class Exp3 {
    static void callup(int n){
             if(1>n) return;

             System.out.print(n+" ");
             callup(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of times name has to print:");
        int n=sc.nextInt();

        callup(n);

        sc.close();
    }
     
}
