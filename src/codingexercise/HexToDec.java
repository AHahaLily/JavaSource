package codingexercise;

import java.util.Scanner;
//十六进制数转十进制数
public class HexToDec {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String tr;
		long sum=0;
		if(str.length()<8){
			char ch[]=str.toCharArray();
			for(int i=ch.length-1;i>=0;i--){
				if(ch[i]=='A'){
					tr="10";
				}else if(ch[i]=='B'){
					tr="11";
				}else if(ch[i]=='C'){
					tr="12";
				}else if(ch[i]=='D'){
					tr="13";
				}else if(ch[i]=='E'){
					tr="14";
				}else if(ch[i]=='F'){
					tr="15";
				}else{
					tr=String.valueOf(ch[i]);
				}
				sum=sum+(int)Math.pow(16,i)*Integer.parseInt(tr);
			}
			System.out.println(sum);
		}
		sc.close();
	}

}

/* 
 * 这种十六进制转十进制的方法效率低
 import java.util.*;
 public class HexToDec {
      public static void main (String args[]){
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          char c[]=s.toCharArray();    //���ַ��������е��ַ�ת��Ϊһ���ַ�����
          int n=c.length;
          long sum=0;                    //long的取值范围-9223372036854775808~9223372036854775807
          for(int i=0;i<n;i++){
              if((int)c[i]-48>9){
                  if(c[i]=='A')
                      sum+=10*Math.pow(16,n-i-1);
                  else if(c[i]=='B')
                      sum+=11*Math.pow(16,n-i-1);
                  else if(c[i]=='C')
                      sum+=12*Math.pow(16,n-i-1);
                  else if(c[i]=='D')
                      sum+=13*Math.pow(16,n-i-1);
                  else if(c[i]=='E')
                      sum+=14*Math.pow(16,n-i-1);
                  else if(c[i]=='F')
                      sum+=15*Math.pow(16,n-i-1);
              }
              else{
                  sum+=((int)c[i]-48)*Math.pow(16,n-i-1);
              }
          }
          System.out.println(sum);
      }
  }*/
