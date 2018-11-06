package com.javaee.designpattern.factory.abstractFactory;

public class EmsSender implements Sender {

	@Override
	public void sender() {
		System.out.println("EmsSender");
	}

}
