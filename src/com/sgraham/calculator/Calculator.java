package com.sgraham.calculator;

//A client of yours requires a basic calculator for their application.
//They need a way to run a series of operations and save the result.
//They only need adding and subtracting functionality right now.
//They need the method performOperation and getResults to be the methods that
//run all the operations and return the end result respectively.
//-  setOperandOne(10.5)
//-  setOperation("+")
//-  setOperandTwo(5.2)
//-  performOperation()
//-  getResults()
//where the result would be 15.7.
//
//Tasks:
//-  Create the Calculator bean that will allow for the user to set operands and operations,
//then perform them and get the results.
//  ** must be a javaBean **
//-  Have logic for adding and subtracting.

public class Calculator implements java.io.Serializable {
	// private variables
	private double operandOne;
	private double operandTwo;
	private char operation;
	private double result;
	// zero arg constructor
	public Calculator() {
	}
	// getters and setters
	public double getOperandOne() {
		return operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public char getOperation() {
		return operation;
	}
	public double getResult() {
		return result;
	}
	public void setOperandOne(double num) {
		operandOne = num;
	}
	public void setOperandTwo(double num) {
		operandTwo = num;
	}
	public void setOperation(char oper) {
		operation = oper;
	}
	public void setResult(double res) {
		result = res;
	}
	
	public void performOperation() {
		if (getOperation() == '+') {
			setResult(getOperandOne() + getOperandTwo());
		}
		if (getOperation() == '-') {
			setResult(getOperandOne() - getOperandTwo());
		}
	}
}
