package codingexercise;
/*import java.util.Scanner;
//这种十六进制转八进制的方法效率低
public class HexToOct {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String finalstr[]=new String[n];
		sc.nextLine();

		String str;
		String convstr="";
		String tempstr;
		
		char cur;
		int len;
		int sublen;
		for(int i=0;i<n;i++){
			str=sc.nextLine();
			len=str.length();
			for(int j=0;j<len;j++){
				cur=str.charAt(j);
				if(cur=='0'){
					convstr=convstr+"0000";
				}
				if(cur=='1'){
					convstr=convstr+"0001";
				}
				if(cur=='2'){
					convstr=convstr+"0010";
				}
				if(cur=='3'){
					convstr=convstr+"0011";
				}
				if(cur=='4'){
					convstr=convstr+"0100";
				}
				if(cur=='5'){
					convstr=convstr+"0101";
				}
				if(cur=='6'){
					convstr=convstr+"0110";
				}
				if(cur=='7'){
					convstr=convstr+"0111";
				}
				if(cur=='8'){
					convstr=convstr+"1000";
				}
				if(cur=='9'){
					convstr=convstr+"1001";
				}
				if(cur=='A'){
					convstr=convstr+"1010";
				}
				if(cur=='B'){
					convstr=convstr+"1011";
				}
				if(cur=='C'){
					convstr=convstr+"1100";
				}
				if(cur=='D'){
					convstr=convstr+"1101";
				}
				if(cur=='E'){
					convstr=convstr+"1110";
				}
				if(cur=='F'){
					convstr=convstr+"1111";
				}
			}
			
			sublen=convstr.length();
			int num=3-sublen%3;
			if(num!=0){
				for(int j=0;j<num;j++){
					convstr="0"+convstr;
				}
				
			}
			finalstr[i]="";
			tempstr=convstr.substring(0,3);
			while(tempstr.equals("000")){
				convstr=convstr.substring(3);
				tempstr=convstr.substring(0,3);
			}
			
			while(!convstr.equals("")){
				tempstr=convstr.substring(0,3);
				if(tempstr.equals("000")){
					str="0";
				}
				if(tempstr.equals("001")){
					str="1";
				}
				if(tempstr.equals("010")){
					str="2";
				}
				if(tempstr.equals("011")){
					str="3";
				}
				if(tempstr.equals("100")){
					str="4";
				}
				if(tempstr.equals("101")){
					str="5";
				}
				if(tempstr.equals("110")){
					str="6";
				}
				if(tempstr.equals("111")){
					str="7";
				}
				finalstr[i]=finalstr[i]+str;
				convstr=convstr.substring(3);
			}
		}
		for(String a:finalstr){
			System.out.println(a);
		}
	}
}*/

import java.io.*; 
class  HexToOct{
	public static void main(String[] args)throws NumberFormatException,IOException {
		BufferedReader buf = new BufferedReader(
				new InputStreamReader(System.in));
		int n = Integer.parseInt(buf.readLine());
		int l = 0,j=0,k=0,p=0;
		String m1="";
		String m2="";
		char arr[];
		String ss[] = new String[n];	//用于存储抓换的八进制数
		
		while ((n--)!=0){
			m1=buf.readLine();
			m2=hexToBinary(m1);			//存储转换的二进制数
			l=m2.length();				//存储二进制数的长度
			switch(l%3){				//将转换的二进制数每三位组合成一组，不足三位则补0
			case 1:m2="00"+m2;break;
			case 2:m2="0"+m2;break;
			default:break;
			}
			arr=new char [m2.length()/3];			//存储转换的八进制数
			//k<m2.length()-2保证每三位二进制数组成一组
			for ( k=0,j=0;k<m2.length()-2;k+=3){
				//3位二进制数---->1位八进制数
				char c=(char)((m2.charAt(k)-'0')*4+(m2.charAt(k+1)-'0')*2+(m2.charAt(k+2)-'0')+'0'); 	
				if (k==0&&c=='0'){					//如果从左向右数的第一组二进制转换为0，则直接进入下一次循环
					continue;
				}
				arr[j]=c;
				j++;
			}
			
			ss[p]=new String(arr).trim();
			p++;
		}
		
		for (int i=0;i<p;i++ ){
			System.out.println(ss[i]);
		}
	}
	
	//十六进制转二进制
	public static String hexToBinary(String hexNum){
		char[] chs = {'0','1'};
		String str = new String("0123456789ABCDEF");
		char[] charArray = hexNum.toCharArray();
		int pos = charArray.length*4;			
		char[] binaryArray = new char[pos];						//定义数组存储转换成的二进制数
		for (int i = charArray.length - 1; i >=0; i--) {		//将十六进制的每一位转换成4位二进制数
			int temp = str.indexOf(charArray[i]);				//以十六进制基数对应的字符在数组中的下标来表示其相应的10进制数
			for(int j=0;j<4;j++){
				binaryArray[--pos] = chs[temp & 1];	
				temp = temp >>> 1;					
			}
		}
		return new String(binaryArray);
	}
}

