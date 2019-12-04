package per_exercise;

public class PackingClassTest {
	public static void main(String[] args) {
		//使用Integer封装类的parseInt()方法
		String str[]= {"89","12","10","18","35"};
		int sum=0;//定义int型变量用于保存结果
		int myint;//用于保存字符串转换得到的整数
		for(int i=0;i<str.length;i++) {
			myint=Integer.parseInt(str[i]);
			sum+=myint;
		}
		System.out.println("输出和为："+sum);
		System.out.println();
		
		//使用Integer封装类获取数字的不同表示形式
		String str1=Integer.toString(456);//获取数字的十进制表示
		String str2=Integer.toBinaryString(456);//获取数字的二进制表示
		String str3=Integer.toHexString(456);//获取数字的十六进制表示
		String str4=Integer.toOctalString(456);//获取数字的八进制表示
		System.out.println("456的十进制表示为："+str1);
		System.out.println("456的二进制表示为："+str2);
		System.out.println("456的十六进制表示为："+str3);
		System.out.println("456的八进制表示为："+str4);
		System.out.println();
		
		//获取Integer类的常量值
		int maxint=Integer.MAX_VALUE;
		int minint=Integer.MIN_VALUE;
		int intsize=Integer.SIZE;
		System.out.println("int类型能获取的最大值为："+maxint);
		System.out.println("int类型能获取的最小值为："+minint);
		System.out.println("int类型数据能使用的二进制位数："+intsize);
		System.out.println();
		
		//获取Integer类对象的值
		Integer inte=new Integer(452);
		int myint1=inte.intValue();
		System.out.println(myint1);
		System.out.println();
		
		//Boolean封装类
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean(false);
		System.out.println("b1:"+b1.booleanValue());
		System.out.println("b2:"+b2.booleanValue());
		System.out.println(); 
		
		Boolean bbb=new Boolean("ok");
		String strr=bbb.toString();
		System.out.println("ok:"+strr);
		bbb=new Boolean(true);
		strr=bbb.toString();
		System.out.println("true:"+strr);
		System.out.println();
		
		//Character封装类
		Character mychar1=new Character('A');
		Character mychar2=new Character('a');
		System.out.println(mychar1+"是大写字母吗？"+Character.isUpperCase(mychar1));
		System.out.println(mychar2+"是小写字母吗？"+Character.isLowerCase(mychar2));
		System.out.println();
		
		Character char1=new Character('h');
		Character char2=new Character('H');
		boolean b=char1.equals(char2);
		System.out.println(char1+"和"+char2+"相等吗？"+b);
		Character char3=Character.toLowerCase(char1);
		Character char4=Character.toLowerCase(char2);
		boolean bb=char3.equals(char4);
		System.out.println(char3+"和"+char4+"相等吗？"+bb);
		System.err.println();
		
		
	}
}
