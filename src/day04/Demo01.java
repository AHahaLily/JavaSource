package day04;

import java.util.Arrays;

public class Demo01 {

	public static void main(String[] args) {
		/*
		 * 程序=算法+数据结构
		 * 算法：解决问题的流程/步骤
		 * 数据结构：将数据按照某种特定的结构保存，好的数据结构有助于编写优良的算法
		 */
		//数组：引用类型的一种
		//1.数组定义：一组相同数据类型的元素按照一定顺序排列形成的集合。
		//int a[]={1,2,3};
		//int b[]=new int[4];    //声明int型数组，数组包含4个元素
							   //每个数组元素都是int型，若未赋初值则初始值都为0
		/*int []arr=new int[]{
		  1,2,3,4,5
		};					  //一边定义数组一边赋初值
		*/
		
		//2.数组的使用
		//数组通过数组名.length（ ）方法获取数组中元素的个数。
		//数组元素的访问：通过数组名[下标]来访问数组中指定索引的元素，下标的范围为0-（数组长度-1）
		//练习：演示数组的访问。
		/*
		 * 定义一个数组，包含5个元素，分别为10，20，30，40并依次输出
		 */
		//int arr[]={10,20,30,40,50};
		//使用foreach循环遍历并输出数组元素
/*		for(int i:arr){
			System.out.println(i);
		}*/
		
		//使用for循环输出
/*		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
		
		/*
		 * 练习：定义一个包含10个元素的数组，给里面的每个元素产生随机100以内的值并依次打印
		 */
		int arr[]=new int[10];
		//给每个数组元素随机赋值
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100+1);
			System.out.println(arr[i]);
		}
		
		//利用循环找出数组中的最大值
		int max=arr[0];     //假设第一个元素就是最大值
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println("max="+max);
		
		//利用Arrays找出数组中的最大值
		Arrays.sort(arr);     //Arrays.sort()方法将数组元素按递增的顺序排列
		System.out.println("max="+arr[arr.length-1]);
		
		
	}

}
