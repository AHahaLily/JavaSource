package per_exercise;

import java.util.Arrays;

public class ArrExercise {
	public static void main(String[] args) {
		// 创建一维数组并初始化
		int day[]=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int i=0;i<12;i++) {//利用循环将月份信息输出
			System.out.println((i+1)+"月有"+day[i]+"天");
		}
		System.out.println(System.lineSeparator());
		
		//定义二维数组
		int a[][]=new int[3][4];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(System.lineSeparator());
		
		//定义二维数组
		int arr[][]=new int[][] {{1},{2,3},{4,5,6}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(System.lineSeparator());
		
		//定义二维数组
		int arr1[][]= {{4,3},{1,2}};
		System.out.println("数组中的二元素是：");
		int i=0;//外层循环计数器
		for(int x[]:arr1) {
			i++;//外层循环计数器递增
			int  j=0;//内层循环计数器
			for(int e:x) {
				j++;//内层计数器递增
				if(i==arr1.length&&j==x.length) {//判断是否是二维数组中的最后一个元素
					System.out.println(e);//输出二维数组的最后一个元素
				}else {
					System.out.print(e+"、");//如果不是二维数组中的最后一个元素
				}
			}
		}
		System.out.println();
		
		//使用Arrays.fill()方法进行数组填充
		int arr2[]=new int[5];
		Arrays.fill(arr2, 8);
		for(int j=0;j<arr2.length;j++) {
			System.out.println("第"+j+"个元素是："+arr2[j]);
		}
		System.out.print(System.lineSeparator());
		
		//使用Arrays.fill()方法进行数组的初始化
		int arr3[]=new int[] {45,12,2,10};
		Arrays.fill(arr3, 1, 2, 8);
		System.out.println("使用Arrays.fill进行初始化后输出数组：");
		for(int x:arr3) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println(System.lineSeparator());
		
		//利用Arrays.fill()方法替换数组中的元素
		String Arr[]=new String[]{ "ac", "bc", "dc", "yc" };
		System.out.println("替换前：");
		for(String str:Arr) {
			System.out.print(str+"\t");
		}
		System.out.println();
		Arrays.fill(Arr, 2,3,"bb");
		System.out.println("替换后：");
		for(String str:Arr) {
			System.out.print(str+"\t");
		}
		System.out.println();
		System.out.println(System.lineSeparator());
		
		//使用Arrays.sort()方法给数组排序
		int arr4[]=new int[] {23,42,12,8};
		Arrays.sort(arr4);
		System.out.println("排序后的数组：");
		for(int x:arr4) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.print(System.lineSeparator());
		
		//利用Arrays.copyOf()方法复制数组
		int []arr5=new int[] {23,42,12};
		//复制源数组中从下标0开始的5个元素到目标数组，从下标0开始存储
		int newarr5[]=Arrays.copyOf(arr5, 5);
		System.out.println("复制后的数组：");
		for(int x:newarr5) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.print(System.lineSeparator());
		
		//利用Arrays.copyOfRange()方法复制数组
		int arr6[]=new int[] {23,42,12,84,10};
		int newarr6[]=Arrays.copyOfRange(arr6, 0, 3);
		System.out.println("进行复制后的数组：");
		for(int x:newarr6) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println(System.lineSeparator());
		
		//利用Arrays.sort()方法给数组排序，并用Arrays.binarySearch()方法查找指定元素在数组中的索引位置
		int arr7[]=new int[] {1,8,9,4,5};
		Arrays.sort(arr7);//对数组进行排序
		System.out.println("输出排序后的数组：");
		for(int x:arr7) {
			System.out.print(x+" ");
		}
		System.out.println();
		int index=Arrays.binarySearch(arr7, 9);
		System.out.println("数组中元素9的索引位置是："+index+System.lineSeparator());
		
		//对String类型数组作排序和搜索操作
		String str[]=new String[] {"ab","cd","ef","yz"};
		Arrays.sort(str);//将字符串数组排序
		System.out.println("输出排序后的字符数组：");
		for(String x:str) {
			System.out.print(x+" ");
		}
		System.out.println();
		int index1=Arrays.binarySearch(str,0,2,"cd");//在指定范围内搜索元素"cd"的索引值
		System.out.println("字符串cd在字符串数组中的索引位置是："+index1);
		System.out.println();
		
		//冒泡排序
		int array[]= {63,4,24,1,3,15};//创建一个数组，其中的元素是乱序的
		sort(array);
		
		//直接选择排序
		int array1[]= {63,4,24,1,3,15};//创建一个数组，其中的元素是乱序的
		selectSort(array1);
		
		//数组反序输出
		int[] array2= {10,20,30,40,50,60};
		reverseSort(array2);
		
		//对二维数组的行列元素进行互换
		int array3[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("行列互换前的数组：");
		for(int k=0;k<array3.length;k++) {
			for(int j=0;j<array3[k].length;j++) {
				System.out.print(array3[k][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("行列互换后的数组：");
		for(int k=0;k<array3.length;k++) {
			for(int j=0;j<array3.length;j++) {
				System.out.print(array3[j][k]+"\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * 冒泡排序的方法
	 * @param arr
	 */
	public static void sort(int[] arr) {
		int temp;//中间(临时)变量
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {//比较两个相邻的元素，较大的元素向后移动
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("数组冒泡排序的结果：");
		showArr(arr);
	}
	
	/**
	 * 直接选择排序
	 * @param arr
	 */
	public static void selectSort(int arr[]) {
		int index,temp;
		for(int i=1;i<arr.length;i++) {
			index=0;
			for(int j=1;j<=arr.length-i;j++) {
				if(arr[j]>arr[index]) {//找出数组下标为0--arr.length-i-1中元素值最大的索引值
					index=j;
				}
			}
			//元素值交换
			temp=arr[arr.length-i];
			arr[arr.length-i]=arr[index];
			arr[index]=temp;
		}
		System.out.println("数组直接选择排序的结果：");
		showArr(arr);
	}
	
	/**
	 * 数组反序输出
	 */
	public static void reverseSort(int arr[]) {
		System.out.println("反序输出前的数组：");
		showArr(arr);
		int temp;//作为数值交换的中间变量
		int len=arr.length;
		for(int i=0;i<len/2;i++) {
			temp=arr[i];
			arr[i]=arr[len-i-1];
			arr[len-i-1]=temp;
		}
		System.out.println("反序输出数组元素：");
		showArr(arr);
	}
	
	/**
	 * 打印数组
	 */
	public static void showArr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(System.lineSeparator());
	}
}
