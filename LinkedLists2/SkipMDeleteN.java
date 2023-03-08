package LinkedLists2;

import java.util.Scanner;

public class SkipMDeleteN {
    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
        // Your code goes here
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> temp2 = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == M) {
                int count2 = 0;
                while (count2 < N && temp2 != null) {
                    temp2 = temp2.next;
                    count2++;
                }
                temp.next = temp2;
                temp = temp2;
                count = 0;
            } else {
                temp = temp.next;
            }
        }
        return head;
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
            LinkedListNode<Integer> head = takeInput();
            System.out.println("Enter M and N: ");
            int M = s.nextInt();
            int N = s.nextInt();
            head = skipMdeleteN(head, M, N);
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    }
}
