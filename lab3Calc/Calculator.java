package lab3Calc;
import java.io.*;
import java.util.Scanner;
//import java.util.function.BinaryOperator;
//import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char symb;
Float num1,num2, results;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number");
//int userInput = scanner.nextInt();
		num1 = scanner.nextFloat();
System.out.println(num1);

//char operator;

System.out.println("please enter an action: +, -,*, or /");
symb = scanner.next().charAt(0);
//Scanner input = null;

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
	System.out.println(results);
}

//
//symb = input.next().charAt(0);




	}

	private static System nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

}
