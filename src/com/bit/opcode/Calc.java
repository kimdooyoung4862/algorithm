package com.bit.opcode;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] arr = {
				"+","-","*","/","%",
				"첫번째 숫자를 입력하세요.",
				"두번째 숫자를 입력하세요.",
				"더하기는 +, 빼기는 -, 곱하기는 *, 나누기(몫)은/, 나누기(나머지)는 % 입력하세요."
		};
		int num1 = 0, num2 = 0, result = 0;
		String opcode = "";
		System.out.print(arr[5]);
		num1 = s.nextInt();
		System.out.print(arr[6]);
		num2 = s.nextInt();
		System.out.print(arr[7]);
		opcode = s.next();
		if(opcode.equals(arr[0])) {
			result = num1 + num2;
		}else if(opcode.equals(arr[1])) {
			result = num1 - num2;
		}else if(opcode.equals(arr[2])) {
			result = num1 * num2;
		}else if(opcode.equals(arr[3])) {
			result = num1 / num2;
		}else if(opcode.equals(arr[4])) {
			result = num1 % num2;
		}
	}

}
