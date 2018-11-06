package com.javaee.designpattern.factory.staticFactory;

public class EmsSender implements Sender {

	@Override
	public void sender() {
		System.out.println("EmsSender");
	}

}
