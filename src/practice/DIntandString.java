package practice;

import java.util.Scanner;

/* 整数の桁数（文字数）出力 */

public class DIntandString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		if (1 <= n && n <= 50) {
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				System.out.println(String.valueOf(a[i]).length());
			}
		}
		sc.close();

	}

}
