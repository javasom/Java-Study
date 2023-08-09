package com.campus;

public class Car {
	protected String brend = "그랜저";
	String color = "White";
	int maxSpeed = 180;
	protected int speed = 0; // public, protected
	
	//public Car() {
	public Car() {
		System.out.println("Car()생성자 메소드 실행 됨...");
		
	}
		
	protected void speedUp() {
		speed++;
		if(speed >maxSpeed) {
			speed = maxSpeed;
		}
	}
	
	public void speedDown() {
		speed--;
		if(speed <0) {
			speed = 0;
	
		}

	}
	
}