package com.bit.opcode;

import java.util.Scanner;

public class GradeReport {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[4];
		arr[0] = "이름?\n";
		arr[1] = "국어점수?\n";
		arr[2] = "영어점수?\n";
		arr[3] = "수학점수?\n";
		String name = "", credit = "";
		int kor = 0, eng = 0, mat = 0, avg = 0;
		System.out.print(arr[0]);
		name = scan.next();
		System.out.print(arr[1]);
		kor = scan.nextInt();
		System.out.print(arr[2]);
		eng = scan.nextInt();
		System.out.print(arr[3]);
		mat = scan.nextInt();
		avg = (kor + eng + mat) / 3;

		switch (avg / 10) {
		case 9:
			credit = "A";
			break;
		case 8:
			credit = "B";
			break;
		case 7:
			credit = "C";
			break;
		case 6:
			credit = "D";
			break;
		case 5:
			credit = "F";
			break;

		}
		System.out.printf("%s : [평균] %d [학점] %s ", name, avg, credit);

	}

}
