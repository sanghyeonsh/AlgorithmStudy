package BaekJoon;

import java.util.Scanner;

public class Main_10163_κΉμν {

	static int N;
	static int[][] arr;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		arr = new int[101][101];
		for(int i=1;i<=N;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			for(int j=a;j<a+c;j++) {
				for(int k=b;k<b+d;k++) {
					arr[j][k]=i;
				}
			}
		}
		
		for(int i=1;i<=N;i++) {
			int sum = 0;
			for(int j=0;j<101;j++) {
				for(int k=0;k<101;k++) {
					if(arr[j][k]==i) {
						sum++;
					}
				}
			}
			System.out.println(sum);
		}
		
		
		
	}

}
