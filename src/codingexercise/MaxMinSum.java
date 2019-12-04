package codingexercise;

import java.util.Scanner;

public class MaxMinSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int min=0;
		int max=0;
		int sum=arr[0];
		for(int i=1;i<n;i++){
			if(arr[min]>arr[i]){
				min=i;
			}
			if(arr[max]<arr[i]){
				max=i;
			}
			sum=sum+arr[i];
		}
		System.out.println(arr[max]);
		System.out.println(arr[min]);
		System.out.println(sum);
		sc.close();
	}

}
