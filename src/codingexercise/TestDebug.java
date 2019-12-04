package codingexercise;

public class TestDebug {

	public static void main(String[] args){
		int count = 0;
		System.out.println(count++);
		System.out.println(++count);
		
		//try-catch异常处理
		try {
			int i=3/0;
			System.out.println(i);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(count--);
		System.out.println(count);
		
	}

}
