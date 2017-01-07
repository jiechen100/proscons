package com.jie.design.pattern;

public class SingletonPattern {
	private static SingletonPattern instance = new SingletonPattern();

	private SingletonPattern() {
	}

	public static SingletonPattern getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}

	public static void main(String[] args) {

		SingletonPattern object = SingletonPattern.getInstance();

		object.showMessage();
	}
}
