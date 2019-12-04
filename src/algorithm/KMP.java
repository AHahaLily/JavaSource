package algorithm;

import java.util.Scanner;

public class KMP {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// 主串:幼稚字符串匹配需要用到主串进行比较，而KMP算法只需要操作模式串
		String mstr = sc.nextLine();
		char mch[] = mstr.toCharArray();

		// 模式串
		String mostr = sc.nextLine();
		char moch[] = mostr.toCharArray();

/*		// 幼稚模式串匹配算法:每当发生不匹配，便需要发生指针回溯
		int i = 0; // 指向主串中的字符
		int j = 0; // 指向模式串中的字符 int
		int index = 0; // 记录匹配位置
		while (i < mch.length && j < moch.length) {
			if (j == 0) {
				index = i;
			}
			if (mch[i] == moch[j]) {
				i++;
				j++;
			} else {
				i = index + 1;
				j = 0;
			}
		}
		int len1 = mstr.substring(index).length();
		int len2 = mostr.length();
		System.out.println(len1 + " " + len2);
		if (len1 >= len2) {
			System.out.println("子串的第一个字符串的匹配位置：" + index);
		} else {
			System.out.println("主串与模式串不匹配");
		}*/

		// KMP算法：快速的从一个字符串中找到和模式串匹配的子串；仅仅后移模式串，比较指针不回溯
		int next[] = new int[moch.length];  
		String leftstr; // 存储前缀
		String rigstr; 	// 存储后缀
		int len; 		// 存储公共前后缀长度

		// 假设模式串索引位置为i的字符发生不匹配，则在其之前的匹配子串中寻找最长公共前后缀，求next数组
		for (int i = 0; i < moch.length; i++) {
			leftstr = "";
			rigstr = "";
			len = i - 1;
			while (len > 0) {
				leftstr = mostr.substring(0, len);
				rigstr = mostr.substring(i - len, i);
				if (leftstr.equals(rigstr)) {
					break;
				}
				len--;
			}
			next[i] = len;
		}
		System.out.println("求得的next数组：");
		for (int a : next) {
			System.out.print(a + " ");
		}
		System.out.println();

		// 利用next数组进行匹配
		int i = 0; // 指向主串中字符
		int j = 0; // 指向模式串中字符
		while (i < mch.length && j < moch.length) {
			if (mch[i] == moch[j]) {
				// 主串和模式串当前字符匹配，指针分别后移
				i++;
				j++;
			} else {
				j = next[j];
				// 当主串和模式串发生不匹配时，设置模式串指针j=next[j];
			}
			if (j == -1) {
				// 若模式串的第一个字符便和主串当前字符不匹配，主串指针后移,模式串指针移到开头
				i = i + 1;
				j = 0;
			}
		}
		if (j >= moch.length) {
			//主串和模式串匹配，输出匹配子串的开始索引位置
			System.out.println("匹配的子串在主串中的起始位置："+(i - j));
		} else {
			//主串和模式串不匹配
			System.out.println(-1);
		}
		sc.close();
	}
}
