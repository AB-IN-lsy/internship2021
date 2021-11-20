package com.demo;

public class Demo1 {
	public double compare2num(double num1, double num2) {
		double max = num1;
		if (num2 > num1) {
			max = num2;
		}
		return max;
	}

	public double compare4num(double num1, double num2, double num3, double num4) {
		double x = this.compare2num(num1, num2);
		double y = this.compare2num(num3, num4);
		double max = this.compare2num(x, y);
		return max;
	}
}
