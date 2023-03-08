package LinkedLists2;

import java.util.Scanner;

public class DeleteNode {
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        //Your code goes here
        if(pos==0)
        {
            return head.next;
        }
        LinkedListNode<Integer> temp=head;
        int i=0;
        while(i<pos-1)
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            while (t > 0) {
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
                int pos = s.nextInt();
                head = deleteNode(head, pos);
                print(head);
                t--;
            }
        }
    }

    private static void print(LinkedListNode<Integer> head) {
    }


}
