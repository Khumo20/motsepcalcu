package calculator;

import java.util.Scanner;

public class calculatorprog {

	public static void main(String[] args) {
		
		Scanner st = new Scanner(System.in);
		
		char operator;
		Double Num1, Num2,Total;
		
		
		
		System.out.println("Enter Number 1");
		Num1 = st.nextDouble();
		
		System.out.println("Choose an operator (+, -, *, /, >, <, =, $)");
		operator = st.next().charAt(0);
		
		System.out.println("Enter Number 2");
		Num2 = st.nextDouble();
		
		switch(operator){
		
		case '+':
			Total = Num1 + Num2;
			System.out.println(Num1 + "+" + Num2 + "=" + Total);
			break;
			
		case '-':
			Total = Num1 - Num2;
			System.out.println(Num1 + "-" + Num2 + "=" + Total);
			break;
			
		case '*':
			Total = Num1 * Num2;
			System.out.println(Num1 + "*" + Num2 + "=" + Total);
			break;
			
		case '/':
			Total = Num1 / Num2;
			System.out.println(Num1 + "/" + Num2 + "=" + Total);
			break;
			
		case '>':
			boolean total = Num1 > Num2;
			System.out.println(Num1 + ">" + Num2 + "=" + total);
			break;
			
		case '<':
			boolean otal = Num1 < Num2;
			System.out.println(Num1 + "<" + Num2 + "=" + otal);
			break;
			
		case '=':
			boolean tal = Num1 == Num2;
			System.out.println(Num1 + "=" + Num2 + "=" + tal);
			break;
			
		case '$':
			Total = Num1 * 18.62;
			System.out.println("$" + Num1 + "=" + "R"+Total);
			break;
		}

	}
		

}
