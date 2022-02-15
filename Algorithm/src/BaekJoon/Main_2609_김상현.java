package BaekJoon;

import java.util.Scanner;

public class Main_2609_김상현 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int gcd = 1;
		int lcm = 1;
		for(int i=1;i<=Math.min(A, B);i++) {
			if(A%i==0 && B%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
		System.out.println(A*B/gcd);
		
		
		
	}

}
