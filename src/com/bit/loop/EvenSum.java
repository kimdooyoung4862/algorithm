package com.bit.loop;

public class EvenSum {
	public static void main(String[] args) {
		String t = "";
		int r = 0;
		for(int i=1;i<=100;i++){
			if(i % 2 == 0) {
				if(i == 100) {
				t += i + "=";
				}else {
				t += i + "+";
				}
				r+=i;
			}
			
		}
		System.out.println(t+r);
	}

}



