package day03;

public class Demo08 {

	public static void main(String[] args) {
		/*
		 * 练习：猴子吃桃
		 * 一只猴子摘了若干个桃子，第一天吃了一半，发现不过瘾，又吃了一个；
		 * 第二天又吃了一半，又觉得不过瘾有吃了一个...直到第十天早上发现只剩一个桃子.
		 * 问猴子第一天一共摘了多少个桃子？
		 */
		int sum=1;    //存储桃子的个数
		for(int i=1;i<=9;i++){
			sum=2*(sum+1);
		}
		System.out.println("猴子一共摘了"+sum+"个桃子。");
		
		//进行结果的检验
		for(int i=1;i<=9;i++){
			sum=sum/2-1;
			System.out.println("第"+i+"天剩余的桃子个数为："+sum);
		}
	}

}
