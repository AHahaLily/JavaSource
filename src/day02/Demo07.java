package day02;

import java.util.Scanner;   //���빤�߰�

public class Demo07 {

	public static void main(String[] args) {
		// Scanner���÷�
		//�ع˸�������ֵ�ķ�����1.������һ���̶���ֵ����int a=5;
		//2.����Scanner�����û������ֵ
		//3.�����ֵ
		
		//��2�ַ�����ʹ�ã�
		//��package����µ��빤�ߣ�import java.util.Scanner;
		//��main�����б�д��䣺Scanner sc=new Scanner(System.in);
		//�������������ʾ��䣺System.out.println("������xxxxx");
		//���ô������������ķ������дӼ�������
		
/*		Scanner sc=new Scanner(System.in);
		//����һ��ɨ���Ƕ���
		System.out.println("������������ͣ�");
		int age=sc.nextInt();
		System.out.println(age);
		sc.close();*/
		
		//�жϴӿ���̨�����һ������Ƿ�������
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();                      //��ȡ�û���������
		//����Ŀ�����жϲ���ý��
		String res=(year%4==0&&year%100!=0)||(year%400==0)?year+"������":year+"��������";
		System.out.println(res);
		
		//��ע������Ctrl+Shift+/���ж���ע�ͣ�Ctrl+Shift+\ȡ������ע��
/*		//��if..else��֧��д�ж����
		if(year%4==0&&year%100!=0||year%400==0){    //�ж��Ƿ�Ϊ����
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��������");
		}*/
		sc.close();
	}

}
