package day03;

public class Demo08 {

	public static void main(String[] args) {
		/*
		 * ��ϰ�����ӳ���
		 * һֻ����ժ�����ɸ����ӣ���һ�����һ�룬���ֲ���񫣬�ֳ���һ����
		 * �ڶ����ֳ���һ�룬�־��ò�����г���һ��...ֱ����ʮ�����Ϸ���ֻʣһ������.
		 * �ʺ��ӵ�һ��һ��ժ�˶��ٸ����ӣ�
		 */
		int sum=1;    //�洢���ӵĸ���
		for(int i=1;i<=9;i++){
			sum=2*(sum+1);
		}
		System.out.println("����һ��ժ��"+sum+"�����ӡ�");
		
		//���н���ļ���
		for(int i=1;i<=9;i++){
			sum=sum/2-1;
			System.out.println("��"+i+"��ʣ������Ӹ���Ϊ��"+sum);
		}
	}

}
