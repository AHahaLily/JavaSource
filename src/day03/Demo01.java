package day03;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		//do...while循环
		/*
		 * 语法：do{
		 * 	循环体语句
		 * }while(条件);
		 * 特点：至少执行一次循环体语句
		 */
/*		int times=0;
		do{
			System.out.println("hello");
			times++;
		}while(times<10);*/
		
		/*
		 * 练习：用do...while循环实现猜数字的游戏
		 */
		int num=(int)(100*Math.random()+1);    //随机生成一个数字
		Scanner sc= new Scanner(System.in);    //创建一个用于扫描的对象 
		int guessnum;     					   //用于存放用户从控制台输入的数字
		System.out.println("生成的随机数是："+num);
		System.out.println("进行猜数游戏，请输入你猜测的数：");
		do{
			guessnum=sc.nextInt();
			if(guessnum==num){
				//若猜中数字，则退出循环
				System.out.println("恭喜你猜中了！生成的数字是："+guessnum);
				break;
			}
			if(guessnum>num){
				System.out.println("输入的数字偏大！");
			}
			if(guessnum<num){
				System.out.println("输入的数字偏小！");
			}
			System.out.println("您未猜中，请重新输入：");	
			
		}while(true);
		sc.close();
	}

}
