package com.tnsif.arraysample;

public class DuplicateElements {

	public static void main(String[] args) {
		int[]arr = {1,2,3,2,4,5,1};
		System.out.println("Duplicates:");
		for(int i =0;i<arr.length;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+"");
				}
			}
		}

	}

}
