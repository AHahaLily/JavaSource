package day02;

public class Demo01 {

	public static void main(String[] args) {
		//����+ - * / %
		int a=10;
		int b=5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		//�ص㣺++�������������  --���Լ��������
		a++;   //a=a+1;
		b--;   //b=b-1;
		System.out.println(a+" "+b);
		++a;
		--b;
		System.out.println(a+" "+b);
		
		//��Ϊǰ׺�ͺ�׺ʹ��������:
		//����/���������ǰ���ȼ�����ȡֵ
		//����/�Լ�������ں���ȡֵ�ټ���
		System.out.println(a++);
		System.out.println(++b);
		
		int c=20;
		int d=10;
		c++;   //c=21
		--d;   //d=9
		int e=c--;   //e=21 c=20
		int f=++d;   //f=10 d=10
		int g=++c;   //g=21 c=21
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("e:"+e);
		System.out.println("f:"+f);
		System.out.println("g:"+g);
		
		
		//ȡ������
		int aa=10;
		int bb=3;
		System.out.println(aa/bb);   //3
		System.out.println(aa%bb);        //1
		
		
	}

}
