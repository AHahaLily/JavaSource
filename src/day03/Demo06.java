package day03;

public class Demo06 {

	public static void main(String[] args) {
		/*
		 * ��ϰ��ѭ��1000���ڵ���������
		 * ���������һ�����������ڳ����������������֮�ͣ���ô������ͳ�Ϊ����
		 * ���ӣ��ܹ�����һ��������ô�����������������
		 */
		int sum;   //�洢�������ӵĺ�
		for(int i=2;i<=1000;i++){
			sum=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum+=j;    //�������������
				}
			}
			if(sum==i){
				System.out.println(i);
			}
		}
	}

}
