package day03;

public class Demo10 {

	public static void main(String[] args) {
		/*
		 *¡∑œ∞£∫º∆À„9+99+999+9999+99999+999999
		 */
		int sum=0;
		int temp=0;
		for(int i=1;i<=6;i++){
			temp=temp*10+9;
			System.out.println(temp);
			sum=sum+temp*10+9;
		}
		System.out.println("Ω·π˚£∫"+sum);
	}
}
