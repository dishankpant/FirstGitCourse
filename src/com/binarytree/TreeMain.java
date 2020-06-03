package com.binarytree;

import java.util.LinkedHashMap;
import java.util.Map;

public class TreeMain {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		tree.root = new TreeNode(7);
		tree.root.setLeftChild(new TreeNode(9));
		tree.root.setRightChild(new TreeNode(15));

		tree.root.getLeftChild().setLeftChild(new TreeNode(4));
		tree.root.getLeftChild().setRightChild(new TreeNode(6));

		tree.root.getRightChild().setLeftChild(new TreeNode(34));
		tree.root.getRightChild().setRightChild(new TreeNode(21));

		//tree.levelOrder(tree.root);
		tree.inOrderTraversal(tree.root);
		
		Map map = new LinkedHashMap();
		
	}
}
