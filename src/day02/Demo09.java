package day02;

import java.util.Scanner;

public class Demo09 {

	public static void main(String[] args) {
		// if...else分支语句：满足条件则做某事，否则做另一件事
/*		int score=50;
		if(score>=60){
			System.out.println("该生分数及格");
		}else{
			System.out.println("该生分数不及格");
		}*/
		
		/*
		 * 练习：从控制台输入一个数，判断是不是偶数
		 */
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println("该数是一个偶数");
		}else{
			System.out.println("该数不是一个偶数");
		}
		sc.close();
	}

}
