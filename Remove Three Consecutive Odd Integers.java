import java.util.*;

public class Hello {

    static int size = 0, MAX = 1000;
    static int arr[] = new int[MAX];

    private static void append(int val) {
        arr[size++] = val;
    }

    private static void removeLast() {
        size--;
    }

    private static int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
"""
        int n = sc.nextInt();
        int num_e = 0, num_o = 0;

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();

            if (value % 2 == 0) {
                num_e++;
                num_o = 0; 
            } else {
                num_o++;
                num_e = 0; 
            }

            append(value);

            if (num_e == 3 || num_o == 3) {
                for (int j = 0; j < 3; j++) {
                    removeLast();
                }
                num_e = 0; 
                num_o = 0; 
            }
        }
"""
        for (int index = 0; index < getSize(); index++) {
            System.out.print(arr[index] + " ");
        }
    }
}
