package day02;

import java.util.Scanner;

public class Demo08 {

	public static void main(String[] args) {
		//�κθ��ӵ��߼�������ͨ��3�ֽṹʵ�֣�˳��ṹ����֧�ṹ��ѭ���ṹ
		//��֧�ṹ����������ִ��ĳЩ��䣬����������䶼ִ��
		//ѭ���ṹ��������ִ�У��п���ִ������
		
		//��ʾif���
/*		int a=10;
		int b=5;
		if(a>b){
			//��������ʱҪִ�е����
			System.out.println("a��b��");
		}*/
		
		/*
		 * ��ϰ���ֱ�ӿ���̨���յ��ۺ�������������ܼ�
		 * ����ܼ�>=500,���8�ۣ���������Ҫ֧���Ľ��
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("�����뵥�ۺ�������");
		int price=scan.nextInt();
		int num=scan.nextInt();
		float total=price*num;
		System.out.println("δ����ǰ��Ҫ֧���Ľ�"+total);
		if(total>=500){
			total=(float) (total*0.8);
		}
		System.out.println("��Ҫ֧���Ľ�"+total);
		scan.close();
	}

}
