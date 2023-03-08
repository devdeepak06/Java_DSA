package LinkedLists2;

import java.util.Scanner;
class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class MidPointLL {

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        // Your code goes here
        // if (head == null || head.next == null) {
        //     return head;

        // }
        LinkedListNode<Integer> slow = head;
        LinkedListNode<Integer> fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //Taking input

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
                LinkedListNode<Integer> mid = midPoint(head);
                System.out.println(mid.data);
                t--;
            }
        }
    }
}