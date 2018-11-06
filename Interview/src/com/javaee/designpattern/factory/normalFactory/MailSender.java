package com.javaee.designpattern.factory.normalFactory;

public class MailSender implements Sender {

	@Override
	public void sender() {
		System.out.println("MailSender");
	}

}
