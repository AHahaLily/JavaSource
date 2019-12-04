package codingexercise;
//海伦凯勒公式
public class HelenKellerFormula {
	public static void main(String[] args) {
		double a=4.144;
		double b=4.301;
		double c=5.471;
		double p=(a+b+c)/2.0;
		double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println(S);
	}

}
