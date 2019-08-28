package day03;

public class Demo03 {

	public static void main(String[] args) {
		// 求水仙花数：是一个三位数，它的三个位置上的数字的立方和等于该数本身
		/*
		 * 练习：找出所有的水仙花数
		 * 思路1：
		 */
		int num;     //用于存储当前的操作数
		int sum;     //用于存储和
		int temp;    //用于保存每次取到的三位数的个、十、百位的数字
		for(int i=100;i<=999;i++){
			sum=0;
			num=i;
			for(int j=1;j<=3;j++){
				temp=num%10;
				sum=sum+temp*temp*temp;
				num=num/10;
			}
			if(sum==i){       //各位上数字的立方和等于数字本身，即为水仙花数
				System.out.println(i);
			}
		}
	
	}

}
