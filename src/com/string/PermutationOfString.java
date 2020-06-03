package com.string;

public class PermutationOfString {

	public static void main(String[] args) {

		String str = "ABCD";
		findAllPermutation(str);
	}

	private static void findAllPermutation(String str) {
		if(str.isEmpty()) System.out.print(str);
		char[] charArray = str.toCharArray();
		int i = 0;
		for(int j=i; i < charArray.length; i++) {
			char temp = charArray[j];
			charArray[j] = charArray[i];
			charArray[i] = temp;
			findAllPermutation(str);
		}
	}
}
