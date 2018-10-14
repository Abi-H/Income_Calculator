package com.it7320;

public class ComputeImplementation {
	
	ICompute obj;
	
	public int computeTax(int amount) {
		return obj.computeTax(amount);
	}

	public int weeklySalary(Employee income) {
		return obj.weeklySalary(income);
	}

	public int fortnightSalary(Employee income) {
		return obj.fortnightSalary(income);
	}

	public int computeKiwiSaver(Employee kiwiOption) {
		return obj.computeKiwiSaver(kiwiOption);
	}
	
	public void setObj(ICompute obj) {
		this.obj = obj;
	}
}
