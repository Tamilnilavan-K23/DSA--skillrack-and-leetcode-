import java.util.*;
"""
class Invoice{
    int price ;
    Invoice next;

   public Invoice(int price){
              this.price=price;
              this.next=null;
    }
    
}

public class SinglyLinkedlist{
    public Invoice head=null;
    public Invoice tail=null;
    
    public void prepend(price){
        Invoice node=new Invoice(price);
        if (head==null){
            head=node;
            tail=node;
        }else{
            node.next=head;
            head=node;
        }
    }
}
"""
class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, counter, price;
        N = sc.nextInt();
        SinglyLinkedList sll = new SinglyLinkedList();
        for (counter = 1; counter <= N; counter++) {
            price = sc.nextInt();
            sll.prepend(price);
        }
        Invoice invoice = sll.head;
        while (invoice != sll.tail) {
            System.out.print(invoice.price + "->");
            invoice = invoice.next;
        }
        System.out.println(invoice.price + "->NULL");
    } // End of main function
} // End of Hello class
