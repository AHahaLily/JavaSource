package per_exercise;

public class Caculation {

	public static void main(String[] args) {
		int a=2;		//声明int型变量a
		int b=5;		//声明int型变量b
		boolean result=((a>b)&&(a!=b));	//声明布尔型变量，用于保存应用逻辑运算符“&&”后的返回值
		boolean result2=((a>b)||(a!=b));//声明布尔型变量，用于保存应用逻辑运算符“||”后的返回值
		System.out.println(result);
		System.out.println(result2);
		
		boolean a1;
		if (20 < 45)
			a1 = true;
		//else
			//a1 = false;
			//此段代码在此JDK中会发出提示，为不可达代码		
		System.out.println(a1);
		
		byte mybyte=127;	//定义byte型变量，并把byte型变量允许的最大值赋给mybyte
		int myint=150;	    //定义int型变量，并赋值150
		float myfloat=452.12f;	//定义float型变量myfloat，并赋值
								//必须在数值后加F或f说明是float型的值
								//否则Java会识别为double型，从而报错
		char mychar=10;				//定义char型变量，并赋值
		double mydouble=45.46546;	//定义double型变量并赋值
		System.out.println("byte型与float型数据进行运算结果为："+(mybyte+myfloat));
		System.out.println("byte型与int型数据进行运算结果为："+(mybyte*myint));
		System.out.println("byte型与char型数据进行运算结果为："+(mybyte/mychar));
		System.out.println("double型与char型数据进行运算结果为："+(mydouble+mychar));
	}

}
