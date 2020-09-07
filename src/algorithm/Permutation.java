package algorithm;

public class Permutation {
	// Nが、0から10まで増える時、Nの階乗を計算する。
	// 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
	/*public static void main(String[] args) throws Exception {
	    int number = 10;
	    for (int i = 0; i <= number; i++) {
	        System.out.println(i + ": " + permutation(i));
	    }
	}

	public static int permutation(int num) {
	    int perm = 1;
	    // (ここに追記) permに1からnumまでの値をかけた値を代入する
	    for(int j = 1; j <= num; j++){
	        perm *= j; // permをi倍する
	    }
	    return perm;
	}*/

	// 再帰を用いて作成
	/*public class Main {
	    public static void main(String[] args) throws Exception {
	        int number = 10;
	        for (int i = 0; i <= number; i++) {
	            System.out.println(i + ": " + permutation(i));
	        }
	    }
	    public static int permutation(int num) {
	        // 0の階乗は1
	        if (num == 0) {
	            return 1;
	        }
	        // (num-1)の階乗にnumを掛けた値を返す
	        return permutation(num - 1) * num; // ここを修正
	    }
	}*/

	// 配列：Nが、0から10まで増える時、Nの階乗を計算する。
	// 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
	// ループを1つだけ用いて作成
	public static void main(String[] args) throws Exception {
		int number = 10;
		long[] perm = new long[number + 1];

		perm[0] = 1; // 0の階乗の値は1

		for (int i = 0; i <= number; i++) {
			if (i >= 1) {
				perm[i] = perm[i - 1] * i; // (i-1)の階乗の値からiの階乗の値を求める
			}
			System.out.println(i + ": " + perm[i]);
		}
	}

}
