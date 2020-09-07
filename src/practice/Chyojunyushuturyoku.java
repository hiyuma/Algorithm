package practice;

import java.util.Scanner;

/*
毎年 5 月 1 日に、自分が運営している会社の社員一覧表を作成しています。表は年度ごとに更新され、社員の名前と年齢が載っています。
ところで、会社のメンバーは昨年度から全く変わらず、社員の誕生日は全員 7 月 7 日だったので、前年度の一覧表の年齢欄をそれぞれ +1 するだけで今年度の表が作れることにパイザ君は気づきました。

昨年度の一覧表が与えられるので、今年度の一覧表を出力してください。
*/

/*入力例
3
Tanaka 18
Sato 50
Suzuki 120

出力例2
Tanaka 19
Sato 51
Suzuki 121
*/

public class Chyojunyushuturyoku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		int[] a = new int[n];

		if (1 <= n && n <= 50) {
			for (int i = 0; i < n; i++) {
				s[i] = sc.next();
				a[i] = sc.nextInt();
			}
			for (int j = 0; j < n; j++) {
				System.out.print(s[j]+" ");
				System.out.println(a[j]+1);
			}
		}
		sc.close();

	}

}
