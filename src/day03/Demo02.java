package day03;

public class Demo02 {

	public static void main(String[] args) {
		// forѭ��
		/*
		 * forѭ��ʵ�ʱ�̵���ʹ�õ���Ƶ����
		 * �﷨��for(ѭ��������ʼ��;ѭ���Ŀ�������;�ı�ѭ������){
		 * 	ѭ������䣻
		 * }
		 * �ص㣺ѭ������Ҫ����Ҫ�ؽṹ������
		 */
/*		for(int num=0;num<10;num++){
			System.out.println(num);
		}*/
		
		/*
		 * ��ϰ������1-100�ĺ�
		 */
		int sum=0;    //���ڴ洢�ۼӺ�
		for(int i=1;i<=100;i++){
			sum=sum+i;
		}
		System.out.println("1-100�ĺ�Ϊ��"+sum);
		
		/*
		 * ��ϰ������1-10�ĳ˻�
		 */
		int total=1;    //���ڴ洢�˻�
		for(int i=1;i<=10;i++){
			total=total*i;
		}
		System.out.println("1-10�ĳ˻�Ϊ��"+total);
	}

}
