package algorithm;

public class GuregorioLeapYear {
	//グレゴリオ暦の閏年判定 - 乱数版
	public static void main(String[] args) throws Exception {
		int seireki = (int) (Math.random() * 3000 + 1);// 1~3000 までの数字

		if (seireki % 400 == 0) { // (ここを修正) 西暦年が400で割り切れるとき
			System.out.println(seireki + " leap year");
		} else if (seireki % 100 == 0) { // (ここを修正) それ以外で、西暦年が100で割り切れるとき
			System.out.println(seireki);
		} else if (seireki % 4 == 0) { // (ここを修正) それ以外で、西暦年が4で割り切れるとき
			System.out.println(seireki + " leap year");
		} else { // それ以外のとき
			System.out.println(seireki);
		}
	}
}
