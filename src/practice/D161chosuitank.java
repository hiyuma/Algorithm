package practice;

import java.util.Scanner;

public class D161chosuitank {
	
/*	あなたは、水道設備の整っていない街に住んでいて、雨水を貯水して生活用水として用いています。
	貯水タンクの容量と、直前一週間分の1日あたりの降水量のデータが与えられるので、現在貯水タンクにはどれだけ水が溜まっているか求めてください。
	なお、貯水タンクの水ははじめ一切水が入っておらず、一週間の間溜めるのみで使用することはないものとします。

	入力例 1 では、貯水タンクの容量は 100 で、一週間あたりの降水量の合計が 28 なので、水は溢れておらず、28 を出力します。*/

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int sum = 0;

	        for(int i = 1; i<=7; i++) {
	        	int A = sc.nextInt();
	        	sum = sum+A;
	        	if(sum >= N) {
	        		sum=N;
	        	}
	        }
	        System.out.println(sum);
	        sc.close();

	}

}
