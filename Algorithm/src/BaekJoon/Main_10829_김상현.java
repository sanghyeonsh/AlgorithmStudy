package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10829_김상현 {

	static StringBuilder sb;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		sb = new StringBuilder();
		dectobin(N);
		System.out.println(sb.reverse());
		
		
	}
	static long dectobin(long n) {
		long r = 0;
		if(n>=2) {
			r = n%2;
			sb.append(r);
			return dectobin(n/2);	
		}
		else {
			r = n%2;
			sb.append(r);
			return n;
		}
	}

}
