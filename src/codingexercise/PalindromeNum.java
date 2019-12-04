package codingexercise;

import java.util.Scanner;
//求这样的五位数或六位数[回文数]：满足形如abcba或abccba，且各个位数字之和等于输入的数
public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num;
		
		for(int i=1;i<=9;i++){
			for(int j=0;j<=9;j++){
				for(int k=0;k<=9;k++){
					if(2*(i+j)+k==n){
						num=10000*i+1000*j+100*k+10*j+i;
						System.out.println(num);
					}
				}
			}
		}
		
		for(int i=1;i<=9;i++){
			for(int j=0;j<=9;j++){
				for(int k=0;k<=9;k++){
					if(2*(i+j+k)==n){
						num=100000*i+10000*j+1000*k+100*k+10*j+i;
						System.out.println(num);
					}
				}
			}
		}
		sc.close();
	}

}
