package com.bit.opcode;

import java.util.Scanner;

public class GradeReport {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = {
				"이름?\n","국어점수?\n","영어점수?\n","수학점수?\n",
				"A","B","C","D","F"
		};
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
			credit = arr[4];
			break;
		case 8:
			credit = arr[5];
			break;
		case 7:
			credit = arr[6];
			break;
		case 6:
			credit = arr[7];
			break;
		case 5:
			credit = arr[8];
			break;

		}
		System.out.printf("%s : [평균] %d [학점] %s ", name, avg, credit);

	}

}
