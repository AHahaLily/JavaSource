package day04;

public class Demo05 {
	public static char[] getFiveChar(){
		char []arr=new char[26];		//���ڴ洢26����ĸ���ַ�
		boolean list[]=new boolean[26]; //���ڱ�ʾ��Ӧ����ĸ�Ƿ�ѡȡ
		for(int i=0;i<arr.length;i++){
			arr[i]=(char) ('A'+i);
		}
		int index;                      //��������ɵ�λ��ֵ
		int num[]=new int[5];			//���������ɵ�5���ַ���arr�ֵ�position
		for(int i=0;i<5;i++){
			index=(int)(Math.random()*26);
			while(list[index]==true){	//�ж������ɵ�λ�ö�Ӧ����ĸ�Ƿ�ѡ�������������������һ��λ��
				index=(int)(Math.random()*26);
			}
			//����ĸδ��ѡ������ѡ�и���ĸ���������Ӧ��booleanֵ��Ϊtrue
			num[i]=index;
			list[index]=true;
		}
		char res[]=new char[5];		   //������ɵ�5���ַ�
		for(int i=0;i<5;i++){
			res[i]=arr[num[i]];
		}
		return res;
	}

	public static void main(String[] args) {
		/*
		 * �������5�����ظ�����ĸ�ַ�
		 */
		System.out.println(String.valueOf(getFiveChar()));
	}

}
