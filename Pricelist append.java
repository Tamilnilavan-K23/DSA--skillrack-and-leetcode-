import java.util.*;
"""
class Invoice {
    int price;
    Invoice next;

    public Invoice(int price) {
        this.price = price;
        this.next = null;
    }
}

class SinglyLinkedList {
    public Invoice head = null;
    public Invoice tail = null;

    public void append(int price) {
        Invoice newInvoice = new Invoice(price);

        if (head == null) {
            head = newInvoice;
            tail = newInvoice;
        } else {
            tail.next = newInvoice;
            tail = newInvoice;
        }
    }
}
"""
class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        SinglyLinkedList sll = new SinglyLinkedList();

        for (int counter = 1; counter <= N; counter++) {
            int price = sc.nextInt();
            sll.append(price);
        }

        Invoice invoice = sll.head;
        while (invoice != null) {
            if (invoice.next != null) {
                System.out.print(invoice.price + "->");
            } else {
                System.out.print(invoice.price + "->NULL");
            }
            invoice = invoice.next;
        }
    }
}
