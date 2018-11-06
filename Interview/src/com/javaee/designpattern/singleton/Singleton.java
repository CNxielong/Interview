package com.javaee.designpattern.singleton;
/**
 * 
 * @Title: Singleton  
 * @Description: TODO(单例设计模式)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */


//饿汉式
//public class Singleton {
//	//1、私有化构造方法 该方法只能在内部使用
//	private Singleton(){//默认调用父类的构造方法
//	}
//	
//	//2、私有化类成员变量 提供本类的引用指向本类的对象
//	private static Singleton singleton = new Singleton();//饿汉式 一开始就声明
//
//	//提供 公有的get方法
//	public static Singleton getSingleton(){
//		return singleton;
//	}
//}



//// 懒汉式
//public class Singleton {
//	// 1、私有化构造方法 该方法只能在内部使用
//	private Singleton() {
//	}
//
//	// 2、私有化类成员变量 提供本类的引用指向本类的对象
//	private static Singleton singleton=null;
//
//	// 提供 公有的get方法 静态方法 类名.直接调用
//	public static Singleton getSingleton() {
//		if (singleton == null) {// 如果没有生成过 那么调用构造器
//			singleton = new Singleton();
//		}
//		return singleton;
//	}
//}

public class Singleton {
	// 1、私有化构造方法 该方法只能在内部使用
	private Singleton() {
	}

	// 2、私有化类成员变量 提供本类的引用指向本类的对象
	private static Singleton singleton = null;

	//初始化方法加锁 线程安全
	public static synchronized void initSingleton() {
		if (singleton == null) {// 如果没有生成过 那么调用构造器
			singleton = new Singleton();
		}
	}
	// 提供 公有的get方法 静态方法 类名.直接调用
	public static Singleton getSingleton() {
		if (singleton == null) {
			initSingleton();
		}
		return singleton;
	}
}
