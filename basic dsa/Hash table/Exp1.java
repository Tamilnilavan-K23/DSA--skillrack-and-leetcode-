//pre-stroing and fetching the value

//disadvantage -memory only stores upto 10^9. beyond that it will rise segmentation error 
import java.util.*;
public class Exp1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array:");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
              arr[i]=sc.nextInt();
        }
       //prestoring
        int [] hash=new int[1000000000];
        for(int i=0;i<n;i++){
            int num=arr[i];

            hash[num]+=1;
            
        }

        //fetching

        System.out.println("enter the query:");
        int q=sc.nextInt();

        while(q>0){
            System.out.print("enter the query "+q+":");
            int value=sc.nextInt();
            System.out.println("the value is :"+hash[value]);
            q--;
        }
        sc.close();
    }
}