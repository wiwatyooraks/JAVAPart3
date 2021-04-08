package com.wiwatyooraks.java3_2;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	
	public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
	}
	public void hello() {
		System.out.println("Hello " + this.firstname);
	}
	public int getSalary() {
		return salary;
	}
	public static void main(String[] args) {
		Employee charz = new Employee("Wiwat","Yooraks", 50000);
		System.out.println(charz.getSalary());
		charz.hello();
	}
}
