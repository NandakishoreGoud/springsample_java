package com.cts.demo;

public class Client {
public static void main(String[] args) {
	Employee eRef = new Employee();
	eRef.setEname("nanda");
	eRef.setEid(100);
	eRef.setEaddress("Hyd");
	System.out.println("Employee Details"+eRef);
}
}
