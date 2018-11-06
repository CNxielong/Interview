package com.javaee.designpattern.factory.normalFactory;

public class EmsSender implements Sender {

	@Override
	public void sender() {
		System.out.println("EmsSender");
	}

}
