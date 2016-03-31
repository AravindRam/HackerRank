package hackerrank.datastructures.linkedlist;

public class DeleteDuplicates {

	/*
	Node is defined as*/ 
	  class Node {
	     int data;
	     Node next;
	  }

	Node RemoveDuplicates(Node head) {
	  // This is a "method-only" submission. 
	  // You only need to complete this method. 
	    Node p = head;
	    while(p.next!=null){
	        if(p.data == p.next.data){
	            p.next = p.next.next;
	        }
	        else{
	            p = p.next;
	        }
	    }

	    return head;
	}

}
