package hackerrank.datastructures.linkedlist;

public class FindMergeNode {
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as*/ 
	  class Node {
	     int data;
	     Node next;
	  }
	@SuppressWarnings("null")
	int findMergeNode(Node headA, Node headB) {
	    // Complete this function
	    // Do not write the main method. 

	    Node p1 = headA;
	    Node p2 = null;
	    while(p1!=null){
	        p2 = headB;
	        while(p2!=null){
	            if(p1.data == p2.data){
	                return p1.data;
	            }
	            p2 = p2.next;
	        }
	        p1 = p1.next;
	    }
	    return p1.data;
	}

}
