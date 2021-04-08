package com.wiwatyooraks.java3_2;

public class CEO extends Employee { 
		public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
			super(firstnameInput, lastnameInput, salaryInput);
		}
		@Override
		public int getSalary() {
			return super.getSalary() * 2;
		}
		public void hello() {
			System.out.println("Hi, nice to meet you. "+this.firstname+"!");
		}
		public void fire(Employee employee) {
			System.out.println(employee.firstname + " has been fired!");
		}
		public static void main(String[] args) {
			Employee charz = new Employee("Wiwat","Yooraks", 50000);
			CEO ceo = new CEO("Sumalee","Nakbunlang", 50000);
			System.out.println(ceo.getSalary());
			ceo.hello();
			ceo.fire(charz);
		}
}
