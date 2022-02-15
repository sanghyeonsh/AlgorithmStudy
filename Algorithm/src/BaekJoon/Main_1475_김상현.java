package BaekJoon;

import java.util.Scanner;

public class Main_1475_김상현 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int max = 0;
		int[] cnt = new int[10];
		for(int i=0;i<str.length();i++) {
			cnt[str.charAt(i)-'0']++;
		}
		cnt[6]+=cnt[9];
		if(cnt[6]%2==0) cnt[6]/=2;
		else cnt[6]=cnt[6]/2+1;
		for(int i=0;i<9;i++) {
			max = Math.max(max, cnt[i]);
		}
		System.out.println(max);
		
		
	}

}
