package KTPreparation;

public class FactorialProgram {

	public static int fact(int input) {

		int res = 1;

		for (int i = 1; i < input; i++) {
			res = res * i;
		}
		return res;
	}

	public static void main(String[] args) {
		
		int input = 5;
		
		int fact = fact(input);
		
 		System.out.println(fact);

	}

}
