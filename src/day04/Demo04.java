package day04;

import java.util.Scanner;

public class Demo04 {
	/*//���������ĺ�
	public static int add(int num1,int num2){
		return num1+num2;
	}
	
	//���������Ĳ�
	public static int sub(int num1,int num2){
		return num1-num2;
	}
	
	//���������Ļ�
	public static int multiple(int num1,int num2){
		return num1*num2;
	}
	
	//������������
	public static int divide(int num1,int num2){
		return num1/num2;
	}*/
	
	//ʹ�õݹ����һ�����Ľ׳�
	public static int remultiple(int num){
		//�ݹ����
		if(num==0){
			return 1;
		}
		//�ݹ�
		//����num--���ݹ麯���Ĳ���ʹ�õݼ�����java.lang.StackOverflowError��ջ���������
		//����ʹ��num-1
		
		//��һ������£���ͬƽ̨Ĭ��ջ��С����(�����ο�)��
		//SunOS/Solar��8172K bytes (SharedVersion)
		//Linux ��10240 K bytes
		//Windows�� 1024K bytes(Release Version)
		
		return num*remultiple(num-1);
	}
	
	/*//ʹ��ѭ������һ�����Ľ׳�
	public static int remulti(int num){
		int sum=1;
		for(int i=2;i<=num;i++){
			sum=sum*i;
		}
		return sum;
	}
*/
	public static void main(String[] args) {
		/*
		 * ʵ�ּ�����ļӼ��˳�����
		 * ����������������add���������Ǽ�����
		 * ����sub���������ǵĲ�
		 * ...
		 * ����һ���������õ����Ľ׳�
		 */
		Scanner sc=new Scanner(System.in);
/*		int input1=sc.nextInt();
		int input2=sc.nextInt();
		System.out.println(input1+"+"+input2+"="+add(input1,input2));
		System.out.println(input1+"-"+input2+"="+sub(input1,input2));
		System.out.println(input1+"*"+input2+"="+multiple(input1, input2));
		System.out.println(input1+"/"+input2+"="+divide(input1,input2));*/
		
		System.out.println("���㴫������Ľ׳ˣ�");
		int input3=sc.nextInt();
		//System.out.println("��ѭ����õĽ׳ˣ�"+remulti(input3));
		System.out.println("�õݹ���õĽ׳ˣ�"+remultiple(input3));
		sc.close();
	}

}
