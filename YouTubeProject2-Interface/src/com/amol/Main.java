package com.amol;

//Created this project on 31stJan2023 from 09:56PM onwards

public class Main {

	public static void main(String[] args) {
		
		DeskPhone myPhone = new DeskPhone("123456789");
		myPhone.powerOn();
		myPhone.callPhone("123456789");
		myPhone.answer();
		
		System.out.println("===============================================");
		
		MobilePhone myPhone1 = new MobilePhone("123456789");
		myPhone1.powerOn();
		myPhone1.callPhone("123456789");
		myPhone1.answer();
		
	}

}
