package day04;

public class Demo05 {
	public static char[] getFiveChar(){
		char []arr=new char[26];		//用于存储26个字母的字符
		boolean list[]=new boolean[26]; //用于表示相应的字母是否被选取
		for(int i=0;i<arr.length;i++){
			arr[i]=(char) ('A'+i);
		}
		int index;                      //存放新生成的位置值
		int num[]=new int[5];			//存放随机生成的5个字符在arr种的position
		for(int i=0;i<5;i++){
			index=(int)(Math.random()*26);
			while(list[index]==true){	//判断新生成的位置对应的字母是否被选过，如果是则重新生成一个位置
				index=(int)(Math.random()*26);
			}
			//该字母未被选过，则选中该字母，并将其对应的boolean值改为true
			num[i]=index;
			list[index]=true;
		}
		char res[]=new char[5];		   //存放生成的5个字符
		for(int i=0;i<5;i++){
			res[i]=arr[num[i]];
		}
		return res;
	}

	public static void main(String[] args) {
		/*
		 * 随机生成5个不重复的字母字符
		 */
		System.out.println(String.valueOf(getFiveChar()));
	}

}
