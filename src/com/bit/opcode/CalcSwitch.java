package com.bit.opcode;

import java.util.Scanner;

public class CalcSwitch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = {
				"첫 번째 숫자를 입력하세요.\n","연산기호를 입력하세요.\n","두 번째 숫자를 입력하세요.\n","%d %s %d = %d","사칙연사자만 입력 가능"
		};
		int num1 = 0, num2 = 0, result = 0;
		String opcode = "", test = "";
		boolean inputOk = true;
		System.out.print(arr[0]);
		num1 = s.nextInt();
		System.out.print(arr[1]);
		opcode = s.next();
		System.out.print(arr[2]);
		num2 = s.nextInt();

		switch (opcode) {
		case "+":
			result = num1 + num2;
			break;

		case "-":
			result = num1 - num2;
			break;

		case "*":
			result = num1 * num2;
			break;

		case "/":
			result = num1 / num2;
			break;

		case "%":
			result = num1 % num2;
			break;

		default:
			inputOk = false;
			break;
		}
		if (!inputOk) {
			test = arr[4];
		} else {
			test = String.format(arr[3] , num1, opcode, num2, result);
		}
		System.out.print(test);
	}

}
