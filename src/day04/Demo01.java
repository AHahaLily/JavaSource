package day04;

import java.util.Arrays;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 * ����=�㷨+���ݽṹ
		 * �㷨��������������/����
		 * ���ݽṹ�������ݰ���ĳ���ض��Ľṹ���棬�õ����ݽṹ�����ڱ�д�������㷨
		 */
		//���飺�������͵�һ��
		//1.���鶨�壺һ����ͬ�������͵�Ԫ�ذ���һ��˳�������γɵļ��ϡ�
		//int a[]={1,2,3};
		//int b[]=new int[4];    //����int�����飬�������4��Ԫ��
							   //ÿ������Ԫ�ض���int�ͣ���δ����ֵ���ʼֵ��Ϊ0
		/*int []arr=new int[]{
		  1,2,3,4,5
		};					  //һ�߶�������һ�߸���ֵ
		*/
		
		//2.�����ʹ��
		//����ͨ��������.length�� ��������ȡ������Ԫ�صĸ�����
		//����Ԫ�صķ��ʣ�ͨ��������[�±�]������������ָ��������Ԫ�أ��±�ķ�ΧΪ0-�����鳤��-1��
		//��ϰ����ʾ����ķ��ʡ�
		/*
		 * ����һ�����飬����5��Ԫ�أ��ֱ�Ϊ10��20��30��40���������
		 */
		//int arr[]={10,20,30,40,50};
		//ʹ��foreachѭ���������������Ԫ��
/*		for(int i:arr){
			System.out.println(i);
		}*/
		
		//ʹ��forѭ�����
/*		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
		
		/*
		 * ��ϰ������һ������10��Ԫ�ص����飬�������ÿ��Ԫ�ز������100���ڵ�ֵ�����δ�ӡ
		 */
		int arr[]=new int[10];
		//��ÿ������Ԫ�������ֵ
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100+1);
			System.out.println(arr[i]);
		}
		
		//����ѭ���ҳ������е����ֵ
		int max=arr[0];     //�����һ��Ԫ�ؾ������ֵ
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("max="+max);
		
		//����Arrays�ҳ������е����ֵ
		Arrays.sort(arr);     //Arrays.sort()����������Ԫ�ذ�������˳������
		System.out.println("max="+arr[arr.length-1]);
		
		
	}

}
