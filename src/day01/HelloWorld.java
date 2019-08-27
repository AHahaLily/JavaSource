package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// Java中的基本数据类型
		// 整数直接量默认为int类型，两整数相除默认进行整除，运算超出范围则会溢出

		long time = System.currentTimeMillis();
		System.out.println(time);
		// 获取从1970年到当前时间的毫秒数,可用于检测一段代码的运行时间
		// 从而帮助进行代码优化

		// double双精度浮点型(8字节，浮点型直接量默认为double
		// 浮点型数据进行运算时会出现舍入误差，因此需要精确运算时使用BigDecimal

		// Boolean型占用2个字节，只能取true和false俩个值

		// char型，字符直接量必须由一对单引号括起来

		// 基本数据类型的转换
		/*
		 * byte short int long float double boolean char
		 */
		/*
		 * 自动类型转换：从小到大，自动转换 强制类型转换（显示转换）：从大到小，强转可能会溢出或者造成精度损失
		 */
	}

}
