package com.prep;

 class Node {
	int key;
	Node left;
	Node right;
	public Node(int data) {
		key = data;
		left = right = null;
	}
}

 public class TreeNode {
	Node root;
	public TreeNode() {
		root = null;
	}

	public void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.key + " ");
		preOrder(node.left);
		preOrder(node.right);
	}
	public void printPreOrder() {
		preOrder(root);
	}
	
	public int height(Node node) {
		if(node == null)
			return 0;
		else {
			int leftHeight = height(node.left);
			int rightHeight = height(node.right);
			if(leftHeight > rightHeight)
				return (leftHeight + 1);
			else 
				return (rightHeight  + 1);
		}
	}
	public void printHeight() {
		System.out.println(height(root));
	}

	public static void main(String[] args) {
		TreeNode obj = new TreeNode();
		obj.root  = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		obj.printPreOrder();
		obj.printHeight();
	}
}