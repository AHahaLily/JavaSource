package per_exercise;

public class MapText {
	static int age=20;		//声明的类变量（成员变量）
	
	public static void map() {
		//方法map中定义的变量都是局部变量
		age=30;
		String name="lili";
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		//System.out.println(name+"的年龄是:"+age);
		//错误代码，局部变量不可用于主方法中

	}

}
