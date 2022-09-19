package LinkedList;

import java.util.Scanner;



public class AppendNNodes {
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

    public static Node<Integer> append(Node<Integer> head,int nodeNum){
        
        Node<Integer> temp = head;
        Node<Integer> t = head;
        int i = -nodeNum;
        while(temp.next!=null){
            if(i>=0){
                t = t.next;
            }
            temp = temp.next;
            i++;
        }
        temp.next = head;
        head = t.next;
        t.next = null;
        
        return head;
    }

    public static void printLinkedList(Node<Integer> head){
       
        Node<Integer> temp = head;
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        
    }

    public static void main(String[] args) {
        
        Node<Integer> head = takeInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter node number: ");
        int nodeNum = sc.nextInt();
        Node<Integer> tempHead = append(head, nodeNum);
        printLinkedList(tempHead);
    }
}
