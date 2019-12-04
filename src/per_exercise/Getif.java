package per_exercise;

public class Getif {

	public static void main(String[] args) {
		//if语句
		int x=45;
		int y=12;
		if(x>y) {		//判断x是否大于y
			System.out.println("变量x大于变量y");
		}
		if(x<y) {		//判断x是否小于y
			System.out.println("变量x小于变量y");
		}
		
		//if...else语句
		int math=95;		//声明int型局部变量
		int english=56;		//声明int型局部变量
		if(math>60) {
			//条件成立时执行
			System.out.println("数学及格了");
		}else {
			//条件不成立时执行
			System.out.println("数学没有及格");
		}
		if(english>60) {
			//条件成立时执行
			System.out.println("英语及格了");
		}else {
			//条件不成立时执行
			System.out.println("英语没有及格");
		}
		
		int xx = 45;
		if(xx % 2 == 0){
			System.out.println("xΪż˽");
		}
		else{
			System.out.println("xˇǦ˽");
		}
		
		//if...else if
		int x1=20;
		if(x1>30) {
			System.out.println("a的值大于30");
		}else if(x>10) {
			System.out.println("a的值大于10，但小于30");
		}else if(x>0) {
			System.out.println("a的值大于0，但小于10");
		}else {
			//当所有条件都不成立时执行
			System.out.println("a的值小于0");
		}
	}

}
