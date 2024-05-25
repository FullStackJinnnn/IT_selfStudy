package easy.code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		

		int[][] arr = new int[30][30];
		for (int i = 0; i < 30; i++) {
			arr[0][i] = i + 1;
		}
		for (int i = 1; i < 30; i++) {
			for (int j = 0; j < 30; j++) {
				if (j <= i) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i][j - 1] + arr[i - 1][j - 1];
				}
			}
		}
		
		
		int T = Integer.parseInt(br.readLine());
		int[] ans = new int[2];
		for (int a = 0; a < T; a++) {
			String[] temp = br.readLine().split(" ");

		for (int i = 0; i < 2; i++) {
			ans[i] = Integer.parseInt(temp[i]);
		}

			System.out.println(arr[ans[0] - 1][ans[1] - 1] + " ");

		}
	}
}