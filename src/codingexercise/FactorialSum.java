package codingexercise;

import java.util.Scanner;

//求阶乘和
public class FactorialSum {
	public static void main(String[] args) {
/*		算法复杂度为O(nlogn)
 		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum = 0, fact, i,j;
		for (j=1;j <=n;j++) {
			fact = 1;
			for (i = 1; i <= j; i++)
				fact *= i;
			sum += fact;
		}
		System.out.println("sum=" + sum);*/
		
		//算法复杂度为O(n)
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int sum = 0, fact=1, n;
		for (n = 1; n <= m; n++) {
			fact*=n;
			sum+=fact;
		}
		System.out.println("sum=" + sum);
		sc.close();
	}
}
