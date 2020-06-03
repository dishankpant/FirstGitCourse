package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	TreeNode root;

	public void levelOrder(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.getValue() + " ");
			if (temp.getLeftChild() != null) {
				queue.add(temp.getLeftChild());
			}
			if (temp.getRightChild() != null) {
				queue.add(temp.getRightChild());
			}
		}
	}
	
	public void inOrderTraversal(TreeNode root) {
		if(root.getLeftChild() != null) {
			inOrderTraversal(root.getLeftChild());
		}
		System.out.print(root.getValue()+" ");
		if(root.getRightChild() != null) {
			inOrderTraversal(root.getRightChild());
		}
	}
}
