package per_exercise;

public class TestMain {

	public static void main(String[] args) {
		//Run As--->Run Configurations--->Arguments
		//--->Program Arguments--->文本框中输入参数--->Apply--->Run
		int length=args.length;
		if(length==0) {
			System.out.println("无参数运行");
		}else {
			for(int i=0;i<args.length;i++) {
				System.out.println(args[i]);
			}
		}
	}

}
