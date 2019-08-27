package day02;

public class Demo06 {

	public static void main(String[] args) {
		// 演示三目运算
		//语法：变量=表达式?值1：值2；
		//如果表达式的值为true则返回给变量的值为值1，否则返回的值为值2
		int a=10;
		int b=a>10?1:-1;
		System.out.println(b);
		
		String str=a<10?"a小于10":"a大于等于10";
		System.out.println(str);
	}

}
