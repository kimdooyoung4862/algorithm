package com.bit.opcode;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = new String[10];
		arr[0] = "첫 번째 숫자 입력";
		arr[1] = "두 번째 숫자 입력";
		arr[2] = "사용할 사칙연산 기호를 선택하세요";
		arr[2] = "두 수의 뺄셈 = ";
		arr[2] = "사용할 사칙연산 기호를 선택하세요";
		arr[2] = "사용할 사칙연산 기호를 선택하세요";
		arr[2] = "사용할 사칙연산 기호를 선택하세요";
		arr[2] = "사용할 사칙연산 기호를 선택하세요";
		int a = 0, b = 0, c = 0;
		String cal;
		System.out.println(arr[0]);
		a = s.nextInt();
		System.out.println(arr[1]);
		b = s.nextInt();
		System.out.println(arr[2]);
		cal = s.next();

		switch (cal) {
		case "-":
			c = a - b;
			System.out.println("두 수의 뺄셈 = " + c);
			break;
		case "*":
			c = a * b;
			System.out.println("두 수의 곱셈 = " + c);
			break;
		case "+":
			c = a + b;
			System.out.println("두 수의 합 = " + c);
			break;
		case "/":
			c = a / b;
			System.out.println("두 수의 나눗셈 = " + c);
			break;
		default:
			System.out.println("사칙연산 기호가 아닙니다.");
		break;
		
		}

	}

}
