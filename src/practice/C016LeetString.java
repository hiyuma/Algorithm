package practice;

import java.util.Scanner;

/*文字列が入力されるので、これを Leet に変換して出力するプログラムを書いてください。*/

public class C016LeetString {
	  public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
	        String line = sc.nextLine();

	        if(1 <= line.length() && line.length() <= 100){
	            line = line.replace("A","4");
	            line = line.replace("E","3");
	            line = line.replace("G","6");
	            line = line.replace("I","1");
	            line = line.replace("O","0");
	            line = line.replace("S","5");
	            line = line.replace("Z","2");
	        }
	        System.out.println(line);
	        sc.close();
	  }

}
