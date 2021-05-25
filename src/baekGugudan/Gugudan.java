package baekGugudan;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 4단
		int result = 4 * 1;
		System.out.println(result);
		result = 4 * 2;
		System.out.println(result);
		result = 4 * 3;
		System.out.println(result);
		result = 4 * 4;
		System.out.println(result);
		result = 4 * 5;
		System.out.println(result);
		result = 4 * 6;
		System.out.println(result);
		result = 4 * 7;
		System.out.println(result);
		result = 4 * 8;
		System.out.println(result);
		result = 4 * 9;
		System.out.println(result);

		// 5단
		System.out.println("원하는 구구단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println(number * 1);
		System.out.println(number * 2);
		System.out.println(number * 3);
		System.out.println(number * 4);
		System.out.println(number * 5);
		System.out.println(number * 6);
		System.out.println(number * 7);
		System.out.println(number * 8);
		System.out.println(number * 9);
		
		scanner.close();
	}
}
