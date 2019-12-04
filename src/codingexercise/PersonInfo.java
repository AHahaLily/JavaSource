package codingexercise;

import java.util.Scanner;

public class PersonInfo {
	//黄色警告可以忽略，红色代表代码有错，就必须将错误找出并解决
	public static void main(String[] args) {
		System.out.println("录入个人信息：");
		
		System.out.println("姓名：");
		String name=new Scanner(System.in).nextLine();
		
		System.out.println("性别：");
		String gender=new Scanner(System.in).nextLine();
		
		System.out.println("年龄：");
		int age=new Scanner(System.in).nextInt();
		
		System.out.println("您录入的个人信息是：");
		System.out.println(name+","+gender+","+age);
	}

}
