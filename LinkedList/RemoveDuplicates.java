package LinkedList;

import java.util.Scanner;

public class RemoveDuplicates {

    public static Node<Integer> takeInput(){
    
        Scanner s = new Scanner(System.in);
        Node<Integer> head = null, tail=null;
        int data = s.nextInt();
        while(data!= -1){
            Node<Integer> newNode = new Node<Integer>(data);
            if(head==null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next; // tail = newNode
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void printLinkedList(Node<Integer> head){
       
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }    
    }

    public static Node<Integer> removeDuplicates(Node<Integer> head){
        
       
        Node<Integer> temp = head;
        if(temp==null){
            return temp;
        }
        while(temp.next!=null){
            if( temp.next.data == temp.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        
        Node<Integer> head = takeInput();
        Node<Integer> tempHead = removeDuplicates(head);
        printLinkedList(tempHead);
    }
    
}
