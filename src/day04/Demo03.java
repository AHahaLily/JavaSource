package day04;

import java.util.Scanner;

public class Demo03 {
/*	public static void sayHi() {
		System.out.println("hello");
	}

	public static void sayHello(String name) {
		System.out.println("��ã�����" + name);
		;
	}

	public static int getAge() {
		System.out.println("����������꼶:");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		return age;
	}*/
	
	public static int calSquare(int length,int width){
		return length*width;
	}
	
	public static int calVolume(int len,int wid,int height){
		return len*wid*height;
	}

	public static void main(String[] args) {
		/* ���������ڷ�װһ���ض����߼�ҵ��
		 * �������ŵ㣺���Է���ı��������ã��������ε��ظ�����ߴ���ĸ�����
		 * 1.��д���������η� ����ֵ ��������������{����������}
		 * ���η���Ȩ�����η�public private protected
		 * 		��̬���η�static
		 * ����ֵ���в�ͬ������
		 * ������������Java�б�ʶ��������������������֪��
		 * ��������������ʱ���뷽�������ݹ�����ʹ��
		 * 2.�����ĵ��ã��в����������������Ӧ�Ĳ�����û�в�����������Ϊ��
		 * û�з���ֵ���͵ķ�����ֱ��ͨ�����������÷���
		 * �з���ֵ�ķ�����ʹ��return������Ӧ�����͵�ֵ
		 */
/*		sayHello("Lili");
		int age=getAge();
		System.out.println(age);*/
		
		/*
		 * ��ϰ��дһ���в��������з���ֵ�ķ���
		 * 1.���볤�Ϳ������������ӡ���
		 * 2.���볤�����ߣ�����������ӡ ���
		 */
		System.out.println("���볤�Ϳ�");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(calSquare(a,b));
		
		System.out.println("���볤�����ߣ�");
		int aa=sc.nextInt();
		int bb=sc.nextInt();
		int cc=sc.nextInt();
		System.out.println(calVolume(aa,bb,cc));
		sc.close();
	}

}
