package LinkedList;

import java.util.Scanner;

public class NodeInLinkedList {

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

        public static int findNode(Node<Integer> head){
            Scanner s = new Scanner(System.in);
            Node<Integer> temp = head;
            int location =0;
            System.out.println("Enter value to find: ");
            int element = s.nextInt();
            while(temp.data!=element){
                temp=temp.next;
                location++;
            }
            return location;
        }


        public static void main(String[] args) {
        
            Node<Integer> head = takeInput();
            int location = findNode(head);
            System.out.println("Node found at location: " +location);
        }
    
    }
}