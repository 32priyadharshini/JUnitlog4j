package com.example.demo;

public class MaxLengthWord {
	public String findMaxLength(String[] a) {
		String max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i].length()>max.length()) {
				max=a[i];
			}
		}
		return max;
	}

}
