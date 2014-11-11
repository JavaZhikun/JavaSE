package lesson6;

public class Node2Test {
	
	public static void main(String[] args) {
		
		//Ë«ÏòÁ´±í
		
		Node2 node1 = new Node2("node1");
		Node2 node2 = new Node2("node2");
		Node2 node3 = new Node2("node3");
		
		node1.next = node2;
		node2.prevois = node1;
		
		node2.next = node3;
		node3.prevois = node2;
		
		node3.next = node1;
		node1.prevois =node3;
		
		System.out.println("---------------------");
		
		Node2 node4 = new Node2("node4");
		
		node1.next = node4;
		node4.prevois = node1;
		
		node4.next = node2;
		node2.prevois = node4;
		
		System.out.println("--------------------------");
		
		node1.next = node2;
		node2.prevois = node1;
		
		node4.prevois = null;
		node4.next = null;
		
		
		
	}

}
