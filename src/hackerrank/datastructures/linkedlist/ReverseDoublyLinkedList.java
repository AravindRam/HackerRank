package hackerrank.datastructures.linkedlist;

public class ReverseDoublyLinkedList {

	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as */
	  class Node {
	     int data;
	     Node next;
	     Node prev;
	  }

	Node Reverse(Node head) {
	    Node cur = head;
	    Node p = new Node();
	    while(cur!=null){
	        p.next = cur.next;
	        p.prev = cur.prev;
	        cur.next = p.prev;
	        cur.prev = p.next;
	        cur = p.next;
	        if(cur!=null){
	            head = cur;
	        }
	    }
	    return head;
	}


}
