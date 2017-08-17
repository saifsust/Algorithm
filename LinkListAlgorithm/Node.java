package com.LinkListAlgorithm;

public class Node {

	public int value;
	public Node nextNode;

	public Node() {
	}

	public Node(int value) {
		this.value = value;
	}



	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", nextNode=" + nextNode + "]";
	}



}
