package day02;

import java.util.Scanner;

public class Demo12 {

	public static void main(String[] args) {
		// ѭ���ṹ
		/*
		 * 1.��������ִ��ĳЩ�����---����ִ��һ����ͬ�Ĵ���
		 * 2.ѭ����Ҫ�أ�ѭ��������ʼ��
		 * 			 ѭ������������ѭ��������Ϊ�жϵ����ݣ�
		 * 			ѭ�������ĸı䣨����ѭ�������ķ�����У�
		 */
		
		//whileѭ��
/*		int times=0;
		while(times<10){
			//������������ִ��ѭ�������
			System.out.println("���������۷�");
			times++;
		}*/
		
		/*
		 * ��ϰ���������100->1
		 */
	/*	int num=100;
		while(num>0){
			System.out.println(num);
			num--;
		}*/

		/*
		 * ��������Ϸ��
		 * �������1-100�Լ���κ�һ������
		 * ��ʾ��Math.random()������0-1֮���һ�����С��
		 * �ڿ���̨�������֣������������ִ������ɵ���������ʾ��������ƫ��
		 * �������С���������������ʾ��������ƫС
		 * ����¶��˾��˳�ѭ��
		 */
		int num=(int)(100*Math.random()+1); //����1-100֮���һ�������   
		System.out.println("������������ǣ�"+num);
		System.out.println("��������µ�����");
		Scanner sc=new Scanner(System.in);
		int guessnum=sc.nextInt();
		while(guessnum!=num){
			if(guessnum>num){
				System.out.println("��µ�����ƫ��");
			}else if(guessnum<num){
				System.out.println("��µ�����ƫС��");
			}
			System.out.println("������£�");
			guessnum=sc.nextInt();
			if(guessnum==num){
				System.out.println("��¶��ˣ����ɵ����ǣ�"+num);
			}
		}
		
		sc.close();
		
		//do...whileѭ��
		/*do{
			
		}while();*/
		
		//forѭ��
		/*for(;;){
			
		}*/
		
		//foreachѭ��
		/*for(int index:array){
			
		}*/
	}

}
