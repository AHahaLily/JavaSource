package day02;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		// switch��֧
		//switch�ŵ㣺Ч�ʸ߽ṹ����
		//ȱ�㣺��������ֵ��Ӧ���
/*		switch(2){
		case 1:System.out.println(111);break;
		case 2:System.out.println(222);break;
		default:System.out.println("��ƥ��ĳ���ֵ");
		}*/
		
		/*
		 * ��ϰ���ӿ���̨�����û������ֵ��Ȼ����û�ƥ����Ӧ�ķ���
		 */
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		switch(input){
		case 1:System.out.println("��ͨ������");break;
		case 2:System.out.println("Ӣ�����");break;
		default:System.out.println("������������");
		//�����е�input��ֵ�����е�case�����ֵ����ƥ��ʱ����ִ��default��������
		}
		sc.close();
	}

}
