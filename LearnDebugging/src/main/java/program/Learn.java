package program;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn {

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
