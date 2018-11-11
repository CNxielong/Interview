package com.javaee.designpattern.adapter;
/**
 * 
 * @Title: Targetable  
 * @Description: TODO(适配接口 包含Source的方法 和待适配的方法)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */
public interface Targetable {
	void source();//包含待适配类的方法
	void target();//待适配方法
}
