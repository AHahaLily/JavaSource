package per_exercise;

public class Practice {

	public static void main(String[] args) {
		long mylong=45789;		
		byte mybyte=123;
		short myshort=32564;
		int myint1=(int)mylong;				//高精度转低精度
		int myint2=(int)myshort;			//低精度转高精度
		int myint3=(int)mybyte;
		System.out.println(myint1);
		System.out.println(myint2);
		System.out.println(myint3);

	}

}
