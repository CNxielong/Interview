package com.javaee.designpattern.singleton;

/**
 * 
 * @Title: Test  
 * @Description: TODO(单例模式测试类)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton sin1 = Singleton.getSingleton();
		Singleton sin2 = Singleton.getSingleton();
		if(sin1==sin2){
			System.out.println(sin1);
			System.out.println(sin2);
			System.out.println("是单例对象");
		}

	}

}
