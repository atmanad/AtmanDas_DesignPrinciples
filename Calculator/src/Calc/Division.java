package Calc;

public class Division {
	public static void div(double num1,double num2) {
		CalcInterface dao = new CalculatorDAO();
		System.out.println(dao.division(num1,num2));
	}
}
