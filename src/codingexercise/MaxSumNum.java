package codingexercise;

public class MaxSumNum {

	//求使得和不大于5050的数当中最大的那一个
	public static void max(){
		int i=1;
        int sum=0;
		int n=5050;
        for(i=1;sum<=n;i++){	
            sum+=i;
        }
        i--;
        System.out.println(i+"");
	}
	
	public static void main(String[] args) {
		max();
	}

}
