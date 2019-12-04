package per_exercise;

public class TestClass {
	int i=47;//定义成员变量
	static int x=17;//定义静态成员变量
	
	public TestClass() {//定义无参构造函数(方法)
		System.out.println("已创建一个TestClass类的实例");
		System.out.print(System.lineSeparator());
	}
	
	public void call() {//定义成员方法
		System.out.println("调用call()方法");
		for(i=0;i<3;i++) {
			System.out.print(i+" ");
			if(i==2) {
				System.out.println("\n");
			}
		}
	}
	
	public static void main(String[] args) {
		new TestClass();//创建一个TestClass类的对象
		
		TestClass tc1=new TestClass();//创建一个TestClass类的对象
		TestClass tc2=new TestClass();//创建TestClass类的另一个对象
		tc2.i=60;//将对象tc2的类成员变量赋值为60
		//使用对象tc1调用类成员变量
		System.out.println(tc1.i++);
		//使用对象tc1调用类成员方法
		tc1.call();
		//使用对象tc2调用类成员变量
		System.out.println(tc2.i);
		//使用对象tc2调用类成员方法
		tc2.call();
		
		TestClass t1=new TestClass();// 创建一个对象
		TestClass t2=new TestClass();// 创建另一个对象
		//The static field TestClass.x should be accessed in a static way
		//所以调用静态成员变量建议改为TestClass.x，而不是 使用创建的对象调用
		//t2.x=60;// 将静态类成员变量赋值为60
		TestClass.x=60;
		//System.out.println(t1.x++);// 使用第一个对象调用类成员变量
		System.out.println(TestClass.x++);
		t1.call();// 使用第一个对象调用类成员方法
		//System.out.println(t2.x);// 使用第二个对象调用类成员变量
		System.out.println(TestClass.x);
		t2.call();// 使用第二个对象调用类成员方法
		
		String c1=new String("abc");
		String c2=new String("abc");
		String c3=c1;//将c1对象的引用赋给c3
		//使用"=="运算符比较c1与c3
		System.out.println("c1==c3的运算结果为："+(c1==c3));
		//使用"=="运算符比较c2与c3
		System.out.println("c2==c3的运算结果为："+(c2==c3));
		//使用equals()方法比较c2与c3
		System.out.println("c2.equals(c3)"+c2.equals(c3));
	}
}
