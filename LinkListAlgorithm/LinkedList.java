package com.LinkListAlgorithm;

public class LinkedList {

	public static void main(String[] args) {
		Node firstNode = new Node(5);

		Node second = new Node(100);
		firstNode.nextNode = second;
		Node third = new Node(200);
		second.nextNode = third;
		third.nextNode = null;

		// System.out.println(firstNode.getValue());

		Node node = firstNode;

		while (true) {
			System.out.println(node.getValue());
			if(node.nextNode==null)break;
			node = node.nextNode;

		}

	}

}
