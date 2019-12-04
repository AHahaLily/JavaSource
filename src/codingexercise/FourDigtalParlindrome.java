package codingexercise;

public class FourDigtalParlindrome {
	public static void main(String[] args) {
		//求满足abba的四位数
		int num;
		for(int i=1;i<=9;i++){
			for(int j=0;j<=9;j++){
				num=i*1000+j*100+j*10+i;
				System.out.println(num);
			}
		}

	}

}
