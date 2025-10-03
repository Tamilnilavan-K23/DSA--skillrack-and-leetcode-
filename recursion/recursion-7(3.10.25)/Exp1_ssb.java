
//find the subsequence pair whose target element
/*
 * input->example arr=[1,2,1]
 * output->[2],[1,1]
 */
import java.util.*;
public class Exp1_ssb {

    static void ssb(int ind,int []arr,int n,ArrayList<Integer> ds,int target){
        if(ind>=n){
            int sum=0;
            for (Integer value : ds) {
                sum+=value;
            }
            if(sum==target){
                    System.out.println("["+ds+"]");
            }
            System.out.println();
            return;
        }

        ssb(ind+1, arr, n, ds, target);
        ds.add(arr[ind]);
        ssb(ind+1, arr, n, ds, target);
        ds.remove(ds.size()-1);
    }
public static void main(String[] args) {
    try(Scanner sc =new Scanner(System.in);){
        System.out.print("enter the size:");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        int [] arr=new int[n];
        ArrayList<Integer> ds=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the target value:");
        int target=sc.nextInt();
        System.out.println("the subsequence are:");
        ssb(0,arr,n,ds,target);
    }
}
}
