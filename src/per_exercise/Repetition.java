package per_exercise;

public class Repetition {

	public static void main(String[] args) {
		//foreach循环
		int arr[]= {7,10,1};	//声明一维数组
		System.out.println("一维数组中的元素分别为：");
		for(int x:arr) {
			//foreach语句，int x---引用的变量，arr---指定要循环遍历的数组，最后将x输出
			System.out.println(x);
		}
		System.out.println("------------");
		
		//break
		for(int i=0;i<=100;i++) {
			System.out.println(i);
			if(i==6) {
				break;
			}
		}
		System.out.println("---end---");
		
		//跳出内循环
		for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				if(j==4) {
					break;
				}
				System.out.println("i="+i+" j="+j);
			}
		}
		System.out.println("------");
		
		//借助标签跳出外循环
		Loop:for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				if(j==4) {
					break Loop;
				}
				System.out.println("i="+i+" j="+j);
			}
		}
		System.out.println("------");
		
		//continue
		for(int i=0;i<20;i++) {
			if(i%2==0) {
				//如果i是偶数，则跳到下一次循环
				continue;
			}
			System.out.println(i);
		}
	}

}
