package per_exercise;

public class Part {
	//声明常量PI，这里如果对PI不赋值，则会出现错误提示
	static final double PI=3.14;
	static int age=23;		//声明int型变量age并进行赋值
	
	static int times = 3; // 定义成员变量times
	
	public static void main(String[] args) {
		final int number;		//声明int型常量number
		number=1235;			//对常量进行赋值
		age=22;					//再次对变量进行赋值
		
		//number=1236;
		//这是错误的代码，因为number为常量，只能进行一次赋值
		
		System.out.println("常量PI的值为："+PI);
		System.out.println("number的值为："+number);
		System.out.println("int型变量age的值："+age);
		
		int times = 4; // 定义局部变量times
		System.out.println("times的值为：" + times); // 将times的值输出
		
		int a, b, c; // 声明int行变量a,b,c
		a = 15; // 将15赋值给变量a
		c = b = a + 4; // 将a与4的和赋值给变量b，然后再赋值给变量c
		System.out.println("c值为：" + c); // 将变量c的值输出
		System.out.println("b值为：" + b); // 将变量b的值输出
		
		float number1 = 45.56f; // 声明float型变量并赋值
		int number2 = 152; // 声明int型变量并赋值
		System.out.println("和为："+(number1+number2));
		System.out.println("差为："+(number1-number2));
		System.out.println("积为："+(number1*number2));
		System.out.println("商为："+(number1/number2));
		
		int number3=4;	//声明int型变量number3
		int number4=5;	//声明int型变量number4
		System.out.println("number3>number4的返回值为："+(number3>number4));
		System.out.println("number3<number4的返回值为："+(number3<number4));
		System.out.println("number3==number4的返回值为："+(number3==number4));
		System.out.println("number3！=number4的返回值为："+(number3!=number4));
		System.out.println("number3>=number4的返回值为："+(number3>=number4));
		System.out.println("number3<=number4的返回值为："+(number3<=number4));
		
	}

}
