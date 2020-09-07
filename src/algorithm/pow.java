package algorithm;

public class pow {
	// Nが、0から10まで増える時、2のN乗を計算する。Math.powは使わない
	// 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024

	/*public static void main(String[] args) throws Exception {
		int number = 10;
		for (int i = 0; i <= number; i++) {
			System.out.println(i + ": " + power(i));
		}
	}

	// 2のnum乗を求める
	public static int power(int num) {
		int pow = 1;
		//  powの値を2倍する操作をnum回繰り返す
		for (int j = 0; j < num; j++) {
			pow *= 2;
		}
		return pow;
	}*/

	// 再帰を用いて作成
	/*public class Main {
	    public static void main(String[] args) throws Exception {
	        int number = 10;
	        for (int i = 0; i <= number; i++) {
	            System.out.println(i + ": " + power(i));
	        }
	    }
	    public static int power(int num) {
	        // 2の0乗は1
	        if (num == 0) {
	            return 1;
	        }
	        // 2の(num-1)乗に2を掛けた値を返す
	        return power(num - 1) * 2; // ここを修正
	    }
	}*/


	// 配列：Nが、0から10まで増える時、2のN乗を計算する。Math.powは使わない
	// 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024
	// ループを1つだけ用いて作成
	public static void main(String[] args) throws Exception {
		int number = 10;
		long[] pow = new long[number + 1];

		pow[0] = 1; // 2の0乗は1

		for (int i = 0; i <= number; i++) {
			if (i >= 1) {
				pow[i] = pow[i - 1] * 2; // 2の(i-1)乗から2のi乗の値を求める
			}
			System.out.println(i + ": " + pow[i]);
		}
	}
}
