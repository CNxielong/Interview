package com.javaee.designpattern.factory.normalFactory;

public class Test {
	public static void main(String[] args) {
		SendFactory sendFactory = new SendFactory();
		String type = "ems";
		Sender sender = sendFactory.produce(type);// 获得工厂对象
		sender.sender();
	}
}
