package com.ibm.stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();  //LIFO
		stack.add("2");
		stack.add("1");
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}
