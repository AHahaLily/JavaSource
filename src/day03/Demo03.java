package day03;

public class Demo03 {

	public static void main(String[] args) {
		// ��ˮ�ɻ�������һ����λ������������λ���ϵ����ֵ������͵��ڸ�������
		/*
		 * ��ϰ���ҳ����е�ˮ�ɻ���
		 * ˼·1��
		 */
		int num;     //���ڴ洢��ǰ�Ĳ�����
		int sum;     //���ڴ洢��
		int temp;    //���ڱ���ÿ��ȡ������λ���ĸ���ʮ����λ������
		for(int i=100;i<=999;i++){
			sum=0;
			num=i;
			for(int j=1;j<=3;j++){
				temp=num%10;
				sum=sum+temp*temp*temp;
				num=num/10;
			}
			if(sum==i){       //��λ�����ֵ������͵������ֱ�����Ϊˮ�ɻ���
				System.out.println(i);
			}
		}
	
	}

}
