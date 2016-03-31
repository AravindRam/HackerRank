package hackerrank.datastructures.linkedlist;

public class DeleteNode {
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as */
	  class Node {
	     int data;
	     Node next;
	  }
	    // This is a "method-only" submission. 
	    // You only need to complete this method. 

	Node Delete(Node head, int position) {
	  // Complete this method
	    Node p = head;
	    if(position == 0){
	        head = head.next;
	    }
	    else{
	        int i=0;
	        while(p!=null){
	            if(i == position-1){
	                p.next = p.next.next;
	                break;
	            }
	            else{
	                p=p.next;
	            }
	            i+=1;
	        }
	    }
	    return head;
	}


}
