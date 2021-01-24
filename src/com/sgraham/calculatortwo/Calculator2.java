package com.sgraham.calculatortwo;

//The client has requested a change in spec: they need the calculator to process multiple values,
//as well as have some more complex abilities. They need the possibility for you to add several numbers in a row:
//this requires a change in our interface as we can't be sure how many total operands the client will be using.
//Now they expect this to work:
//- performOperation(10.5)
//- performOperation("+")
//- performOperation(5.2)
//- performOperation("*")
//- performOperation(10)
//- performOperation("=")
//- getResults()

//where the result would be 62.5. They want to be able to do this for an arbitrary number of numbers,
//as well as add in the capability to multiply and divide. You can assume that all inputs will be valid.
//Notice that the calculator must correctly perform the order of operations.
//
//- Create the Calculator bean that will allow for the user to set operands and operations, then perform them and get the results.
//- Have logic for adding, subtracting, dividing, and multiplication.
//Notes:
//- You may want to use helper boolean properties to indicate if an operation or operand has been set or used yet.

import java.util.ArrayList;

public class Calculator2 {
	private ArrayList<Object> elements = new ArrayList<Object>();	// hold the series of doubles and Strings from performOperation()
	private ArrayList<Double> adds = new ArrayList<Double>();		// hold the series of Doubles from loadAdds() to add together at the end.
	
	public Calculator2() {
	}
	
	public void setElements(double num) {
		elements.add(num);
	}
	public void setElements(String oper) {
		elements.add(oper);
	}
	public void setAdds(double newAdd) {
		adds.add(newAdd);
	}
	
	public void printElements() {
		System.out.println(elements);
	}
	public void printAdds() {
		System.out.println(adds);
	}
	
	public void performOperation(double num) {
		setElements(num);
	}
	public void performOperation(String ch) {
		setElements(ch);
	}
	
	public void loadAdds() {
		for (int i = 0; i < elements.size(); i++) {		// iterate through elements.
			if (elements.get(i) == "+") {				// if you find a plus, add the previous value to adds.
				adds.add((Double) elements.get(i-1));
			}
			else if (elements.get(i) == "-") {			// if you find a minus, add the previous value to adds and make the next value negative.
				adds.add((Double) elements.get(i-1));
				elements.set((i+1), (((Double) elements.get(i+1)) * -1));
			}
			else if (elements.get(i) == "*") {			// if you find multiplication set the next value to be the result of the previous value times the next value
				elements.set((i+1), (((Double) elements.get(i-1)) * ((Double) elements.get(i+1))));
			}
			else if (elements.get(i) == "/") {			// if you find division set the next value to be the result of the previous value divided by the next value
				elements.set((i+1), (((Double) elements.get(i-1)) / ((Double) elements.get(i+1))));
			}
			else if (elements.get(i) == "=") {			// if you find equals add the previous value to adds.
				adds.add((Double) elements.get(i-1));
			}
		}
//		printAdds();
	}
	
	public double getResults() {
		double result = 0;
		loadAdds();
		for (Double item : adds) {		// iterate through adds and add them all up.
			result += (double) item;
		}
		return result;					// and return it.
	}
	
}

