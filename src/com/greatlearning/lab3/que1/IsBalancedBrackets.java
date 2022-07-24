package com.greatlearning.lab3.que1;

import java.util.Scanner;
import java.util.Stack;

public class IsBalancedBrackets {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter String to verify if it is balanced bracket or not...");

		String input = scan.next();

		isBalancedBracket(input);

		scan.close();

	}

	public static void isBalancedBracket(String input) {
		char[] arr = input.toCharArray();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (stack.isEmpty()) {
				stack.push(ch);
			} else {
				char top = stack.peek();
				if (ch == ')' || ch == '}' || ch == ']') {
					if (ch == ')' && top == '(') {
						stack.pop();
					} else if (ch == '}' && top == '{') {
						stack.pop();
					} else if (ch == ']' && top == '[') {
						stack.pop();
					}
				} else {
					stack.push(ch);
				}
			}
		}

		if (stack.isEmpty()) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
