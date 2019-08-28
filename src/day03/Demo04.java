package day03;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		/*
		 * 练习：出10道100以内的加法，并作出判断，最后计算出总分
		 * 1.出一道100以内的加法题
		 * a+b=?
		 * 2.打印题目
		 * 3.答题：从控制台获取答案
		 * 4.判断：int result=a+b;
		 *       比较result和控制台输入的答案
		 */
		Scanner sc=new Scanner(System.in);
		int a,b,trueans,result,score=0;
		for(int i=0;i<10;i++){
			a=(int)(Math.random()*100+1);
			b=(int)(Math.random()*100+1);
			trueans=a+b;
			System.out.println(a+"+"+b+"=?");
			System.out.println("请输入答案：");
			result=sc.nextInt();
			if(result==trueans){
				System.out.println("回答正确！");
				score+=result;
			}else{
				System.out.println("回答错误！");
			}
		}
		System.out.println("答题结束！你的得分为："+score);
		sc.close();
	}

}
