package com.javaee.designpattern.factory.staticFactory;

public class MailSender implements Sender {

	@Override
	public void sender() {
		System.out.println("MailSender");
	}

}
