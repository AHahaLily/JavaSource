package day02;

import java.util.Scanner;   //导入工具包

public class Demo07 {

	public static void main(String[] args) {
		// Scanner的用法
		//回顾给变量赋值的方法：1.给变量一个固定的值，如int a=5;
		//2.利用Scanner接收用户输入的值
		//3.随机赋值
		
		//第2种方法的使用：
		//在package语句下导入工具：import java.util.Scanner;
		//在main方法中编写语句：Scanner sc=new Scanner(System.in);
		//可以添加输入提示语句：System.out.println("请输入xxxxx");
		//利用创建的输入对象的方法进行从键盘输入
		
/*		Scanner sc=new Scanner(System.in);
		//创建一个扫描仪对象
		System.out.println("请输入您的年纪：");
		int age=sc.nextInt();
		System.out.println(age);
		sc.close();*/
		
		//判断从控制台输入的一个年份是否是闰年
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();                      //获取用户输入的年份
		//用三目运算判断并获得结果
		String res=(year%4==0&&year%100!=0)||(year%400==0)?year+"是闰年":year+"不是闰年";
		System.out.println(res);
		
		//标注：可用Ctrl+Shift+/进行多行注释，Ctrl+Shift+\取消多行注释
/*		//用if..else分支编写判断语句
		if(year%4==0&&year%100!=0||year%400==0){    //判断是否为闰年
			System.out.println(year+"是闰年");
		}else{
			System.out.println(year+"不是闰年");
		}*/
		sc.close();
	}

}
