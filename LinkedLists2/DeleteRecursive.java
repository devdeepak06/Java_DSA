package LinkedLists2;

import java.util.Scanner;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class DeleteRecursive {
    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
        //Your code goes here
        if(pos==0)
        {
            return head.next;
        }
        if(head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> temp=deleteNodeRec(head.next,pos-1);
        head.next=temp;
        return head;
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
                System.out.println("Enter the position: ");
                int pos = s.nextInt();
                // deleteNode using below function
                

                head = deleteNodeRec(head, pos);
                print(head);
                t--;
            }
        }
    }

    private static void print(LinkedListNode<Integer> head) {
    }
}