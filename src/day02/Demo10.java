package day02;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		// ��ʾif...else if-else
/*		int score=90;
		if(score>=90){
			System.out.println("����");
		}else if(score>=80){
			System.out.println("����");
		}else if(score>=60){
			System.out.println("�е�");
		}else{
			System.out.println("������");
		}*/
		
		/*
		 * ��ϰ���ӿ���̨���շ������жϵȼ�
		 */
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		if(score>=90){
			System.out.println("����");
		}else if(score>=80){
			System.out.println("����");
		}else if(score>=60){
			System.out.println("�е�");
		}else{
			System.out.println("������");
		}
		sc.close();
	}

}
