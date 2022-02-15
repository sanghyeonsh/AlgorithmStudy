package BaekJoon;

import java.util.Scanner;

public class Main_1436_김상현 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		int num = 0;
		while(cnt!=N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		System.out.println(num);
		
		
		
	}

}
