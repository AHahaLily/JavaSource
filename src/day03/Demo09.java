package day03;

public class Demo09 {

	public static void main(String[] args) {
		/*
		 * ��ϰ����Ǯ��ټ�
		 * ����100ԪǮ��������3�ּ�������5Ԫһֻ��ĸ��3Ԫһֻ��С��3ֻ1ԪǮ
		 * �ʰ�Ǯ��ټ�һ���ж������򷨣�
		 */
		int k;     //�洢С���ĸ���
		for(int i=0;i<20;i++){
			for(int j=0;j<34;j++){
				k=100-i-j;
				if(i*5+j*3+k/3==100&&k%3==0){
					System.out.println("������"+i+" ĸ����"+j+" С����"+k);
				}
			}
		}
	}

}
