package com.javaee.designpattern.factory.abstractFactory;

public class MailSender implements Sender {

	@Override
	public void sender() {
		System.out.println("MailSender");
	}

}
