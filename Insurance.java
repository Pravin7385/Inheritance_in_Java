package com.Oops.inheritance;

// SingleInheritance --> In Single-Inheritance only one Super class and only one Sub-class. 

public class Insurance { // this is super class

	void getInsuranceDetails() {
		System.out.println("This is details of Insurance class i.e Super class");
	}
}

class HealthInsurance extends Insurance {

	void getHealthInsuranceDetails() {
		System.out.println("This is details of Health Insurance class i.e Sub class");
	}

public static void main(String[] args) {

		HealthInsurance healthinsurance = new HealthInsurance();
		healthinsurance.getInsuranceDetails();
		healthinsurance.getHealthInsuranceDetails();
	
	}
}
