package LinkedLists2;

import java.util.Scanner;

public class FindaNodeInLL {
    public static int findNode(LinkedListNode<Integer> head, int n) {
        //Your code goes here
        int count = 0;
        while (head != null) {
            if (head.data == n) {
                return count;
            }
            count++;
            head = head.next;
        }
        return -1;
    }
    public static LinkedListNode<Integer> takeInput(){
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
                System.out.println("Enter the number to be searched: ");
                int n = s.nextInt();
                System.out.println(findNode(head, n));
                t--;
            }
        }

    }

}
