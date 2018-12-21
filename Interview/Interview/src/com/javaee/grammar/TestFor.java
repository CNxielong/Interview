package com.javaee.grammar;

/**
 * 
 * @Title: TestFor  
 * @Description: TODO(For循环执行顺序)  
 * @author X-Dragon  
 * @date 2018年11月16日 上午10:23:19 
 * @version V1.0  
 *
 */
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
		return true;
//		return false;
	}
	
}
