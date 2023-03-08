package LinkedLists2;

import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class MergeTwoSortedLL {
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1,
            LinkedListNode<Integer> head2) {
        // Your code goes here
        LinkedListNode<Integer> head = null, tail = null;

        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        //

        if (head1.data <= head2.data) {
            head = head1;
            tail = head1;
            head1 = head1.next;
        } else {
            head = head2;
            tail = head2;
            head2 = head2.next;
        }
        //
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                tail = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                tail = head2;
                head2 = head2.next;
            }
        }
        //
        if (head1 != null) {
            tail.next = head1;
        }
        if (head2 != null) {
            tail.next = head2;
        }
        return head;
    }

    // Taking input
    public static LinkedListNode<Integer> takeInput() {
        try (Scanner s = new Scanner(System.in)) {
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
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the number of test cases: ");
            int t = s.nextInt();
            while (t > 0) {
                LinkedListNode<Integer> head1 = takeInput();
                LinkedListNode<Integer> head2 = takeInput();
                LinkedListNode<Integer> head = mergeTwoSortedLinkedLists(head1, head2);
                print(head);
                t--;
            }
        }
    }
    private static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}