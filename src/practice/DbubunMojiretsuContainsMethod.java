
package practice;

import java.util.Scanner;

public class DbubunMojiretsuContainsMethod {

    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		CharSequence a = sc.nextLine();
    		String S = sc.nextLine();

    		 if (S.contains(a))
    	        {
    	            System.out.println("YES");
    	        }else {
    	        	System.out.println("NO");
    	        }
    		sc.close();

    	}
}
