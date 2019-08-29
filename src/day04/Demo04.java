package day04;

import java.util.Scanner;

public class Demo04 {
	/*//求两个数的和
	public static int add(int num1,int num2){
		return num1+num2;
	}
	
	//求两个数的差
	public static int sub(int num1,int num2){
		return num1-num2;
	}
	
	//求两个数的积
	public static int multiple(int num1,int num2){
		return num1*num2;
	}
	
	//求两个数的商
	public static int divide(int num1,int num2){
		return num1/num2;
	}*/
	
	//使用递归计算一个数的阶乘
	public static int remultiple(int num){
		//递归出口
		if(num==0){
			return 1;
		}
		//递归
		//错误：num--，递归函数的参数使用递减引发java.lang.StackOverflowError（栈溢出）错误
		//所以使用num-1
		
		//在一般情况下，不同平台默认栈大小如下(仅供参考)：
		//SunOS/Solar：8172K bytes (SharedVersion)
		//Linux ：10240 K bytes
		//Windows： 1024K bytes(Release Version)
		
		return num*remultiple(num-1);
	}
	
	/*//使用循环计算一个数的阶乘
	public static int remulti(int num){
		int sum=1;
		for(int i=2;i<=num;i++){
			sum=sum*i;
		}
		return sum;
	}
*/
	public static void main(String[] args) {
		/*
		 * 实现计算机的加减乘除功能
		 * 传入两个数，调用add方法把它们加起来
		 * 调用sub方法求它们的差
		 * ...
		 * 传入一个参数，得到它的阶乘
		 */
		Scanner sc=new Scanner(System.in);
/*		int input1=sc.nextInt();
		int input2=sc.nextInt();
		System.out.println(input1+"+"+input2+"="+add(input1,input2));
		System.out.println(input1+"-"+input2+"="+sub(input1,input2));
		System.out.println(input1+"*"+input2+"="+multiple(input1, input2));
		System.out.println(input1+"/"+input2+"="+divide(input1,input2));*/
		
		System.out.println("计算传入的数的阶乘：");
		int input3=sc.nextInt();
		//System.out.println("用循环求得的阶乘："+remulti(input3));
		System.out.println("用递归求得的阶乘："+remultiple(input3));
		sc.close();
	}

}
