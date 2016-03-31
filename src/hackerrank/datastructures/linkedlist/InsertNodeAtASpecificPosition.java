package hackerrank.datastructures.linkedlist;

public class InsertNodeAtASpecificPosition {
	/*
	  Insert Node at a given position in a linked list 
	  head can be NULL 
	  First element in the linked list is at position 0
	  Node is defined as */
	  class Node {
	     int data;
	     Node next;
	  }
	    

	Node InsertNth(Node head, int data, int position) {
	   // This is a "method-only" submission. 
	    // You only need to complete this method. 
	    Node p = head;
	    Node newNode = new Node();  
	    newNode.data = data;  
	    newNode.next = null;  
	    if(head == null){  
	         head = newNode;  
	    }
	    else{  
	     int i=0;  
	     while(p!=null){  
	       if(position == 0){  
	           newNode.next = p;  
	           head= newNode;  
	       }  
	       else if(i==position-1){  
	         newNode.next = p.next;  
	         p.next = newNode;  
	       }
	       i++;  
	       p= p.next;  
	     }  
	   }  
	   return head;  
	}


}
