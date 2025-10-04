import java.util.*;

public class Subsequence {

    static void ssb(int ind,int [] arr,int n,ArrayList<Integer> ds){
        if(ind >= n){
            if(ds.isEmpty()) System.out.println("{}");
            else{
                 for (int d : ds) {
                 System.out.print(d);
                 }
                System.out.println();
            }
             return;
        }

    //not take or picking the specific value for the subsequence
    ssb(ind+1,arr,n,ds);
    //take or pick the specific value for the subsequence
    ds.add(arr[ind]);
    ssb(ind+1,arr,n,ds);
    ds.remove(ds.size()-1);
    }
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.print("enter the size of the array:");
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            ArrayList<Integer> ds=new ArrayList<>();
            System.out.println("The subsequnece is :");
            ssb(0,arr,n,ds);
        }
    }
}
