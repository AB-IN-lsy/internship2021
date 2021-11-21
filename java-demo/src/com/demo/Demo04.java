package com.demo;

/*
 * 类名必须首字母大写！
 */

public class Demo04 {
	int num1, num2;

	public int foo1() {
		int max = num1;
		if (num2 > num1) {
			max = num2;
		}
		return max;
	}
}
