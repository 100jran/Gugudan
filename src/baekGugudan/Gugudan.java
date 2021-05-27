package baekGugudan;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		System.out.println("입력하세요. " + "a,b");
		
		Scanner scanner = new Scanner(System.in);
		
		String inputValue = scanner.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		System.out.println(first + "단까지 " + second + "만큼 곱하겠습니다!");
		
		for(int i = 2; i <= first; i++) {
			for (int j = 1; j <= second; j++) {
				System.out.println(i + "X" + j + "=" + i * j);
			}
		}
		scanner.close();
	}
}