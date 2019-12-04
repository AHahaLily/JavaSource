package per_exercise;

public class Join {

	public static void main(String[] args) {
		String str1=new String("hello");	//声明String对象str1
		String str2=new String("world");	//声明string对象str2
		String str=str1+str2;				//将对象str1和str2连接后的结果赋给str
		System.out.println(str);
		
		//字符串拼接
		int booktime=4;			//声明int类型的变量booktime
		float practice=2.5f;	//声明float类型的变量practice
		//将字符串与整数、浮点型小数变量相连并将结果输出
		System.out.println("我每天花费"+booktime+"小时看书，"+practice+"小时上机练习");
	}

}
