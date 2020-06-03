package com.binarysearchtree;

public class Tree {

	TreeNode root;

	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
		} else {
			root.insert(value);
		}
	}

	public boolean findIfValueExist(int data) {
		return root.findIfValueExist(data);
	}

	public void inorderTraversal() {
		root.inorderTraversal();
	}

	public int getMax() {
		return root.getMax();
	}

	public void kthLargestElement(int k) {
		root.getKthMaxElement(k);
	}

	public void findPairOfNodeWithGivenSum(int sum) {
		root.findPairOfNodeWithGivenSum(sum);
	}

	public void mirrorImageOfTree() {
		if(root == null)
			return;
		root.mirrorImageOfTree();
	}
}
