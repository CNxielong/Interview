package com.javaee.algorithm;

public class BubbleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,2,6,9,7,11,15,3,6};
		a = bubble(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
	
	public static int[] bubble(int[] a){
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i]= temp;
				}
			}
		}
		return a;
	}

}
