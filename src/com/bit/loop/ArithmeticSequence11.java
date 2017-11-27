package com.bit.loop;
/*
 Algorithm 11번 문제
 1-2+3-4+5-6...+99-100 의 합계
 */
public class ArithmeticSequence11 {
	public static void main(String[] args) {
		int r = 0;
		String t = "";
		for(int i=1;i<=100;i++) {
			if(i == 100) {
				t += i + "=";
				r -= i;
			}else if(i % 2 == 0) {
				t += i + "+";
				r -= i;
			}else {
				t += i + "-";
				r += i;
				}
			}
		System.out.println(t+r);
	}
}
