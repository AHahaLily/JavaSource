package day02;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		// 演示if...else if-else
/*		int score=90;
		if(score>=90){
			System.out.println("优秀");
		}else if(score>=80){
			System.out.println("良好");
		}else if(score>=60){
			System.out.println("中等");
		}else{
			System.out.println("不及格");
		}*/
		
		/*
		 * 练习：从控制台接收分数，判断等级
		 */
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>=90){
			System.out.println("优秀");
		}else if(score>=80){
			System.out.println("良好");
		}else if(score>=60){
			System.out.println("中等");
		}else{
			System.out.println("不及格");
		}
		sc.close();
	}

}
