package com.gndu.pratibha.helloworld;

public class Alto extends Car {
	public void speed() {
		System.out.println("Speed is 50 kmph");

	}

	public static void main(String args[]) {
		Alto obj = new Alto();
		obj.speed();
	}
}
