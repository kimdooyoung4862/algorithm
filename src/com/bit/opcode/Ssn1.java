package com.bit.opcode;

import java.util.Scanner;

public class Ssn1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "", ssn = "", gender = "", res = "";
		boolean inputok = true;
		System.out.print("이름 입력\n");
		name = s.next();
		System.out.print("주민번호 입력\n");
		ssn = s.next();
		char ch = ssn.charAt(7);
		
		switch(ch) {
		case '1' : case '3' : gender = "남자";
		break;
		
		case '2' : case '4' : gender = "여자";
		break;
		
		case '5' : case '6' : gender = "외국인";
		break;
		
		default : 
			inputok = false;
		break;
		}
		if (!inputok) {
			res = "다시입력";
		}
		else {
			res = String.format("\n[이름] %s [주민번호] %s [성별] %s", name, ssn, gender);
			
		}
			System.out.println(res);
	}

}
