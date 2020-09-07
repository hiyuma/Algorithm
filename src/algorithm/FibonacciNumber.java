package algorithm;

public class FibonacciNumber {
	// フィボナッチ数 - シンプル
	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
	public static void main(String[] args) throws Exception {
		/*    int number = 30; //number番目までフィボナッチ数を出力
		    for(int i = 0; i <= number; i++){
		    System.out.println(i + ":" + fibonacci(i));
		    }
		}

		// 指定番のフィボナッチ数を求める
		public static long fibonacci(int num) {
		    if(num == 0){
		        return 0;
		    }
		    if(num == 1){
		        return 1;
		    }

		    long fibo = 0;
		    long fibo_0 = 0;
		    long fibo_1 = 1;

		    for(int i = 1; i < num; i++){
		        fibo = fibo_0 + fibo_1;
		        fibo_0 = fibo_1;
		        fibo_1 = fibo;
		     }
		  return fibo;*/


		// 再帰を用いて作成 (1回)
		/*		public class Main {
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
				}

				num = 7の場合
				(0 1 7)
				(1 0 6)
				(1 1 5)
				(2 1 4)
				(3 2 3)
				(5 3 2)
				(8 5 1)
				(13 8 0)
				→フィボナッチ数は、13			*/


		// 配列
		int number = 50;
		long fibo[] = new long[number + 1];

		fibo[0] = 0;
		fibo[1] = 1;

		for (int i = 0; i <= number; i++) {
			if (i >= 2) {
				fibo[i] = fibo[i - 1] + fibo[i - 2];
			}
			System.out.println(i + ":" + fibo[i]);
		}



		// フィボナッチ数 - ビネの公式
		// Fn = 1/√5{ ( ( 1+√5 ) ÷ 2 )n乗　-  ( ( 1-√5 ) ÷ 2 )n乗  }
		/*public class Main {
		    public static void main(String[] args) throws Exception {
		      int number = 100;
		      for(int i = 0; i <= number; i++){
		      System.out.println(i + ":" + fibonacci(i));
		      }
		    }

		    public static long fibonacci(int num) {
		       return Math.round((Math.pow((1+ Math.sqrt(5)) / 2, num)
		        - Math.pow((1 - Math.sqrt(5)) / 2 , num))
		        / Math.sqrt(5));
		    }
		}*/

	}
}
