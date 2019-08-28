package day03;

public class Demo05 {

	public static void main(String[] args) {
		//当循环的次数固定时，首选for循环
		//双重for循环:应用场景一般操作多行多列时使用
		//建议：循环的层数越少越好，一般不超过三层嵌套循环
		/*
		 * 练习：使用双重for循环实现九九乘法表
		 */
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}
