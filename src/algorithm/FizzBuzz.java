package algorithm;

public class FizzBuzz {

/*	// FizzBuzz
	// 1から整数を数える
	// 3で割り切れる = Fizz
	// 5で割り切れる = Buzz
	// 3でも5でも割り切れる = FizzBuzz
	public static void main(String[] args) throws Exception {

		String output;

		for (int i = 1; i <= 30; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				output = i + ":FizzBuzz";
			} else if (i % 5 == 0) {
				output = i + ":Buzz";
			} else if (i % 3 == 0) {
				output = i + ":Fizz";
			} else {
				output = String.valueOf(i);
			}
			System.out.println(output);
		}
		-------------------------------------------------------*/

		// FizzBuzzを改良する

		    public static void main(String[] args) throws Exception {
		        String output;

		        for (int i = 1; i <= 30; i++){
		            output = "";
		            if(i % 3 == 0){
		                output = "Fizz";
		            }
		            if(i % 5 == 0){
		                output += "Buzz";
		            }
		            output = String.valueOf(i)+":"+ output;
		            System.out.println(output);
		        }
		    }
}
