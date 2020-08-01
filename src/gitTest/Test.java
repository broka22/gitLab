package gitTest;

import java.util.Scanner;

public class Test {
	public void reverse(int n) {
		int num = 0;
		while (n > 0) {
			num = num * 10 + n % 10;
			n = n / 10;
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		Test obj = new Test();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to be reversed:");
		int n = input.nextInt();
		obj.reverse(n);
	}
}
