package com.wiwatyooraks.java3_2;

public class Programmer extends Employee {
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}
	@Override
	public int getSalary() {
		return super.getSalary() * 3;
	}
	public void hello() {
		System.out.println("Hi, nice to meet you. "+this.firstname+"!");
	}
	public static void main(String[] args) {
		Programmer programmer = new Programmer("Sumalee","Nakbunlang", 50000);
		System.out.println(programmer.getSalary());
		programmer.hello();
	}
}
