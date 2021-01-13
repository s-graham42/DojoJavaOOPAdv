package com.sgraham.calculatortwo;

public class Calculator2Test {

	public static void main(String[] args) {
		Calculator2 c2 = new Calculator2();
		Calculator2 c3 = new Calculator2();
		
		c2.performOperation(10.5);
		c2.performOperation("+");
		c2.performOperation(5.2);
		c2.performOperation("*");
		c2.performOperation(10);
		c2.performOperation("=");
		
//		c2.setElements(5);
//		c2.setElements('+');
//		c2.setElements(10);
		
		c2.printElements();
//		c2.loadAdds();
//		c2.printAdds();
		
		System.out.println(c2.getResults());
		
		System.out.println(" - - - - - - - - - - - - - - - - - - - ");

		c3.performOperation(10);
		c3.performOperation("+");
		c3.performOperation(5);
		c3.performOperation("*");
		c3.performOperation(2);
		c3.performOperation("-");
		c3.performOperation(60);
		c3.performOperation("/");
		c3.performOperation(3);
		c3.performOperation("+");
		c3.performOperation(100);
		c3.performOperation("=");
		c3.printElements();
		System.out.println(c3.getResults());
	}

}
