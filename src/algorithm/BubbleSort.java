package algorithm;

import java.util.Scanner;
//冒泡排序：重复地遍历要排序的数列，一次比较两个元素，如果顺序反了就交换，直至排序完成。
public class BubbleSort {
	//排序算法可以分为2大类：比较类排序算法和非比较类排序算法
	//比较类排序算法：通过比较确定元素的次序，其时间复杂度不能突破O(nlog(n))，所以又叫做非线性时间比较类排序
	//非比较类排序算法：不通过比较确定元素次序，可以突破基于比较排序的时间复杂度，以线性时间运行，也称线性时间非比较类排序
	static int temp;
	static int min;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++){
			min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int a:arr){
			System.out.print(a+" ");
		}
		sc.close();
	}
}
