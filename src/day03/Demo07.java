package day03;

public class Demo07 {

	public static void main(String[] args) {
		/*
		 * ��ϰ���ҳ�100�������е�����
		 * ������ֻ�ܱ�1��������������
		 */
/*		int i,j;
		System.out.println("�ҳ�100���ڵ�����������");
		for(i=2;i<=100;i++){
			for(j=2;j<=i;j++){
				if(i%j==0){
					break;
				}
			}
			if(j==i||i==2){
				System.out.print(i+" ");
			}
		}*/
		
		/*
		 * �������������Boolean���͵ı��
		 */
		boolean flag;
		System.out.println("�ҳ�100���ڵ�������");
		for(int i=2;i<=100;i++){
			flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.print(i+" ");
			}
		}
	}
}
