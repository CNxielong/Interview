package com.javaee;

import java.util.HashMap;

public class Test {
	private static int[] twoSum;

	public static void main(String[] args) {
//		int[] nums = {2, 7, 11, 15}; 
//		int target = 9;
		int[] nums = {1,3,4,2}; 
		int target = 6;
		try {
			twoSum = twoSum(nums, target);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(twoSum[0]+":"+twoSum[1]);
		
	}

	public static int[] twoSum(int[] nums, int target) throws Exception {
		
		//定义一个HashMap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		//for循环  0-nums.length
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			//如果HashMap 存在结果 那么返回结果和i
			if(map.containsKey(complement)){
				int[] a={i,map.get(complement)}; 
				return  a;
			}
			//否则就插入nums[i]
			map.put(nums[i], i);			
		}
		throw new Exception("参数输入有误");

		
//    	int x=0,y=0;
//    	out:for (int i = 0; i < nums.length; i++) {
//    		for (int j = nums.length-1; (j!=i)&&(j >0) ; j--) {
//				if(nums[i]+nums[j]==target){
//					x=i;
//					y=j;
//					break out;
//				}
//			}
//		}
//    	int[] a = {x,y};
//    	return a;
		
		
    }
}
