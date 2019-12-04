package codingexercise;

public class MultiplicationTable {
	//打印九九乘法表
	public static void main(String[] args) {
		int n = 9;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++)
				System.out.print(i + "*" + j +"="+ i * j+" ");
			System.out.println();
		}
	}
}
