package Calc;

public class Multiplication {
	public static void mul(double num1,double num2) {
		CalcInterface dao = new CalculatorDAO();
		System.out.println(dao.multiplication(num1,num2));
	}
}
