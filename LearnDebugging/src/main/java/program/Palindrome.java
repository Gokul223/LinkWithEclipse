package program;

public class Palindrome {

	public void palindrome() {
		int num = 34343;
		int num1 = num;
		int temp = 0 ;
		for(int i=0;i<5;i++) {
			temp = temp*10 + num%10;
			num = num/10;
		}
		System.out.println(temp);
		if(num1==temp) {
			System.out.println("The given number is palindrome");
		}else {
			System.out.println("The given number is not palindrome");
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Palindrome ob = new Palindrome();
		ob.palindrome();
		
		
	}

}
