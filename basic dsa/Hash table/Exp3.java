import java.util.HashMap;
import java.util.Scanner;
// to overcome the space proble of 10^9 , we use hashmap to map given specfic value 
public class Exp3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<n;i++){
            System.out.print("enter the elements:");
            arr[i]=sc.nextInt();
            //precompute
            hash.put(arr[i],hash.getOrDefault(arr[i], 0)+1);
        }

        for (var it : hash.entrySet()) {
              System.out.println(it.getKey()+"->"+it.getValue());
        }

        System.out.println("enter the query:");
        int q=sc.nextInt();

        while(q>0){
            System.out.print("enter the query "+q+":");
            int value=sc.nextInt();
            //fetching
            System.out.println("the value is :"+hash.getOrDefault(value, 0));
            q--;
        }

        sc.close();
    }
}
