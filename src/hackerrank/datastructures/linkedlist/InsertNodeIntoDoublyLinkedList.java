package hackerrank.datastructures.linkedlist;

public class InsertNodeIntoDoublyLinkedList {
	
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as */
	  class Node {
	     int data;
	     Node next;
	     Node prev;
	  }

	Node SortedInsert(Node head,int data) {
	    
	    Node newNode = new Node();
	    newNode.data = data;
	    newNode.next = null;
	    newNode.prev = null;
	    
	    if(head == null){
	        head = newNode;
	    }
	    else{
	        Node p = newNode;
	        newNode.next = head;
	        head = newNode;
	        while(newNode!=null){
	            p=newNode;
	            newNode = newNode.next;
	            if(newNode!=null){
	                if(p.data > newNode.data){
	                    int temp = p.data;
	                    p.data = newNode.data;
	                    newNode.data = temp;
	                }
	            }
	        }
	    }
	   return head;
	}


}
