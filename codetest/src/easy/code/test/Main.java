package easy.code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		Stack<Character> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		char[] charList = input.toCharArray();

		for (int i = 0; i < charList.length; i++) {
			if (charList[i]-48 < 0 || charList[i]-48 > 9) {
				if (!stack.isEmpty() && stack.peek() == '(' && charList[i] == ')') {
					stack.pop();
					if (!scoreList.isEmpty()) {
						for (int j = 0; j < scoreList.size(); j++) {
							scoreList.set(j, scoreList.get(j)+ 1);
						}
					}
				} else if (!stack.isEmpty() && stack.peek() == '{' && charList[i] == '}') {
					stack.pop();
					if (!scoreList.isEmpty()) {
						for (int j = 0; j < scoreList.size(); j++) {
							scoreList.set(j, scoreList.get(j) + 2);
						}
					}
				} else if (!stack.isEmpty() && stack.peek() == '[' && charList[i] == ']') {
					stack.pop();
					if (!scoreList.isEmpty()) {
						for (int j = 0; j < scoreList.size(); j++) {
							scoreList.set(j, scoreList.get(j) + 3);
						}
					}
				} else {
					stack.push(charList[i]);
					if (stack.peek() == '(') {
						if (!scoreList.isEmpty()) {
							for (int j = 0; j < scoreList.size(); j++) {
								scoreList.set(j, scoreList.get(j) - 1);
							}
						}
					} else if (stack.peek() == '{') {
						if (!scoreList.isEmpty()) {
							for (int j = 0; j < scoreList.size(); j++) {
								scoreList.set(j, scoreList.get(j) - 2);
							}
						}

					} else if (stack.peek() == '[') {
						if (!scoreList.isEmpty()) {
							for (int j = 0; j < scoreList.size(); j++) {
								scoreList.set(j, scoreList.get(j) - 3);
							}
						}

					}
				}
			} else {
				scoreList.add(0);	
			}
		}
		
		System.out.println(Collections.max(scoreList));

	}
}