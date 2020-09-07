package algorithm;

public class TribonacchiNumber {
	//トリボナッチ数
	/*
	 * T(0) = 0
	 * T(1) = 0
	 * T(2) = 1
	 * T(n) = T(n - 1) + T(n - 2) + T(n - 3)
	 */

	// 0, 0, 1, 1, 2, 4, 7, 13, 24, 44, 81, 149
	/*public static void main(String[] args) throws Exception {
		int number = 50;
		for (int i = 0; i <= number; i++) {
			System.out.println(i + ": " + tribonacci(i));
		}
	}

	// 指定番目のトリボナッチ数を求める
	public static long tribonacci(int num) {
		if (num == 0) { // numが0ならば0を返す
			return 0;
		}
		if (num == 1) { // numが1ならば0を返す
			return 0;
		}
		if (num == 2) { // numが2ならば1を返す
			return 1;
		}

		long tri = 0; // 答えを保存する変数
		long tri_0 = 0; // 三つ前のトリボナッチ数を保存する変数
		long tri_1 = 0; // 二つ前のトリボナッチ数を保存する変数
		long tri_2 = 1; // 一つ前のトリボナッチ数を保存する変数

		for (int i = 3; i <= num; i++) {
			tri = tri_0 + tri_1 + tri_2; // i番目のトリボナッチ数を計算する
			tri_0 = tri_1;
			tri_1 = tri_2;
			tri_2 = tri;
		}
		return tri;
	}*/

	// 再帰を用いて作成
	/*public class Main {
	  public static void main(String[] args) throws Exception {
	    int number = 30;
	    for (int i = 0; i <= number; i++) {
	      System.out.println(i + ": " + tribonacci(i));
	    }
	  }
	  public static long tribonacci(int num) {
	    if (num == 0) { // numが0ならば...
	      return 0; // ここを修正
	    }
	    if (num == 1) { // numが1ならば...
	      return 0; // ここを修正
	    }
	    if (num == 2) { // numが2ならば...
	      return 1; // ここを修正
	    }
	    // 直前の3つのトリボナッチ数の和を返す
	    return tribonacci(num-1) + tribonacci(num-2) + tribonacci(num-3); // ここを修正
	  }
	}*/
	
	// 再帰を用いて作成（一回）
	/*public class Main {
	    public static void main(String[] args) throws Exception {
	        int number = 50;
	        for (int i = 0; i <= number; i++) {
	            System.out.println(i + ": " + tribonacci(i));
	        }
	    }
	    public static long tribonacci(int num) {
	        // トリボナッチ数の最初の3項(0, 0, 1)を用いて，再起呼び出し
	        return tri2(0, 0, 1, num);
	    }
	    public static long tri2(long a, long b, long c, long d) {
	        // 再起の深さがd
	        if (d < 2) {
	            return a;
	        }
	        // 再起呼び出し
	        return tri2(a + b + c, a, b, d - 1); // この行を修正
	    }
	}*/

	// 配列 トリボナッチ数
	// 0, 0, 1, 2, 4, 7, 13, 24, 44, 81, 149
	// ループを1つだけ用いて作成
	    public static void main(String[] args) throws Exception {
	        int number = 50;
	        long[] tri = new long[number + 1];

	        tri[0] = 0; // 0番目のトリボナッチ数は0
	        tri[1] = 0; // 1番目のトリボナッチ数は0
	        tri[2] = 1; // 2番目のトリボナッチ数は1

	        for (int i = 0; i <= number; i++) {
	            if (i >= 3) {
	                // 直前の3つのトリボナッチ数から次のトリボナッチ数を求める
	                tri[i] = tri[i - 1] + tri[i - 2] + tri[i - 3];
	            }
	            System.out.println(i + ": " + tri[i]);
	        }
	    }



}
