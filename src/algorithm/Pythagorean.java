package algorithm;

public class Pythagorean {

	//ピタゴラスの定理
	/* 直角三角形の斜辺の長さを求める。
	 * 残りの2辺は、aとbとし、a = 3、bは１から10まで増える。
	 * ピタゴラスの定理では、直角三角形の斜辺の長さは、次の式で求める。
	 * (斜辺の長さ) = √(a2乗 + b2乗)
	 */
	public static void main(String[] args) throws Exception {
		int number = 10;
		for (int i = 1; i <= number; i++) {
			System.out.println(i + ": " + pythagorean(3, i));
		}
	}

	public static double pythagorean(int a, int b) {
		// sqrt(a^2 + b^2)
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // ここに計算式を記述する
	}

}
