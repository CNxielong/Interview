package com.javaee;

public class TestFor {
	public static void main(String[] args) {

		int i = 0;
		for (say('a');say('b')&& (i<2) ; say('c')) {
			i++;
			say('d');
		}
		
	}
	
	public static boolean say(char c){
		System.out.println(c);
//		return true;
		return false;
	}
	
}
