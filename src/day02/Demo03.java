package day02;

public class Demo03 {

	public static void main(String[] args) {
		//һ���������Ƶ��ù�ϵ�����������������Ƶ���ʹ���߼������
		//&&  ���߼�
		//||  ���߼�
		int a=10;
		int b=5;
		boolean flag1=a>b&&b<a;    //true
		//ͬʱΪture�����Ϊtrue
		boolean flag2=a==b||a!=b;  //true
		//ֻҪ��һ��΢true�����Ϊtrue
		boolean flag3=!(a<=b);     //true
		//�����㣬�Ա��ʽ���߼�ֵ����ֵ��ȡ��
		System.out.println(flag1+" "+flag2+" "+flag3);
	}

}
