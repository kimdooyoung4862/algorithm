package com.bit.loop;
public class ArithmeticSequence12 {
	public static void main(String[] args) {
		int r = 0;
		String t = "";
		for(int i=1;i<=100;i++) {
			if(i % 2 == 0) {
				if(i == 100) {
					t += i + "=";
					r -= i;
				}else {
					t += i + "-";
					r += i;
				}
				
				
				}
			}
		System.out.println(t+r);
	}
}

