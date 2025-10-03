import java.util.*;
//find the factorial of the number 
public class Exp2 {

    static int factorial(int n){

        if(n==0) return 1;
    
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            int n=sc.nextInt();
            int res=factorial(n);
            System.out.println("the factorial of given number "+n+"is:"+res);
        }
    }
}
