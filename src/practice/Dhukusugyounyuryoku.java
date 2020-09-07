package practice;

import java.util.Scanner;

/*  複数行にわたる入力 */

public class Dhukusugyounyuryoku {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for(int i=0; i<N; i++) {
        	 a[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++) {
        	System.out.println(a[i]);
        }
        sc.close();
	}
}
