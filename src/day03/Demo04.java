package day03;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		/*
		 * ��ϰ����10��100���ڵļӷ����������жϣ���������ܷ�
		 * 1.��һ��100���ڵļӷ���
		 * a+b=?
		 * 2.��ӡ��Ŀ
		 * 3.���⣺�ӿ���̨��ȡ��
		 * 4.�жϣ�int result=a+b;
		 *       �Ƚ�result�Ϳ���̨����Ĵ�
		 */
		Scanner sc=new Scanner(System.in);
		int a,b,trueans,result,score=0;
		for(int i=0;i<10;i++){
			a=(int)(Math.random()*100+1);
			b=(int)(Math.random()*100+1);
			trueans=a+b;
			System.out.println(a+"+"+b+"=?");
			System.out.println("������𰸣�");
			result=sc.nextInt();
			if(result==trueans){
				System.out.println("�ش���ȷ��");
				score+=result;
			}else{
				System.out.println("�ش����");
			}
		}
		System.out.println("�����������ĵ÷�Ϊ��"+score);
		sc.close();
	}

}
