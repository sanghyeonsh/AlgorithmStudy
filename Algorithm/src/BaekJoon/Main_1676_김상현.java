package BaekJoon;

import java.util.Scanner;

public class Main_1676_김상현 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		for(int i=1;i<=N;i++) {
			int cnt = 0;
			int num = i;
			while(num%5==0 && num!=0) {
				cnt++;
				num/=5;
			}
			ans+=cnt;
		}
		System.out.println(ans);
		
	}

}
