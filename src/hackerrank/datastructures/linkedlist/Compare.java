package hackerrank.datastructures.linkedlist;

public class Compare {

	/*
	  Compare two linked lists A and B
	  Return 1 if they are identical and 0 if they are not. 
	  Node is defined as*/ 
	  class Node {
	     int data;
	     Node next;
	  }
	int CompareLists(Node headA, Node headB) {
	    // This is a "method-only" submission. 
	    // You only need to complete this method 
	    Node p1 = headA;
	    Node p2 = headB;
	    
	    while(p1!=null && p2!=null){
	        if(p1.data == p2.data){
	            p1=p1.next;
	            p2=p2.next;
	        }
	        else{
	            break;
	        }
	    }
	    if(p1 == null && p2 == null){
	        return 1;
	    }
	    else{
	        return 0;
	    }
	}

}
