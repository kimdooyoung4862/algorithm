package com.bit.opcode;

import java.util.Scanner;

/*
고도 비만 : 35 이상
중등도 비만 (2단계 비만) : 30 - 35
경도 비만 (1단계 비만) : 25 - 30
과체중 : 23 - 24.9
정상 : 18.5 - 22.9
저체중 : 18.5 미만
이다.
 */
public class Bmi {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String res = "";
		int a = 0;
		System.out.println("인원수");
		a = s.nextInt();
		for(int i=0;i<a;i++) {
		String name = "", b = "";
		double hei = 0.0, wei = 0.0, bmi = 0.0;
		System.out.println("이름을 입력해주세요.");
		name = s.next();
		System.out.println("키를 입력");
		hei = s.nextDouble()/100;
		System.out.println("몸무게 입력");
		wei = s.nextDouble();
		bmi = wei/(hei * hei);
		
		if(18.5 > bmi) {
			b = "저체중";
		}else if(18.5 <= bmi && bmi < 22.9){
			b = "정상";
		}else if(23 <= bmi && bmi < 24.9) {
			b = "과체중";
		}else if(25 <= bmi && bmi < 30) {
			b = "경도 비만";
		}else if(30 <= bmi && bmi < 35) {
			b = "중등도 비만";
		}else if(35 < bmi){
			b = "고도비만";
		
		}
		res += String.format("\n이름: %s %s", name, b);
	}
		
		System.out.print(res);
		}
		
	}


