package LinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
    
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

    public static Node<Integer> InsertNode(Node<Integer> head,int data,int pos){

        Node<Integer> newNode = new Node<Integer>(data);
        if(pos==0){
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node<Integer> temp = head;
        int i=0;
        while(i<pos-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void DeleteNode(Node<Integer> head,int pos){
        
        Node<Integer> temp = head;
        int i=0;
        while(i<pos-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    public static void printLinkedList(Node<Integer> head){
       
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        
    }

    public static int lengthOfLinkedList(Node<Integer> head){
       
        int count=0;
        Node<Integer> temp = head;
        while(temp!=null){
            temp=temp.next;
            count = count+1;
        }
        return count;
        
    }

    public static void main(String[] args) {
        
        Node<Integer> head = takeInput();

    }
}
