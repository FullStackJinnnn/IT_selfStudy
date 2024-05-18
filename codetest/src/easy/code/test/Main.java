package easy.code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		PriorityQueue<Integer> pQ = new PriorityQueue<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for (int i = 0; i < cnt; i++) {
			int num = Integer.parseInt(br.readLine());
			if (num != 0) {
				pQ.add(num);
			} else {
				if (pQ.size() == 0) {
					System.out.println(0);
				} else {
					System.out.println(pQ.poll());  
				}
			}

		}
	}
}