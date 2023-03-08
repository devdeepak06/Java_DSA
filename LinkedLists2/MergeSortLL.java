package LinkedLists2;

import java.util.Scanner;

public class MergeSortLL {
    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        //Your code goes here
        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> mid = MidPointLL.midPoint(head);    
        LinkedListNode<Integer> head1 = head;
        LinkedListNode<Integer> head2 = mid.next;
        mid.next = null;
        head1 = mergeSort(head1);
        head2 = mergeSort(head2);
        LinkedListNode<Integer> head3 = MergeTwoSortedLL.mergeTwoSortedLinkedLists(head1, head2);
        return head3;
        
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
                LinkedListNode<Integer> head3 = mergeSort(head);
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
