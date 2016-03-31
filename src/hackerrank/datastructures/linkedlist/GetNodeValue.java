package hackerrank.datastructures.linkedlist;

public class GetNodeValue {
	/*
	  Get Nth element from the end in a linked list of integers
	  Number of elements in the list will always be greater than N.
	  Node is defined as*/ 
	  class Node {
	     int data;
	     Node next;
	  }
	    
	int GetNode(Node head,int n) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method. 
	    Node p1=head;
	    Node p2=head;
	    int i=0,flag=0;
	    while(p1.next!=null){
	        if(i==n){
	            flag = 1;
	        }
	        i+=1;
	        if(flag == 1){
	            p2 = p2.next;
	        }
	        p1=p1.next;
	    }

	    return p2.data;

	}

}
