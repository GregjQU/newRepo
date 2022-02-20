package lab3Calc;
import java.io.*;
import java.util.Scanner;

public class Calculator {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char symb;
Float num1,num2, results;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");

		num1 = scanner.nextFloat();
System.out.println(num1);


System.out.println("please enter an action: +, -,*, or /");
symb = scanner.next().charAt(0);


System.out.println("Please enter another number");
num2 = scanner.nextFloat();


if(symb == '+') {
	//addition
	results = num1 + num2;
	System.out.println(results);
}
if(symb == '-') {
	//subtraction
	results = num1 - num2;
	System.out.println(results);
}if(symb == '*') {
	//multiplication
	results = num1 * num2;
	System.out.println(results);
}
if(symb == '/') {
	//division
	
	results = num1 / num2;
	
	if( symb == '/' && num2 == 0) {
		System.out.println("Error: Divide by Zero");
	}else {
		
	
	System.out.println(results);
}
 }


	}

	private static System nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
