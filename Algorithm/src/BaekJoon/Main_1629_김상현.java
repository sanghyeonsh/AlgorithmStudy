package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1629_김상현 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long C = Integer.parseInt(st.nextToken());
		System.out.println(exp(A,B)%C);

		
		
	}
	public static long exp(long x, long n) {
		
		if(n==1) return x;
		
		long y = exp(x,n/2);
		return (n%2==0)? y*y:y*y*x;
	}


}
