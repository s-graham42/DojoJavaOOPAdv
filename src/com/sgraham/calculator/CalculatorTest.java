package com.sgraham.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.setOperandOne(10);
		calc.setOperandTwo(5);
		calc.setOperation('+');
		calc.performOperation();
		System.out.println(calc.getResult());
		
		calc.setOperandOne(10.5);
		calc.setOperandTwo(5.2);
		calc.setOperation('+');
		calc.performOperation();
		System.out.println(calc.getResult());
		
		calc.setOperandOne(2.4564);
		calc.setOperandTwo(1.056);
		calc.setOperation('-');
		calc.performOperation();
		System.out.println(Math.round(calc.getResult()*10000.0) / 10000.0);
	}

}
