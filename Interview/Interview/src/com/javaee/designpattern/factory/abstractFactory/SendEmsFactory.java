package com.javaee.designpattern.factory.abstractFactory;

public class SendEmsFactory implements Provider {


	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new EmsSender();
	}

}
