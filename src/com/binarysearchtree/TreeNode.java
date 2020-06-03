package com.binarysearchtree;

import java.util.HashSet;
import java.util.Set;

public class TreeNode {
	private int value;
	private TreeNode leftChild;
	private TreeNode rightChild;
	static int count = 0;
	static Set<Integer> set = new HashSet<Integer>();

	public TreeNode(int value) {
		this.value = value;
		leftChild = null;
		rightChild = null;
	}

	public boolean findIfValueExist(int data) {
		if (value == data) {
			return true;
		}
		if (data < value) {
			if (leftChild == null) {
				return false;
			} else {
				return leftChild.findIfValueExist(data);
			}
		} else if (data > value) {
			if (rightChild == null) {
				return false;
			} else {
				return rightChild.findIfValueExist(data);
			}
		}
		return false;
	}

	public void insert(int data) {
		if (value == data) {
			return;
		} else if (data < value) {
			if (leftChild == null) {
				leftChild = new TreeNode(data);
			} else {
				leftChild.insert(data);
			}
		} else if (data > value) {
			if (rightChild == null) {
				rightChild = new TreeNode(data);
			} else {
				rightChild.insert(data);
			}
		}
	}

	public void inorderTraversal() {
		if (leftChild != null) {
			leftChild.inorderTraversal();
		}
		System.out.print(value + ",");
		if (rightChild != null) {
			rightChild.inorderTraversal();
		}
	}

	public int getMax() {
		if (rightChild == null) {
			return value;
		} else {
			return rightChild.getMax();
		}
	}

	public void getKthMaxElement(int k) {

		if (rightChild != null && count != k) {
			rightChild.getKthMaxElement(k);
		}
		count++;
		if (count == k) {
			System.out.println(value);
		}
		if (leftChild != null && count != k) {
			leftChild.getKthMaxElement(k);
		}
	}

	public void findPairOfNodeWithGivenSum(int sum) {
		if (leftChild != null) {
			leftChild.findPairOfNodeWithGivenSum(sum);
		}
		if (set.contains(sum - value)) {
			System.out.print("Pair found:" + value + "," + (sum - value));
		} else {
			set.add(value);
		}
		if (rightChild != null) {
			rightChild.findPairOfNodeWithGivenSum(sum);
		}
	}

	public void mirrorImageOfTree() {
		if (leftChild != null)
			leftChild.mirrorImageOfTree();
		if (rightChild != null)
			rightChild.mirrorImageOfTree();
		TreeNode temp = leftChild;
		leftChild = rightChild;
		rightChild = temp;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
