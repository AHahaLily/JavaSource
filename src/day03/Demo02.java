package day03;

public class Demo02 {

	public static void main(String[] args) {
		// for循环
		/*
		 * for循环实际编程当中使用的最频繁。
		 * 语法：for(循环变量初始化;循环的控制条件;改变循环变量){
		 * 	循环体语句；
		 * }
		 * 特点：循环所需要的三要素结构清晰；
		 */
/*		for(int num=0;num<10;num++){
			System.out.println(num);
		}*/
		
		/*
		 * 练习：计算1-100的和
		 */
		int sum=0;    //用于存储累加和
		for(int i=1;i<=100;i++){
			sum=sum+i;
		}
		System.out.println("1-100的和为："+sum);
		
		/*
		 * 练习：计算1-10的乘积
		 */
		int total=1;    //用于存储乘积
		for(int i=1;i<=10;i++){
			total=total*i;
		}
		System.out.println("1-10的乘积为："+total);
	}

}
