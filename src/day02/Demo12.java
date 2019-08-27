package day02;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		// 循环结构
		/*
		 * 1.有条件的执行某些语句多次---反复执行一段相同的代码
		 * 2.循环三要素：循环变量初始化
		 * 			 循环的条件（以循环变量作为判断的依据）
		 * 			循环变量的改变（朝着循环结束的方向进行）
		 */
		
		//while循环
/*		int times=0;
		while(times<10){
			//条件成立，则执行循环体语句
			System.out.println("走上人生巅峰");
			times++;
		}*/
		
		/*
		 * 练习：依次输出100->1
		 */
	/*	int num=100;
		while(num>0){
			System.out.println(num);
			num--;
		}*/

		/*
		 * 猜数字游戏：
		 * 随机生成1-100自检的任何一个数字
		 * 提示：Math.random()能生成0-1之间的一个随机小数
		 * 在控制台输入数字，如果输入的数字大于生成的数字则提示输入数字偏大
		 * 如果数字小于输入的数字则提示输入数字偏小
		 * 如果猜对了就退出循环
		 */
		int num=(int)(100*Math.random()+1); //产生1-100之间的一个随机数   
		System.out.println("产生的随机数是："+num);
		System.out.println("请输入你猜的数：");
		Scanner sc=new Scanner(System.in);
		int guessnum=sc.nextInt();
		while(guessnum!=num){
			if(guessnum>num){
				System.out.println("你猜的数字偏大！");
			}else if(guessnum<num){
				System.out.println("你猜的数字偏小！");
			}
			System.out.println("请继续猜：");
			guessnum=sc.nextInt();
			if(guessnum==num){
				System.out.println("你猜对了，生成的数是："+num);
			}
		}
		
		sc.close();
		
		//do...while循环
		/*do{
			
		}while();*/
		
		//for循环
		/*for(;;){
			
		}*/
		
		//foreach循环
		/*for(int index:array){
			
		}*/
	}

}
