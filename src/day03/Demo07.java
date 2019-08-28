package day03;

public class Demo07 {

	public static void main(String[] args) {
		/*
		 * 练习：找出100以内所有的质数
		 * 质数：只能被1和自身整除的数
		 */
/*		int i,j;
		System.out.println("找出100以内的所有质数：");
		for(i=2;i<=100;i++){
			for(j=2;j<=i;j++){
				if(i%j==0){
					break;
				}
			}
			if(j==i||i==2){
				System.out.print(i+" ");
			}
		}*/
		
		/*
		 * 解决方法：借助Boolean类型的标记
		 */
		boolean flag;
		System.out.println("找出100以内的质数：");
		for(int i=2;i<=100;i++){
			flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.print(i+" ");
			}
		}
	}
}
