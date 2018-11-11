package com.javaee.designpattern.decorator;
/**
 * 
 * @Title: Source  
 * @Description: TODO(被装饰的类)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */
public class Source implements Sourceable{

	@Override
	public void method() {
		System.out.println("这个是Source的方法");
	}

}
