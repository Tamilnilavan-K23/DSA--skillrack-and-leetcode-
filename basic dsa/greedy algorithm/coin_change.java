import java.util.*;

public class coin_change{

         static Map<Integer,Integer>  greedy_coin(Integer [] arr,int amt){
            Arrays.sort(arr,Collections.reverseOrder());
            Map<Integer,Integer> result=new HashMap<>();
            
            for (int coin: arr) {
                if (coin<=amt){
                    int count=(int)amt/coin;
                    amt%=coin;
                     result.put(coin, count);
                }

                if (amt == 0) break;
            }

            if (amt >0) {
                     System.out.println("change not possible");
                    return new HashMap<>();
            }
           
            else return result;
         }

    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
           
            System.out.print("Enter the size of the array for the possible traits:");
             int size=sc.nextInt();

             Integer [] arr=new Integer[size];

             for (int i = 0; i < arr.length; i++) {
                System.out.print("enter the elment of "+(i+1)+":");
                //int value=;
                arr[i]=sc.nextInt();
             }

             System.out.print("enter the give me the number to find out the minimun coin can be used:");
             int cur=sc.nextInt();
             Map<Integer,Integer> value;
             value=greedy_coin(arr,cur);
            
            if (!value.isEmpty()) {
                    System.out.println("Coins used to make change:");
            for (Map.Entry<Integer, Integer> entry : value.entrySet()) {
                        System.out.println(entry.getKey() + " coin x " + entry.getValue() + " times");
    }
}
        }
    }
}