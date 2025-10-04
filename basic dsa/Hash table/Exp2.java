// character hashing 
import java.util.Scanner;

public class Exp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String str=sc.nextLine();

        //pre compute
        //int [] hash=new int[26];//for lowercase
        //int [] hash=new int[26];//for uppercase
        int [] hash=new int[256]; //for both upper and lower case
        for(int i=0;i<str.length();i++){
            //System.out.println(str.charAt(i) + " → " + (str.charAt(i) - 'a'));
            //hash[str.charAt(i) - 'a']++;
            //hash[str.charAt(i) - 'A']++; for uppercase
            hash[str.charAt(i)]++; //for both upper and lower case
        }

        System.out.println("enter the query:");
        int q=sc.nextInt();

        while(q>0){
            System.out.print("enter the query "+q+":");
            char value=sc.next().charAt(0);
            System.out.println("the value is :"+hash[value]);
            q--;
        }
        sc.close();
    }
}
