package com.javaee.designpattern.proxy;
/**
 * @Title: Proxy  
 * @Description: TODO(代理类)  代理类实现接口 将被代理类作为成员变量
 * 重写的方法中做扩展
 * @author X-Dragon  
 * @version V1.0  
 */
public class Proxy implements Sourceable {
	
	private Source source;

	
	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	
	public void before(){
		System.out.println("代理类的before方法");
	}
	public void after(){
		System.out.println("代理类的after方法");
	}
}
