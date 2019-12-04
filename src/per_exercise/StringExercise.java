package per_exercise;

import java.util.Date;

public class StringExercise {

	public static void main(String[] args) {
		// 定义字符串str
		String str="We are students";
		//将空格在str中的索引位置赋给变量size
		int size=str.indexOf(" ");
		//获得字符串的长度
		int len=str.length();
		System.out.println("字符串str中的出现的第一个空格的索引位置为:"+size+",字符串str的长度为："+len);
		
		//获取指定索引位置的字符
		char ch=str.charAt(8);
		System.out.println("字符串str索引位置8的字符为："+ch);

		//截取字符串
		String substr=str.substring(0, 8);
		System.out.println(substr);
		
		//去除字符串前导和尾部的空格
		String str1="   we are the world !    ";
		int len1=str1.length();//去除空格前字符串的长度
		String deleteSpaceStr=str1.trim();//去除字符串中的空格
		int len2=deleteSpaceStr.length();//去除空格后字符串的长度
		System.out.println("去除空格前的字符串:"+str1+"，其长度为:"+len1+";去除空格后的字符串："+deleteSpaceStr+"，其长度为:"+len2);
		
		
		//字符串中字符的替换
		String str2="address";
		String newstr2=str2.replace("a","A");//将字符串str2中的a替换为A
		System.out.println("替换后的字符串为："+newstr2);
		
		//判断字符串的开头和结尾
		String num1="22045612";
		String num2="21304578";
		boolean b1=num1.startsWith("22");
		boolean b2=num1.endsWith("78");
		boolean b3=num2.startsWith("22");
		boolean b4=num2.endsWith("78");
		System.out.println("字符串num1是以'22'开头的吗？"+b1);
		System.out.println("字符串num1是以'78'结尾的吗？"+b2);
		System.out.println("字符串num2是以'22'开头的吗？"+b3);
		System.out.println("字符串num2是以'78'结尾的吗？"+b4);
		
		//比较字符串是否相等
		String s1=new String("abc");
		String s2=new String("ABC");
		boolean b5=s1.equals(s2);//使用equals方法比较字符串s1和s2是否相等
		boolean b6=s1.equalsIgnoreCase(s2);//使用equalsIgnoreCase方法比较字符串是否相等
		System.out.println(s1+" equals "+s2+"?"+b5);
		System.out.println(s1+" equalsIgnoreCase "+s2+"?"+b6);
		
		//字符串比较
		String str3=new String("b");
		String str4=new String("a");
		String str5=new String("c");
		System.out.println(str3+"compareTo"+str4+"结果为："+str3.compareTo(str4));
		System.out.println(str3+"compareTo"+str5+"结果为："+str3.compareTo(str5));
		
		//字符串大小写转换
		String str6=new String("abc DEF");
		String newLowStr=str6.toLowerCase();//字符串字符转为小写
		String newUpperStr=str6.toUpperCase();//字符串字符转为大写
		System.out.println("字符串"+str6+"转换为大写后结果为："+newUpperStr+",转换为小写后的结果为："+newLowStr);
		
		//字符串分割
		String str7="192.168.0.1";
		String[] firstArr=str7.split("\\.");//按照"."分割字符串
		String[] secondArr=str7.split("\\.",2);//按照"."分割字符串两次
		System.out.println("原来的字符串："+str7);
		System.out.println("字符串全部分割的结果:");
		for(String x:firstArr) {
			System.out.print("["+x+"] ");
		}
		System.out.println();
		System.out.println("字符串分割两次的结果：");
		for(String x:secondArr) {
			System.out.print("["+x+"] ");
		}
		System.out.println();
		
		//日期格式化
		Date date=new Date();//创建Date对象
		String year=String.format("%tY", date);
		String month=String.format("%tB", date);//自带单位“月”
		String day=String.format("%td", date);
		String hour=String.format("%tH", date);
		String minute=String.format("%tM", date);
		String second=String.format("%tS", date);
		String time=String.format("%tc", date);
		String form=String.format("%tF", date);
		System.out.println("今年是："+year+"年"+month+day+"日"+hour+"时"+minute+"分"+second+"秒");
		System.out.println("全部的时间信息："+time);
		System.out.println("年-月-日格式的时间："+form);
		
		//字符串格式化
		String s3=String.format("%d", 400/2);//将结果以十进制格式保存
		String s4=String.format("%b", 3>5);//将结果以布尔形式显示
		String s5=String.format("%x", 200);//将结果以16进制形式显示
		System.out.println("格式化的结果："+s3+" "+s4+" "+s5);
		
		//定义要匹配E_mail地址的正则表达式
		String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String mailstr="aaa@";
		String mailstr1="aaaaa";
		String mailstr2="111@11ffyu.dfg.com";
		if(mailstr.matches(regex)) {//matches方法判断字符串是否与正则表达式匹配
			System.out.println(mailstr+"是一个合法的E_mail地址格式");
		}
		if(mailstr1.matches(regex)) {
			System.out.println(mailstr1+"是一个合法的E_mail地址格式");
		}
		if(mailstr2.matches(regex)) {
			System.out.println(mailstr2+"是一个合法的E_mail地址格式");
		}
		
		//比较String和StringBuilder的用时长短
		String ss="";//创建空的字符串
		long startTime=System.currentTimeMillis();//定义变量用于保存对字符串执行操作的起始时间
		for(int i=0;i<10000;i++) {
			ss=ss+i;//循环追加字符串
		}
		long endTime=System.currentTimeMillis();//定义变量用于保存对字符串执行操作的结束时间
		long useTime=endTime-startTime;//操作使用的时间
		System.out.println("使用String消耗的时间："+useTime);
		
		StringBuilder builder=new StringBuilder("");//创建字符串生成器
		long stTime=System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			builder.append(i);//循环追加字符串
		}
		long edTime=System.currentTimeMillis();
		long usTime=edTime-stTime;
		System.out.println("使用StringBuilder消耗的时间："+usTime);
		
		//用正则表达式验证手机号格式
		String regex1="1[35]\\d{9}";
		String text="15000000000";
		if(text.matches(regex1)) {
			System.out.println(text+"是一个合法的手机号");
		}
		
		//利用StringBuilder追加字符串并使用其toString()方法输出
		StringBuilder bl=new StringBuilder("");
		for(int i=1;i<=10;i++) {
			bl.append(i);
		}
		System.out.println(bl.toString());//StringBuilder的toString()方法
	}

}
