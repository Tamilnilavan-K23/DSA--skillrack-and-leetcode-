import java.util.*;
//write the prgm print from 1 to n using recusive but in backtracking format(like dont use i+1 functionalites)
public class Exp4 {

    static void callup(int i,int n){

        if (i>1)return;
        callup(i-1, n);
        System.out.println(i+" ");
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        callup(n,n);
        sc.close();
    }
}
