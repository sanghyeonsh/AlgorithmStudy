package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2164_김상현 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue queue = new LinkedList<>();
		for(int i=1;i<=N;i++) {
			queue.add(i);
		}
		if(queue.size()==1) {
			System.out.println(1);
		}
		else {
			while(true) {
				queue.poll();
				if(queue.size()==1) {
					System.out.println(queue.peek());
					break;
				}
				queue.add(queue.poll());
				if(queue.size()==1) {
					System.out.println(queue.peek());
					break;
				}
			}

		}
		
		
		
	}

}
