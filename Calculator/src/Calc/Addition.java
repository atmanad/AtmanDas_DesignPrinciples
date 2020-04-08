package Calc;

public class Addition {
	public static void add(double num1,double num2) {
		CalcInterface dao = new CalculatorDAO();
		System.out.println(dao.addition(num1,num2));
	}
}
