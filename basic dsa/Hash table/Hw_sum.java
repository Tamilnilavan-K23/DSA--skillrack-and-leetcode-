
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


//find the highest and lowest frequency elements from the given array
public class Hw_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        HashMap <Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            //pre computing
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        }
        //iterate
       /*  only key values
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(var it: hash.entrySet()){
            if(max < it.getValue()) max=it.getValue();
            else { min=it.getValue();}
           // System.out.println(it.getKey()+"->"+it.getValue());
        }
         System.out.println("The maximum and minimun frequency of the given array is:"+max+" "+min);
         
    
         //keys with values
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int max_key=Integer.MIN_VALUE;
        int min_key=Integer.MAX_VALUE;
        for(var it: hash.entrySet()){
            if(max < it.getValue()) {
                max=it.getValue();
                max_key=it.getKey();
            }
            else { 
                min=it.getValue();
                min_key=it.getKey();
            }
           
        }
        System.out.println("The maximum and minimun frequency of the given array is:"+max_key+"->"+max+","+min_key+"->"+min);
         */

        //multiple key with same value for the maxi and mini
        List<Integer> max_keys=new LinkedList<>();
        List<Integer> min_keys=new LinkedList<>();

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

         for(var it: hash.entrySet()){
            if(max < it.getValue()) {
                max=it.getValue();
                max_keys.add(it.getKey());
            }
            else { 
                min=it.getValue();
                min_keys.add(it.getKey());
            }
        }
        System.out.println("the maximum frequency of the elements in the given array is:");
        for (Integer max_key : max_keys) {
            System.out.println(max_key+"->"+max);
        }
        System.out.println("the minimum frequency of the elements in the given array is:");
        for (Integer min_key : min_keys) {
            System.out.println(min_key+"->"+min);
        }


        sc.close();
    }
}
