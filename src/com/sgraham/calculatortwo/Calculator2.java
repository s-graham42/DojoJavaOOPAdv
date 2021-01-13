package com.sgraham.calculatortwo;
import java.util.ArrayList;

public class Calculator2 {
	private ArrayList<Object> elements = new ArrayList<Object>();
	private ArrayList<Double> adds = new ArrayList<Double>();
	
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
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i) == "+") {
				adds.add((Double) elements.get(i-1));
			}
			else if (elements.get(i) == "-") {
				adds.add((Double) elements.get(i-1));
				elements.set((i+1), (((Double) elements.get(i+1)) * -1));
			}
			else if (elements.get(i) == "*") {
				elements.set((i+1), (((Double) elements.get(i-1)) * ((Double) elements.get(i+1))));
			}
			else if (elements.get(i) == "/") {
				elements.set((i+1), (((Double) elements.get(i-1)) / ((Double) elements.get(i+1))));
			}
			else if (elements.get(i) == "=") {
				adds.add((Double) elements.get(i-1));
			}
		}
		printAdds();
	}
	
	public double getResults() {
		double result = 0;
		loadAdds();
		for (Double item : adds) {
			result += (double) item;
		}
		return result;
	}
	
}

