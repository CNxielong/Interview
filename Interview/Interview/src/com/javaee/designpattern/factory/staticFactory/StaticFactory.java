package com.javaee.designpattern.factory.staticFactory;
/**
 * 
 * @Title: StaticFactory  
 * @Description: TODO(静态工厂方法 不需要实例化工厂类，所以，大多数情况下，我们会选用静态工厂方法模式。)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */
public class StaticFactory {
	
	public static Sender emsSender(){
		return new EmsSender();
	}
	
	public static Sender mailSender(){
		return new MailSender();
	}
}
