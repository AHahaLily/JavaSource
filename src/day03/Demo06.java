package day03;

public class Demo06 {

	public static void main(String[] args) {
		/*
		 * 练习：循环1000以内的所有完数
		 * 完数：如果一个正整数等于除它以外的所有因子之和，那么这个数就称为完数
		 * 因子：能够整除一个数，那么它就是这个数的因子
		 */
		int sum;   //存储所有因子的和
		for(int i=2;i<=1000;i++){
			sum=0;
			for(int j=1;j<i;j++){
				if(i%j==0){
					sum+=j;    //将所有因子求和
				}
			}
			if(sum==i){
				System.out.println(i);
			}
		}
	}

}
