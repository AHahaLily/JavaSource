package per_exercise;

public class Compound {

	public static void main(String[] args) {
		int x=20;
		System.out.println(x);
		{
			int y=40;
			System.out.println(y);
			int z=245;
			boolean b;
			{
				b=y>z;
				System.out.println(b);	//复合语句
			}
			System.out.println(b);	//b已经在复合语句中成功赋值
		}
		String word="hello java";
		System.out.println(word);
	}

}
