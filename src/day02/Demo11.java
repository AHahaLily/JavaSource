package day02;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		// switch分支
		//switch优点：效率高结构清晰
		//缺点：必须满足值对应相等
/*		switch(2){
		case 1:System.out.println(111);break;
		case 2:System.out.println(222);break;
		default:System.out.println("无匹配的常量值");
		}*/
		
		/*
		 * 练习：从控制台接收用户输入的值，然后给用户匹配相应的服务
		 */
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		switch(input){
		case 1:System.out.println("普通话服务");break;
		case 2:System.out.println("英语服务");break;
		default:System.out.println("您的输入有误");
		//当所有的input的值与所有的case后面的值都不匹配时，则执行default后面的语句
		}
		sc.close();
	}

}
