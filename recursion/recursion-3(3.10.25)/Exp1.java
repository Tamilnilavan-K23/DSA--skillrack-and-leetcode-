import java.util.*;
//find the sum of given "n" number 
public class Exp1{
   /* 
    public static void func(int i,int sum){
        if(i<1){
             System.out.print(sum);
             return;
        }
        func(i-1, sum+i);
    }
    */

     public static int  func2(int i){
        if(i==0){
             return 0;
        }
        return i+func2(i-1);
    }
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number to find the sum of it to 1:");
            int n=sc.nextInt();
            //int sum=0;
            //System.out.println("the sum of the "+n+" is:");
            //func(n,sum);//this is parameterized recursion
            int res=func2(n); //this is functional recusion
            System.out.println("the sum of the "+n+" is:"+res);
        }
    }
}