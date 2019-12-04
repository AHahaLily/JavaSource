package codingexercise;

import java.util.Scanner;

public class LettersGraph {
	//利用字母可以组成一些图形，例如ABCDEFG、BABCDEF、CBABCDE、DCBABCD、EDCBABC
	//这是一个5行7列的图形，找出这个图形的规律并输出一个n行m列的图形。（1<=n,m<=26）
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char temp[];
		String res;
		String temp1;
		String temp2;
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int len;
		for(int i=0;i<n;i++){
			temp=str.substring(0,i+1).toCharArray();
			len=temp.length;
			temp1="";
			for(int j=len-1;j>=0;j--){
				temp1=temp1+temp[j];
			}
			if(len>=m){
				res=String.valueOf(temp1).substring(0,m);
				temp=res.toCharArray();
			}else{
				temp2=str.substring(1,m-len+1);
				res=temp1+temp2;
			}
			System.out.println(res);
		}
		sc.close();
	}

}
