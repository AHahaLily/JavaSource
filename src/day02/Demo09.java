package day02;

import java.util.Scanner;

public class Demo09 {

	public static void main(String[] args) {
		// if...else��֧��䣺������������ĳ�£���������һ����
/*		int score=50;
		if(score>=60){
			System.out.println("������������");
		}else{
			System.out.println("��������������");
		}*/
		
		/*
		 * ��ϰ���ӿ���̨����һ�������ж��ǲ���ż��
		 */
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println("������һ��ż��");
		}else{
			System.out.println("��������һ��ż��");
		}
		sc.close();
	}

}
