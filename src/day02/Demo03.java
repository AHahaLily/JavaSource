    
package day02;

public class Demo03 {

	public static void main(String[] args) {
		//一个条件控制的用关系运算符，多个条件控制的则使用逻辑运算符
		//&&  与逻辑
		//||  或逻辑
		int a=10;
		int b=5;
		boolean flag1=a>b&&b<a;    //true
		//同时为ture结果即为true
		boolean flag2=a==b||a!=b;  //true
		//只要有一个微true结果即为true
		boolean flag3=!(a<=b);     //true
		//非运算，对表达式或逻辑值进行值的取反
		System.out.println(flag1+" "+flag2+" "+flag3);
	}

}
