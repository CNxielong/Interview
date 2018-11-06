package com.javaee.designpattern;

import java.util.logging.SimpleFormatter;

public class Factoty {
	public static void main(String[] args) {
//		Object;
//		SimpleFormatter;
//		Throwable;
		String a = "a";
		String b = "a";
		System.out.println(a==b);
		StringBuffer sbu1 = new StringBuffer(a);
		StringBuffer sbu2 = new StringBuffer(a);
		System.out.println(sbu1==sbu2);
		StringBuilder sb1 = new StringBuilder(a);
		StringBuilder sb2 = new StringBuilder(a);
		System.out.println(sbu1==sbu2);
		System.out.println(sbu1.equals(sbu2));
		System.out.println(a.equals(b));
		

	}
}
