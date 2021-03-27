package com.redbeet.s2.robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	private int age;
	
	private String name;
	
	private int price;

	private Arm arm_Left;

	private Arm arm_Right;
	

	public Robot() {
		
	}
	
	public Robot(int age, String name, int price) {
		this.age=age;
		this.name=name;
		this.price=price;
	}
	
	
	
	public Arm getArm_Left() {
		return arm_Left;
	}
	public void setArm_Left(Arm arm_Left) {
		this.arm_Left = arm_Left;
	}
	public Arm getArm_Right() {
		return arm_Right;
	}
	public void setArm_Right(Arm arm_Right) {
		this.arm_Right = arm_Right;
	}

	
	

	

	

	
}
