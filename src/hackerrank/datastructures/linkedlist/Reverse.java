package hackerrank.datastructures.linkedlist;

public class Reverse {

	/*
	  Reverse a linked list and return pointer to the head
	  The input list will have at least one element  
	  Node is defined as*/  
	  class Node {
	     int data;
	     Node next;
	  }
	    // This is a "method-only" submission. 
	    // You only need to complete this method. 
	Node reverse(Node head) {

	    Node left = null;
	    Node curr = head;
	    Node right = null;
	    
	    while(curr!=null){
	        right = curr.next;
	        curr.next = left;
	        left = curr;
	        curr = right;
	    }
	    
	    head = left;
	    return head;
	}

}
