package com.javaee.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest {


	    public static void main(String[] args){
	        List<Integer> list = new ArrayList<>(Arrays.asList(1,2));
	        add(list);
	        System.out.println(list.getClass());// class java.util.ArrayList
	        for (Integer i: list) {
	            System.out.println(i);
	        }

	        Integer[] nums = {1,2,3};
	        List<Integer> list1 = Arrays.asList(nums);
	        System.out.println(list1.getClass());//java.util.Arrays$ArrayList
	        list1.add(4); // java.lang.UnsupportedOperationException 报错
	        System.out.println(list1.size());
	    }

	    private static void add(List<Integer> list) {
	        list.add(3);
	        list = new ArrayList<>(4);
	    }



}
