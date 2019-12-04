package per_exercise;

public class GetSum {

	public static void main(String[] args) {
		//利用while循环求和
		int x=1;
		int sum=0;		//定义变量用于保存相加后的结果
		while(x<=10) {
			//while循环语句：当变量满足条件表达式时则执行循环体语句
			sum=sum+x;
			x++;
		}
		System.out.println("sum="+sum);
		
		//while循环
		int a=100;
		while(a==60) {	//指定进入循环的条件，若不满足条件则不进入循环
			System.out.println("ok1");
			a--;
		}
		
		double sum1=0,a1=1;
		int i=1;
		while(i<=20) {
			sum1=sum1+a1;
			i=i+1;
			a1=a1*(1.0/i);
		}
		System.out.println(sum1);
		System.out.println("-------");
		//do...while循环
		//至少执行一次
		int b=100;
		do {
			System.out.println("ok2");
			b--;
		}while(b==60);	//指定进入循环的条件
		
		//for循环
		int sum2=0;		//声明变量，用于保存个数相加后的结果
		for(int ii=2;ii<=100;ii+=2) {  //指定循环的三要素
			sum2=sum2+ii;
		}
		System.out.println("2到100之间的所有偶数之和为："+sum2);
		
	}

}
