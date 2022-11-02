package patikaOdevDeseneGoreMethod;

import java.util.Scanner;

public class App {

	
	public static void calculator(int number){
		// sayimizin ilk halini bir degiskene atiyoruz
		int n = number;
		System.out.println(n);
		// sayimiz 1 olana kadar  5 azalticaz
		while(0 < n) {
			
			System.out.println((n-=5));
		}
		// sayimiz kendisinin ilk haline esitlenene kadar 5 articak
		while(n <= number) {
			System.out.println((n+=5));
			// ilk haline esitlendigi an donguyu bitiriyoruz.
			if(n == number) { 
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		System.out.println("Result: ");
	
		
		calculator(number);
	}

}
