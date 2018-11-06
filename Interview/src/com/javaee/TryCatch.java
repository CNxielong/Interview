package com.javaee;

public class TryCatch {

		public static String output="";
		
		public static String foo(int i){
			try {
				if(i == 1 ){
					throw new Exception("Å×³öÒì³£");
				}
				output += "1";
			} catch (Exception e) {
				output += "2";
			} finally{
				output +="3";
			}
			output +="4";
			return output;
		}
		
		public static void main(String[] args) {
			String foo1 = foo(0);
			System.out.println(foo1);
			String foo2 = foo(1);
			System.out.println(foo2);
		}
	
}
