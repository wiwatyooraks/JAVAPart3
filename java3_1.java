package com.wiwatyooraks.employee;

public class java3_1 {
	public String firstname;
	public String lastname;
	private int salary;
	public String position;
	
	public static void main(String[] args) {
		java3_1[] employees = new java3_1[3];
		for (int i =0; i<employees.length; i++) {
		employees[i] = new java3_1("name : "+i, "lastname : "+i, 15000*i, "position : "+i);
		}
		System.out.println(employees[1].firstname);
		System.out.println(employees[2].firstname);
		System.out.println(employees[1].salary);
		System.out.println(employees[2].position);
		}
	
	public java3_1(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
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
}
