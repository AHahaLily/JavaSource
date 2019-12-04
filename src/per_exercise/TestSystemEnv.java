package per_exercise;   //包名（包路径）

//导包
import java.util.Date;
import org.junit.Test;

public class TestSystemEnv {
	// java功能非常强大，可以获取一些系统级别的环境变量
	@Test      //获取jdk环境变量
	public void JavaInfo() {
		System.out.println("==java信息==");
		System.out.println("java的版本号："+System.getProperty("java.version"));
		System.out.println("java的所在目录："+System.getProperty("java.home"));
	}
	
	@Test     //获取用户信息
	public void userInfo() {
		System.out.println("==用户信息==");
		System.out.println("所属的登录用户："+System.getProperty("user.name"));
		System.out.println("默认存储文件路径："+System.getProperty("user.dir"));
	}
	
	@Test    //获取时间
	public void dateTimeInfo() {
		System.out.println("==时间信息==");
		System.out.println("当前毫秒数："+System.currentTimeMillis());
		System.out.println("当前纳秒数："+System.nanoTime());
		System.out.println("当前日期："+new Date(0));
	}
}
