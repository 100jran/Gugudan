package baekGugudan;

public class Gugudan {

	public static int[] calculate(int times) {

		int[] result = new int[9];

		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}

	public static void main(String[] args) {

		int[] times5 = calculate(5);

		for (int i = 0; i < times5.length; i++) {
			System.out.println(times5[i]);
		}
	}
}
