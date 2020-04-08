package Calc;

public class Substration {
	public static void sub(double num1,double num2) {
		CalcInterface dao = new CalculatorDAO();
		System.out.println(dao.substration(num1,num2));
	}
}
