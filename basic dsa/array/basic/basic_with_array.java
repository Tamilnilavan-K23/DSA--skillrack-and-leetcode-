import java.util.*;
//attempt 1
/* 
class CustomArray{
       private int[] data;
       private int size;

       public CustomArray(int size){
               data=new int[size];
       }

       public void insert_value(int value){
            if(data.length<=size){
                System.out.println("the array size is full. cant inser the element:"+value);
            }
            data[size]=value;
            size++;
        }
}


public class basic_with_array{
    public static void main(String[] ags){
            try(Scanner sc=new Scanner(System.in)) {
                  int size;
                  System.out.print("Enter the size of the Array:");
                  size=sc.nextInt();
                  CustomArray ar=new CustomArray(size);

                  ar.insert_value(10);
                  System.out.println("inserted value succesfully");
            }
            
    }
}
*/

//attempt 2


class Custom_arr{
    private int[] array;
    private int size;

    Custom_arr(int size){
        array=new int [size];
    }
    void insert(int element){
        if(array.length<=size){
            System.out.println("the array is full capacity and cant insert the value:"+element);
        }
        array[size]=element;
        size++;
    }

    void display(int size){
        System.out.println("The element in the array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    void delete_first(int value){
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i-1];
        }
        size--;
    }

    void delete_last(int value){
        size--;
    }
    void delete(int value){
        if(array.length==0) System.out.println("the array is empty!!");
        
        if (array[0]==value) delete_first(value);
        else if (array[size-1]==value) delete_last(value);
       else {
              for (int i = 0; i < array.length; i++) {
            if(array[i]==value){
                
            }
        }
       } 
        System.out.println("the element"+value+"is not found!!");
    }

}

public class basic_with_array{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int capacity;
            System.out.print("Enter the size of the Array:");
            capacity=sc.nextInt();

            Custom_arr arr=new Custom_arr(capacity);

            for(int i=0;i<capacity;i++){
                int value;
                System.out.print("Enter the value of the element "+(i+1)+":");
                value=sc.nextInt();
                arr.insert(value);
            }
            arr.display(capacity);
        }
    }
}