package day03;

public class Demo05 {

	public static void main(String[] args) {
		//��ѭ���Ĵ����̶�ʱ����ѡforѭ��
		//˫��forѭ��:Ӧ�ó���һ��������ж���ʱʹ��
		//���飺ѭ���Ĳ���Խ��Խ�ã�һ�㲻��������Ƕ��ѭ��
		/*
		 * ��ϰ��ʹ��˫��forѭ��ʵ�־žų˷���
		 */
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}
