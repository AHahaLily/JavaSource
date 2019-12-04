package codingexercise;

public class NarcissisticNumber {
	public static void main(String[] args) {
		//求水仙花数：水仙花数--水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。
		int num;
		int res;
		for(int i=1;i<=9;i++){
			for(int j=0;j<=9;j++){
				for(int k=0;k<=9;k++){
					num=100*i+10*j+k;
					res=(int)(Math.pow(i, 3)+Math.pow(j,3)+Math.pow(k, 3));
					if(num==res){
						System.out.println(num);
					}
				}
			}
		}
	}

}
