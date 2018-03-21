package calculator;
import java.util.Scanner;

import calculator.operations.Operation;


public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insert first number: ");
		double a = s.nextDouble(); s.nextLine();
		System.out.println("Insert the operator: ");
		String op = s.nextLine();
		System.out.println("Insert second number: ");
		double b = s.nextDouble();
		
		Operation o = Operation.parserOperator(op);
		
		if (o == null) {
			System.err.println("Operator not recognized");
		} else {
			o.setNumbers(a, b);
			System.out.println("Result og " + o.getName() + " is " + o.calc());
		}
	}
	
}
