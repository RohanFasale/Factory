package service;

import jio.JioService;

public class Test {
	public static void main(String[] args) {
		Service ser =Factory.run(2);
		ser.greeting();
	}
}
