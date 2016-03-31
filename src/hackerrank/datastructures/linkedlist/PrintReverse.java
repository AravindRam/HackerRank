package hackerrank.datastructures.linkedlist;

public class PrintReverse {
	
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as*/ 
	  class Node {
	     int data;
	     Node next;
	  }
	    // This is a "method-only" submission. 
	    // You only need to complete this method. 

	void ReversePrint(Node head) {
	  // This is a "method-only" submission. 
	  // You only need to complete this method. 
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
	    Node p = head;
	    while(p!=null){
	        System.out.println(p.data);
	        p=p.next;
	    }
	}


}
