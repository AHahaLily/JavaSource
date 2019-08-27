package day02;

import java.util.Scanner;

public class Demo08 {

	public static void main(String[] args) {
		//任何复杂的逻辑都可以通过3种结构实现：顺序结构、分支结构、循环结构
		//分支结构：有条件的执行某些语句，并非所有语句都执行
		//循环结构：有条件执行，有可能执行许多次
		
		//演示if语句
/*		int a=10;
		int b=5;
		if(a>b){
			//条件成立时要执行的语句
			System.out.println("a比b大");
		}*/
		
		/*
		 * 练习：分别从控制台接收单价和数量，计算出总价
		 * 如果总价>=500,则打8折，最后输出需要支付的金额
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入单价和数量：");
		int price=scan.nextInt();
		int num=scan.nextInt();
		float total=price*num;
		System.out.println("未打折前需要支付的金额："+total);
		if(total>=500){
			total=(float) (total*0.8);
		}
		System.out.println("需要支付的金额："+total);
		scan.close();
	}

}
