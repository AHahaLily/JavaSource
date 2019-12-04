package codingexercise;

import java.util.Scanner;

public class IsPrimeNumber {
	
	//判断一个数是不是素数
	public static boolean prime(int n){
		int i;
		for(i=2;i<=n/2;i++){
			if(n%i==0){
				break;
			}
		}
		if(i>n/2&&n!=1){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(prime(n));
		sc.close();
	}

}
