package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1920_김상현 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<M;i++) {
			int num = Integer.parseInt(st.nextToken());
			System.out.println(bisearch(arr,0,N-1,num));
		}
	}
	static int bisearch(int[] arr, int start, int end,int key) {
		
		if(start>end) return 0;
		else {
			int mid = (start+end)/2;
			if(arr[mid]==key) {
				return 1;
			}
			else if(arr[mid]<key){
				start = mid+1;
				return bisearch(arr, start, end, key);
			}
			else {
				end = mid-1;
				return bisearch(arr, start, end, key);
			}
		}
	}
}
