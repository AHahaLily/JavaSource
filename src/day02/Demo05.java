package day02;

public class Demo05 {

	public static void main(String[] args) {
		//字符串连接：字符char必须放在单引号里，并且只能有一个
		//字符串String放在双引号里，可以有0-多个字符
		//使用+做字符串的拼接,若两个操作数都是数值则进行假发运算，如果两个操作数至少一个为字符串则进行字符串的拼接
		int a=10;
		int b=5;
		System.out.println(a+b);
		
		System.out.println("a"+a);
		System.out.println(a+b+"b");
	}

}
