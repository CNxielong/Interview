package com.javaee.designpattern.factory.normalFactory;

/**
 * 
 * @Title: SendFactory  
 * @Description: TODO(创建工厂类)  
 * @author X-Dragon  
 * @version V1.0  
 *
 */
public class SendFactory {

	public Sender produce(String type){
		if(type.equals("ems")){
			return new EmsSender();
		}else if(type.equals("mail")){
			return new MailSender();
		}else{
			return null;
		}
	}
}
