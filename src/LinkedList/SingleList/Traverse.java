<<<<<<< HEAD
package LinkedList.SingleList;
=======
package src.LinkedList.SingleList;
>>>>>>> ffea507eef11944b24dcf1ba48314fd91841be3f

public class Traverse {
    public static void main(String[] args) {
        // Initializing an array
        int[] arr = {2, 5, 8, 7};
        // Creating a linked list manually
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        // Traversing the linked list and printing data
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
