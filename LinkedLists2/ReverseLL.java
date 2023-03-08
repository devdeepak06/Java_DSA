//Reverse a LL (recursive)


package LinkedLists2;

import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class ReverseLL {
    public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> temp=reverse_R(head.next);
        head.next.next=head;
        head.next=null;
        return temp;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases: ");
            int t = s.nextInt();
            while (t > 0) {
                System.out.println("Enter the data: ");
                int data = s.nextInt();
                LinkedListNode<Integer> head = null, tail = null;

                while (data != -1) {
                    LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
                    if (head == null || head.next == null) {
                        head = newNode;
                        tail = newNode;
                    } else {
                        tail.next = newNode;
                        tail = newNode;
                    }
                    data = s.nextInt();

                }
                // deleteNode using below function
                head = reverse_R(head);
                print(head);
                t--;
            }
        }
    }

    private static void print(LinkedListNode<Integer> head) {
    }

}
