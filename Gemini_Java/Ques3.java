//Write a Java program to implement a simple linked list and add elements to it in the beginning.

import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class Ques3 {
    Node head;
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head =  new_node;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print( " -> " +tnode.data);
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Ques3 llist = new Ques3();
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            llist.push(data);
        }
        llist.printList();        
    }
}
