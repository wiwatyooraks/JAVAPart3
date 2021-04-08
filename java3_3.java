package com.wiwatyooraks.employee;

public class java3_3 {
	public String firstname;
	public String lastname;
	private int salary;
	public String position;
	
	public static void main(String[] args) {
		java3_3 empl = new java3_3("wiwat" , "yooraks" , 50000 , "manager");
		test();
		empl.checkposition();
		}
	public static void test() {
		System.out.println("This is static method");
	}
	
	public java3_3(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
	firstname = firstnameInput;
	lastname = lastnameInput;
	salary = salaryInput;
	position = positionInput;
	}
	public void hello() {
	System.out.println("Hello " + firstname );
	}
	public int getSalary() {
	return salary;
	}
	public void checkposition() {
		System.out.println("My position is : " + position);
	}
}
