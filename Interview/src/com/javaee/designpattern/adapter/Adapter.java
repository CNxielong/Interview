package com.javaee.designpattern.adapter;
/**
 * 
 * @Title: Adapter  
 * @Description: TODO(适配器模式将某个类的接口转换成客户端期望的另一个接口表示，
 * 目的是消除由于接口不匹配所造成的类的兼容性问题。
 * 主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。)  
 * @Description: 适配器模式和装饰者模式的区别:适配器模式继承Source类，装饰者模式 装饰对象持有被装饰对象Source的实例
 * @author X-Dragon  
 * @version V1.0  
 *
 */
public class Adapter extends Source implements Targetable  {

	@Override
	public void target() {
		// TODO Auto-generated method stub
		System.out.println("这是适配器Adapter的适配方法");
	}

}
