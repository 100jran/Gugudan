package baekGugudan;

import java.util.Scanner;

public class Gugudan {

	public static int[] calculate(int times) {
		int[] result = new int[9];

		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}

	public static void print(int[] result) {
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("몇 단?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		for (int j = 1; j < 10; j++) {
			System.out.println(number + "X" + j + "=" + number * j);
		}
		scanner.close();
	}
}