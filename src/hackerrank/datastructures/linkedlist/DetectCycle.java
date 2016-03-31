package hackerrank.datastructures.linkedlist;

public class DetectCycle {

	/*
	  Detect cycle in the list
	  head pointer input could be NULL as well for empty list
	  Node is defined as*/
	
	  class Node {
	     int data;
	     Node next;
	  }
	  
	int HasCycle(Node head) {
	    Node p1 = head;
	    Node p2 = head;
	    while(p1!=null){
	        p1 = p1.next.next;
	        p2 = p2.next;
	        
	        if(p1 == p2){
	            return 1;
	        }
	        
	    }

	    return 0;
	}

}
