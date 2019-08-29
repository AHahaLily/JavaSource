package day04;

import java.util.Scanner;

public class Demo03 {
/*	public static void sayHi() {
		System.out.println("hello");
	}

	public static void sayHello(String name) {
		System.out.println("你好，我是" + name);
		;
	}

	public static int getAge() {
		System.out.println("请输入你的年级:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		return age;
	}*/
	
	public static int calSquare(int length,int width){
		return length*width;
	}
	
	public static int calVolume(int len,int wid,int height){
		return len*wid*height;
	}

	public static void main(String[] args) {
		/* 方法：用于封装一段特定的逻辑业务
		 * 方法的优点：可以方便的被反复调用，避免代码段的重复，提高代码的复用性
		 * 1.编写方法：修饰符 返回值 方法名（参数）{方法的主体}
		 * 修饰符：权限修饰符public private protected
		 * 		静态修饰符static
		 * 返回值：有不同的类型
		 * 方法名：符合Java中标识符的命名规则，做到见字知义
		 * 参数：方法调用时传入方法的数据供方法使用
		 * 2.方法的调用：有参数则给方法传递相应的参数，没有参数则括号内为空
		 * 没有返回值类型的方法，直接通过方法名调用方法
		 * 有返回值的方法，使用return返回相应的类型的值
		 */
/*		sayHello("Lili");
		int age=getAge();
		System.out.println(age);*/
		
		/*
		 * 练习：写一个有参数传入有返回值的方法
		 * 1.传入长和宽，计算出面积后打印输出
		 * 2.传入长、宽、高，计算体积后打印 输出
		 */
		System.out.println("输入长和宽：");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(calSquare(a,b));
		
		System.out.println("输入长、宽、高：");
		int aa=sc.nextInt();
		int bb=sc.nextInt();
		int cc=sc.nextInt();
		System.out.println(calVolume(aa,bb,cc));
		sc.close();
	}

}
