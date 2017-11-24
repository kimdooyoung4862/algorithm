package com.bit.opcode;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[5];
		arr[0]="+";
		arr[1]="-";
		arr[2]="*";
		arr[3]="/";
		arr[4]="%";
		int num1 = 0, num2 = 0, result = 0;
		String opcode = "";
		System.out.println("\t첫 번째 숫자를 입력하세요.\n");
		num1 = scan.nextInt();
		System.out.println("\t두 번째 숫자를 입력하세요.\n");
		num2 = scan.nextInt();
		System.out.println("\t연산자를 입력해주세요\n");
		opcode = scan.next();
		if (opcode.equals(arr[0])) {
			result = num1 + num2;

		} else if (opcode.equals(arr[1])) {
			result = num1 - num2;

		} else if (opcode.equals(arr[2])) {
			result = num1 * num2;

		} else if (opcode.equals(arr[3])) {
			result = num1 / num2;

		} else if (opcode.equals(arr[4])) {
			result = num1 % num2;

		} else {
			System.out.println("사칙연산 기호를 입력하세요.");
			return;
		}
		
		System.out.printf("%d %s %d = %d",
				num1, opcode, num2, result);
	}

}
