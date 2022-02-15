package BaekJoon;

import java.util.Scanner;

public class Main_2839_김상현 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N==4 || N==7) System.out.println(-1);
		else if(N%5==0) System.out.println(N/5);
		else if(N%5==1) System.out.println((N-6)/5+2);
		else if(N%5==2) System.out.println((N-12)/5+4);
		else if(N%5==3) System.out.println((N-3)/5+1);
		else System.out.println((N-9)/5+3);
	
	}

}


