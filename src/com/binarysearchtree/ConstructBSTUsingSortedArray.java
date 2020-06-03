package com.binarysearchtree;

public class ConstructBSTUsingSortedArray {

	public static void main(String[] args) {

		int [] arr = {1,2,3,4,5,6,7,8};
		
		TreeNode root = createBalancedBST(arr, 0, arr.length-1);

		root.inorderTraversal();
	}

	private static TreeNode createBalancedBST(int[] arr, int startIndex, int endIndex) {
		
		if(startIndex > endIndex) return null;
		
		int mid = (endIndex + startIndex)/2;
		
		TreeNode root = new TreeNode(arr[mid]);
		
		root.setLeftChild(createBalancedBST(arr, startIndex, mid-1));

		root.setRightChild(createBalancedBST(arr, mid+1, endIndex));
		
		return root;
	}
}