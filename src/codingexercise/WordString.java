package codingexercise;
//0-1字串：对于长度为5位的一个01串，一共有32种可能，请按从小到大的顺序输出着32种01串。
public class WordString {
	public static void main(String[] args) {
		int temp;
		char ch[]={'0','1'};
		char res[]=new char[5];
		for(int i=0;i<32;i++){
			temp=i;
			for(int j=0;j<5;j++){
				res[5-j-1]=ch[temp&1];
				temp=temp>>>1;
			}
			for(int j=0;j<5;j++){
				System.out.print(res[j]);
			}
			System.out.println();
		}

	}

}
