package com.string;

public class ReverseString1 {

	public static void main(String[] args) {

		String str = "Dishank Pant";
		System.out.println(reverse(str));
	}

	private static String reverse(String str) {

		String[] strArray = str.split("");
		String[] strfinal = new String[3];
		String finalStr = "";
		for (String s : strArray) {
			int end = s.length();
			char[] arr = str.toCharArray();
			for (int start = 0; start <= end; start++, end--) {
				char temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
			finalStr = arr.toString() + " ";
		}
		return finalStr;
	}
}
