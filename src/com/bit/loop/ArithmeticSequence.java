package com.bit.loop;
/*
 Algorithm 10번 문제
  1+2+3+4+...+100 의 합계
 */
public class ArithmeticSequence {
	public static void main(String[] args) {
		// 1 + 2 + 3 ... + 10
		String t = "";
		int r = 0;
		for(int i=1;i<=100;i++) {
			if(i == 100) {
				t += i + "=";
			}else {
				t += i + "+";
			}
			r+=i;
		}
		System.out.print(t+r);
	}

}
