package com.java.datastructure;

import java.util.LinkedList;

public class CustomHashTableClass {

	private class HashTableObj {
		String key;
		Integer value;
	}

	LinkedList<HashTableObj>[] array = new LinkedList[128];

	public CustomHashTableClass() {
		for (int i = 0; i < array.length; i++) {
			array[i] = null;
		}
	}

	public HashTableObj getObj(String key) {
		int index = (key.hashCode()) % array.length;
		LinkedList<HashTableObj> arrlistObjay = array[index];
		if (arrlistObjay == null) {
			return null;
		} else {
			for (HashTableObj hashTableObj : arrlistObjay) {
				if (key.equals(hashTableObj.key)) {
					return hashTableObj;
				}
			}
		}
		return null;
	}

	public void putObj(String key, Integer value) {
		int index = (key.hashCode()) % array.length;
		LinkedList<HashTableObj> arrlistObjay = array[index];
		if (null == arrlistObjay) {
			arrlistObjay = new LinkedList<HashTableObj>();
			HashTableObj obj = new HashTableObj();
			obj.key = key;
			obj.value = value;
			arrlistObjay.add(obj);
			array[index] = arrlistObjay;
			
		} else {
			for (HashTableObj obj : arrlistObjay) {
				if (obj.key.equals(key)) {
					obj.value = value;
					return;
				}
			}
			HashTableObj obj = new HashTableObj();
			obj.key = key;
			obj.value = value;
			arrlistObjay.add(obj);
		}
	}

	public static void main(String[] args) {
		CustomHashTableClass obj = new CustomHashTableClass();
		obj.putObj("dishank", 1);
		obj.putObj("dishank", 2);
		System.out.println(obj.getObj("dishank").value);
	}
}