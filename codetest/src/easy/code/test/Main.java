package easy.code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int temp = Integer.parseInt(br.readLine());

		int[] arr = new int[1000002];
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 2;
		arr[5] = 3;
		arr[6] = 2;
		arr[7] = 3;
		arr[8] = 3;
		arr[9] = 2;

		for (int i = 10; i <= 1000000; i++) {
			int cnt = 0;
			
			if (i % 3 == 0 && i % 2 == 0)  {
				cnt = arr[i/3] >= arr[i/2] ? arr[i/2]+1 : arr[i/3] +1;
			}
			else if (i % 3 == 0) {
				cnt = arr[i-1] >= arr[i/3] ? arr[i/3]+1 : arr[i-1]+1;
			} else if (i % 2 == 0) {
				cnt = arr[i - 1] >= arr[i / 2] ? arr[i/2]+1 : arr[i-1]+1;
			}  else {
				cnt = arr[i -1]+1 ;
			}
			arr[i] = cnt;
		}
		sb.append(arr[temp]);
		System.out.println(sb);

	}
}
