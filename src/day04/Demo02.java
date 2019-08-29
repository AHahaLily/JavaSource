package day04;

import java.util.Arrays;

public class Demo02 {

	public static void main(String[] args) {
		// 数组的复制
		//1.System.arraycopy()
		/*
		 * public static native void arraycopy(Object src,  int  srcPos,
                                        Object dest, int destPos,
                                        int length);
           1.src：源数组
           2.srcPos：源数组的起始下标
           3.dest：目标数组
           4.destPos：目标数组的起始下标
           5.length：要复制的数组元素的个数
		 */
/*		int []arr={1,2,3,4,5};
		//定义一个数组用于复制
		
		int arr1[]=new int[6];
		System.arraycopy(arr, 0, arr1, 1, 3);
		for(int i:arr1){
			System.out.println(i);
		}*/
		
		//2.Arrays.copyOf( )
		int []arr={1,2,3,4,5};
		/*
		 * Arrays.copyOf(int[] original, int newLength)
		 * 方法参数：1.original:源数组   2.newLength:目标数组的长度
		 * 方法会根据给定的参数newLength重新创建数组，将值复制给新建立的数组后返回该数组
		 * 特点：灵活性较差，只能从源数组的下标0开始复制到目标数组的下标0开始的位置
		 */
		int arr1[]=Arrays.copyOf(arr, 4);    //arr1是复制的目标数组
		for(int i:arr1){
			System.out.println(i);
		}
	}

}
