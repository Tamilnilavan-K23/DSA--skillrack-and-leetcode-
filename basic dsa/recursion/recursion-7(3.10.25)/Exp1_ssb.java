//find the subsequence pair whose target element
/*
 * input->example arr=[1,2,1],target = 2 
 * output->[2],[1,1]
 * cases
 * 1)print all the subsequence-ssb and ssb2
 * 2)print the first occurence of the target value-ssb3
 * 3)count the no of occurence for the taget value
 */
import java.util.*;
public class Exp1_ssb {

    static void ssb(int ind,int []arr,int n,ArrayList<Integer> ds,int target){
        if(ind==n){
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

    
    static void ssb2(int ind,int sum,int []arr,int n,ArrayList<Integer> ds,int target){
        if(ind==n){
            if(sum==target){
                    System.out.println("["+ds+"]");
            }
            System.out.println();
            return;
        }

        
        ds.add(arr[ind]);
        sum+=arr[ind];

        ssb2(ind+1,sum,arr, n, ds, target);

        sum-=arr[ind];
        ds.remove(ds.size()-1);

        ssb2(ind+1,sum,arr, n, ds, target);
    }

    static boolean  ssb3(int ind,int sum,int []arr,int n,ArrayList<Integer> ds,int target){
        if(ind==n){
            if(sum==target){
                    System.out.println("["+ds+"]");
                    return true;
            }
            return false;
        }

        ds.add(arr[ind]);
        sum+=arr[ind];

        if(ssb3(ind+1,sum,arr, n, ds, target)==true){
            return true;
        }

        sum-=arr[ind];
        ds.remove(ds.size()-1);

        return ssb3(ind+1,sum,arr, n, ds, target)==true;

    }
    static int ssb4(int ind,int sum,int []arr,int n,int target){
        if(ind==n){
            if(sum==target) return 1;
            else return 0;
        }

        
        sum+=arr[ind];
        int l=ssb4(ind+1,sum,arr, n, target);

        sum-=arr[ind];
        int r=ssb4(ind+1,sum,arr, n, target);

        return l+r;

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
        //System.out.println("the subsequence are:");
        //ssb(0,arr,n,ds,target);//my method 
        //ssb2(0,0,arr,n,ds,target);//striver method

        //ssb3(0,0,arr,n,ds,target);// only print first occurrence of the target value
        
        int res=ssb4(0,0,arr,n,target); //only print count of the occurence of the target value
        System.out.println("the count of the subsequence are:"+res);
    }
}
}
