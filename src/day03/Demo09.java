package day03;

public class Demo09 {

	public static void main(String[] args) {
		/*
		 * 练习：百钱买百鸡
		 * 现有100元钱，可以买3种鸡，公鸡5元一只，母鸡3元一只，小鸡3只1元钱
		 * 问百钱买百鸡一共有多少种买法？
		 */
		int k;     //存储小鸡的个数
		for(int i=0;i<20;i++){
			for(int j=0;j<34;j++){
				k=100-i-j;
				if(i*5+j*3+k/3==100&&k%3==0){
					System.out.println("公鸡："+i+" 母鸡："+j+" 小鸡："+k);
				}
			}
		}
	}

}
