package cn.cloudyzcy;

public class TestMaxMinValue {

	public static void main(String[] args) {
		for (String temp : args) { // 输出args数组的值
			System.out.println(temp);
		}
		// byte的取值范围
		byte maxb = Byte.MAX_VALUE; // 127
		byte minb = Byte.MIN_VALUE; // -128
		System.out.println(maxb + " " + minb);

		// int的取值范围
		int maxi = Integer.MAX_VALUE; // 2147483647
		int mini = Integer.MIN_VALUE; // -2147483648
		System.out.println(maxi + " " + mini);

		// short的取值范围
		short maxs = Short.MAX_VALUE; // 32767
		short mins = Short.MIN_VALUE; // -32768
		System.out.println(maxs + " " + mins);

		// long的取值范围
		long maxl = Long.MAX_VALUE; // 9223372036854775807
		long minl = Long.MIN_VALUE; // -9223372036854775808
		System.out.println(maxl + " " + minl);

		// float的取值范围
		float maxf = Float.MAX_VALUE; // 3.4028235E38
		float minf = Float.MIN_VALUE; // 1.4E-45
		System.out.println(maxf + " " + minf);

		// double的取值范围
		double maxd = Double.MAX_VALUE; // 1.7976931348623157E308
		double mind = Double.MIN_VALUE; // 4.9E-324
		System.out.println(maxd + " " + mind);

	}

}
