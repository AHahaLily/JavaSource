package day03;

import java.util.Scanner;

public class Demo01 {

	public static void main(String[] args) {
		//do...whileѭ��
		/*
		 * �﷨��do{
		 * 	ѭ�������
		 * }while(����);
		 * �ص㣺����ִ��һ��ѭ�������
		 */
/*		int times=0;
		do{
			System.out.println("hello");
			times++;
		}while(times<10);*/
		
		/*
		 * ��ϰ����do...whileѭ��ʵ�ֲ����ֵ���Ϸ
		 */
		int num=(int)(100*Math.random()+1);    //�������һ������
		Scanner sc= new Scanner(System.in);    //����һ������ɨ��Ķ��� 
		int guessnum;     					   //���ڴ���û��ӿ���̨���������
		System.out.println("���ɵ�������ǣ�"+num);
		System.out.println("���в�����Ϸ����������²������");
		do{
			guessnum=sc.nextInt();
			if(guessnum==num){
				//���������֣����˳�ѭ��
				System.out.println("��ϲ������ˣ����ɵ������ǣ�"+guessnum);
				break;
			}
			if(guessnum>num){
				System.out.println("���������ƫ��");
			}
			if(guessnum<num){
				System.out.println("���������ƫС��");
			}
			System.out.println("��δ���У����������룺");	
			
		}while(true);
		sc.close();
	}

}
