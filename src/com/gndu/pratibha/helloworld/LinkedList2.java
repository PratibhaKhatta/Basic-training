package com.gndu.pratibha.helloworld;

public class LinkedList2
{
	 Node head;
	 static class Node
	 {
		 int data;
		 Node next;
		 Node(int d)
		 {
			 data=d;
			 next=null;
		 }
	 }
	 public void printout()
	 {
		 Node n = head;
		 while(n!=null)
		 {
			 System.out.println(n.data + "");
			 n.next;
		 }
	 }
	 public static void main(String args[])
	 {
		 LinkedList list =new LinkedList();
		 list.head =new Node(1);
		 list.second =new Node(2);
		 list.third = new Node(3);
		 list .fourth = new Node(4);
		 list.print();
	 }

}
