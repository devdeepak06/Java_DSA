package LinkedLists2;

import java.util.Scanner;

public class EvenAfterOddLL {
    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
        // Your code goes here
        LinkedListNode<Integer> head1 = null, tail1 = null, head2 = null, tail2 = null;
        while (head != null) {
            if (head.data % 2 == 0) {
                if (head2 == null) {
                    head2 = head;
                    tail2 = head;
                } else {
                    tail2.next = head;
                    tail2 = head;
                }
            } else {
                if (head1 == null) {
                    head1 = head;
                    tail1 = head;
                } else {
                    tail1.next = head;
                    tail1 = head;
                }
            }
            head = head.next;
        }
        if (head1 == null) {
            return head2;
        }
        tail1.next = head2;
        if (head2 != null) {
            tail2.next = null;
        }
        return head1;
    }

    public static LinkedListNode<Integer> takeInput() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the data: ");
            int data = s.nextInt();
            LinkedListNode<Integer> head = null, tail = null;
            while (data != -1) {
                LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
                data = s.nextInt();
            }
            return head;
        }
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases: ");
            int t = s.nextInt();
            while (t > 0) {
                LinkedListNode<Integer> head = takeInput();
                LinkedListNode<Integer> head3 = evenAfterOdd(head);
                while (head3 != null) {
                    System.out.print(head3.data + " ");
                    head3 = head3.next;
                }
                System.out.println();
                t--;
            }
        }
    }

}
