package com.javaee.trycatch;

import java.util.ArrayList;
import java.util.List;

public class TryCatch {

	private static int j = 1;

	public static int testBasic1() {// 10
		int i = 1;
		try {
			i++;
			System.out.println("1try block, i = " + i);// 1try block, i = 2
		} catch (Exception e) {
			i++;
			System.out.println("1catch block i = " + i);// 没输出
		} finally {
			i = 10;
			System.out.println("1finally block i = " + i);// 1finally block i =
															// 10
		}
		return i;// 10
	}

	public static int testBasic2() {// 不进入catch 返回的是2
		int i = 1;
		try {
			i++;
			System.out.println("2try block, i = " + i);// try block, i = 2
			return i;
		} catch (Exception e) {
			i++;
			System.out.println("2catch block i = " + i);// 没输出
			return i;
		} finally {
			i = 10;
			System.out.println("2finally block i = " + i);// finally block i =
															// 10
			// return i; 有警告
		}
	}

	public static int testBasic3() {// 进入catch 返回的是3
		int i = 1;
		try {
			i++;
			int j = 1 / 0;// 抛出异常 算术运算异常
			System.out.println("3try block, i = " + i);// 不执行
			return i;
		} catch (Exception e) {
			i++;
			System.out.println("3catch block i = " + i);// 输出 catch block i = 3
			return i;
		} finally {
			i = 10;
			System.out.println("3finally block i = " + i);// finally block i =
															// 10
			// return i; //有警告
		}
	}

	public static int testBasic4() {// 不进入catch 返回的是finally的10
		int i = 1;
		try {
			i++;
			// int j = 1/0;//抛出异常 算术运算异常
			System.out.println("4try block, i = " + i);// 不抛出异常有输出4try block, i
														// = 2 //抛出异常没输出
			return i;
		} catch (Exception e) {
			i++;
			System.out.println("4catch block i = " + i);// 不抛出异常没输出 //抛出异常
														// 有输出4catch block i = 3
			return i;
		} finally {
			i = 10;
			System.out.println("4finally block i = " + i);// finally block i =
															// 10
			return i; // 有警告 finally中不要有返回值
		}
	}

	public static int testBasic5() {// finally中有异常 控制台报错 Exception in thread
									// "main" java.lang.ArithmeticException: /
									// by zero
		int i = 1;
		try {
			i++;
			Integer.parseInt(null);
			System.out.println("5try block, i = " + i);
			return i;
		} catch (Exception e) {
			String.valueOf(null);
			System.out.println("5catch block i = " + i);
			return i;
		} finally {
			i = 10;
			int m = i / 0;// Exception in thread "main"
							// java.lang.ArithmeticException: / by zero
			System.out.println("5finally block i = " + i);
		}
	}

	public static int testBasic6() {// 返回2
		try {
			j++;
			System.out.println("6try block, j = " + j);// 执行 返回2
			return j;
		} catch (Exception e) {
			System.out.println("6catch block j = " + j);// 不执行
			return j;
		} finally {
			j = 10;
			System.out.println("6finally block j = " + j);// 执行 6finally block i
															// = 10
		}
	}

	public static int testBasic7() {// 返回2
		try {
			j++;
			int k = 1 / 0;
			System.out.println("7try block, j = " + j);//
			return j;
		} catch (Exception e) {
			System.out.println("7catch block j = " + j);// 7catch block j = 2
			return j;
		} finally {
			j = 10;
			System.out.println("7finally block j = " + j);// 7catch block j = 10
		}
	}

	public static List<Object> testWrap() {// 返回[try, finally]
		List<Object> list = new ArrayList<>();
		try {
			list.add("try");
			System.out.println("try block");// try block
			return list;
		} catch (Exception e) {
			list.add("catch");
			System.out.println("catch block");
			return list;
		} finally {
			list.add("finally");
			System.out.println("finally block ");// finally block
		}
	}

	public static List<Object> testWrap2() {// 返回[try, catch, finally]

		List<Object> list = new ArrayList<>();
		try {
			list.add("try");
			int i = 1 / 0;
			System.out.println("try block");// 不输出
			return list;
		} catch (Exception e) {
			list.add("catch");
			System.out.println("catch block");// 输出 catch block
			return list;
		} finally {
			list.add("finally");
			System.out.println("finally block ");// finally block
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i1 = testBasic1();
//		System.out.println(i1);
//		int i2 = testBasic2();
//		System.out.println(i2);
//		int i3 = testBasic3();
//		System.out.println(i3);
//		int i4 = testBasic4();
//		System.out.println(i4);// 10
//		int i5 = testBasic5();
//		System.out.println(i5);
//		int i6 = testBasic6();
//		System.out.println(i6);
		int i7 = testBasic7();
		System.out.println(i7);
//		List<Object> list = testWrap();
//		System.out.println(list);
//		List<Object> list2 = testWrap2();
//		System.out.println(list2);
	}

}
