package codingexercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestFor {

	public static void main(String[] args) throws InterruptedException {
		List<String> frames=new ArrayList<String>();
		frames.add("springmvc 控制层框架");
		frames.add("Spring 业务层框架");
		frames.add("mybatis 持久层框架");
		
		System.out.println("for循环换的方式遍历");
		for(int i=0;i<frames.size();i++) {
			System.out.println(frames.get(i));
		}
		System.out.println(System.lineSeparator());
		
		System.out.println("使用迭代器遍历：");
		for(Iterator<String> it=frames.iterator();it.hasNext();) {
			String s=it.next();
			System.out.println(s);
		}
		System.out.println(System.lineSeparator());
		
		System.out.println("对象for循环方式遍历：");
		for(String s:frames) {
			System.out.println(s);
		}
		System.out.println(System.lineSeparator());
		
		//打印左三角形
		for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println(System.lineSeparator());
		
		//打印右三角形
		for(int i=0;i<10;i++) {
			for(int j=0;j<10-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println(System.lineSeparator());
		
		//打印正三角形
		int len=10;
		for(int i=0;i<len;i++) {
			if(i%2==0) {	//奇数个*才能实现左右对齐，若为偶数个则跳过
				continue;
			}
			
			for(int j=0;j<(len-i)/2;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int j=0;j<(len-i)/2;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println(System.lineSeparator());
		

		TestFor.diamond(14);
		
		//程序延时执行
		Thread.sleep(2000);	
		System.out.println("利用Thread.sleep使得程序延迟执行");
		
	}
	
	//菱形
	//编程要点：奇数才能形成左右对称；
	//先打印正三角形，再打印倒三角形，以此拼接成菱形
	//两个循环，一个打印空格，一个打印*
	//正三角形需去掉最后一行，否则会和倒三角形的第一行重复
	public static void diamond(int lineNum) throws InterruptedException {
		int length=lineNum;
		
		//打印菱形的上半部分
		for(int i=0;i<length;i++) {
			if(i%2==0) {	//奇数行才能实现两边对齐
				continue;
			}
			if(i==length-1) {	//上三角不打印最长的一行，避免重复
				continue;
			}
			
			//打印空格
			for(int k=0;k<(length-i)/2;k++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			for(int k=0;k<(length-i)/2;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		
		//打印菱形的下半部分
		for(int i=length;i>0;i--) {
			if(i%2==0) {	//奇数行才打印
				continue;
			}
			
			for(int k=0;k<(length-i)/2;k++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			for(int k=0;k<(length-i)/2;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	

}
