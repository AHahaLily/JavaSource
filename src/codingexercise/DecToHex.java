package codingexercise;

import java.util.Scanner;

public class DecToHex {
	public static void main(String[] args){
		char base[]="0123456789ABCDEF".toCharArray();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String str="";
		String res="";
		int temp;
		if(a==0){
			str="0";
		}
		while(a!=0){
			temp=a%16;
			str=str+base[temp];
			a=a/16;
		}
		for(int i=str.length()-1;i>=0;i--){
			res=res+str.substring(i,i+1);
		}
		
		System.out.println(res);
		sc.close();
	}

}
