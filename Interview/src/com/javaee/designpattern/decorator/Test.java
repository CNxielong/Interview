package com.javaee.designpattern.decorator;

public class Test {
	public static void main(String[] args) {
		Source source = new Source();
		Decorator decorator = new Decorator(source);
		decorator.method();
	}
}
