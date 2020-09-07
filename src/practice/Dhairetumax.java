package practice;

import java.util.Scanner;

public class Dhairetumax {

	/*	入力の配列による保持/一番大きな数字を出力 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int max = a[0];

        for(int i=0; i<N; i++) {
        	 a[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++) {
        	if(max<a[i]) {
        		max=a[i];
        	}
        }

        	System.out.println(max);

        sc.close();

	}

}
