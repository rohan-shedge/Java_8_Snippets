package com.rohan.java8.functionalinterface.BinaryOperator;

import java.math.BigDecimal;

public class Developer {

    String name;
    BigDecimal salary;

    public Developer(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public BigDecimal getSalary() {
		return salary;
	}
    
    public String toString() {
    	return name  + " = " + salary;
    }
}