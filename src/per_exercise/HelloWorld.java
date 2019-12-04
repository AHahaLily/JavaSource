package per_exercise;   //包名（包路径）

//导包
import java.util.Date;  //工具类
import org.junit.Test;  //工具类，单元测试JUnit

public class HelloWorld {
	/*
	 * public 修饰符
	 * class 类，java代码都在类中
	 * HelloWorld 类名，按驼峰规则命名
	 * { } 表示一个范围（代码块，出了范围则方法结束，{}内部的是方法体
	 * static 静态，修饰方法的修饰符
	 * void 表示方法（函数）没有返回值
	 * main 主方法，唯一
	 * String 字符串类型（单个）
	 * String[ ] 字符串数组（一堆），main方法的参数类型
	 * System.out.ptintln()  把字符串输出到控制台
	 */
	public static void main(String[] args) {
		// 更加标准的换行方法
		System.out.println(System.lineSeparator());
		
		//换行\n或\r\n，操作系统回车符号
		System.out.println("Hello world!");
		
	}
	
	@Test       //打印用户信息
	public void userInfo() {
		System.out.println("当前用户名称："+System.getProperty("user.name"));
		System.out.println("当前用户工作路径："+System.getProperty("user.dir"));
		
	}
	
	@Test     //打印jdk环境信息（打印系统环境值）
	public void envInfo() {
		System.out.println("java的版本号："+System.getProperty("java.version"));
		System.out.println("java所在目录："+System.getProperty("java.home"));
	}
	
	@Test    //打印时间相关参数
	public void timeInfo() {
		System.out.println("当前的毫秒数："+System.currentTimeMillis());
		System.out.println("当前的纳秒数："+System.nanoTime());
		
		//获取系统当前时间
		System.out.println("系统当前时间："+new Date());
		
	}
}
