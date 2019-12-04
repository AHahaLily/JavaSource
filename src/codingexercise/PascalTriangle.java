package codingexercise;

import java.util.Scanner;
//打印杨辉三角
public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int tri[][]=new int[n][];
		for(int i=0;i<n;i++){
			tri[i]=new int[i+1];
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<i+1;j++){
				if(j==0||j==i){
					tri[i][j]=1;
				}else{
					tri[i][j]=tri[i-1][j-1]+tri[i-1][j];
				}
				System.out.print(tri[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
