package day04;

import java.util.Arrays;

public class Demo02 {

	public static void main(String[] args) {
		// ����ĸ���
		//1.System.arraycopy()
		/*
		 * public static native void arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length);
           1.src��Դ����
           2.srcPos��Դ�������ʼ�±�
           3.dest��Ŀ������
           4.destPos��Ŀ���������ʼ�±�
           5.length��Ҫ���Ƶ�����Ԫ�صĸ���
		 */
/*		int []arr={1,2,3,4,5};
		//����һ���������ڸ���
		
		int arr1[]=new int[6];
		System.arraycopy(arr, 0, arr1, 1, 3);
		for(int i:arr1){
			System.out.println(i);
		}*/
		
		//2.Arrays.copyOf( )
		int []arr={1,2,3,4,5};
		/*
		 * Arrays.copyOf(int[] original, int newLength)
		 * ����������1.original:Դ����   2.newLength:Ŀ������ĳ���
		 * ��������ݸ����Ĳ���newLength���´������飬��ֵ���Ƹ��½���������󷵻ظ�����
		 * �ص㣺����Խϲֻ�ܴ�Դ������±�0��ʼ���Ƶ�Ŀ��������±�0��ʼ��λ��
		 */
		int arr1[]=Arrays.copyOf(arr, 4);    //arr1�Ǹ��Ƶ�Ŀ������
		for(int i:arr1){
			System.out.println(i);
		}
	}

}
