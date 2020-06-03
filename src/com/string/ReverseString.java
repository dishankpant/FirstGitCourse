package com.string;

public class ReverseString {

	static String str = "Dishank Pant";
	static char [] arr = str.toCharArray();
	public static void main(String[] args) {
		int i=0;
		int w = 0; //starting index of each word
		int j=0;
		while(i < str.length()) {
		if(str.charAt(i) != ' ') {
	        i++;
			j++;
		}
		swap(i,j-1);
		
	   }
		for(char c : arr) {
			System.out.print(c);
		}
	}
	public static void swap(int i, int j) {
		while(i < j) {
			char c = str.charAt(i);
			arr[i] = str.charAt(j);
			arr[j] = c;
			i++;
			j--;
		}
	}
}