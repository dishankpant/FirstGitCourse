package com.binarysearchtree;

public class Main {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.insert(2);
		tree.insert(0);
		tree.insert(8);
		tree.insert(15);
		
		tree.inorderTraversal();
		//System.out.println("Max value is"+ tree.getMax());
		//tree.kthLargestElement(2);
		//tree.findPairOfNodeWithGivenSum(23);
		System.out.println(tree.findIfValueExist(0));
		
		tree.mirrorImageOfTree();
		tree.inorderTraversal();
	}

}
