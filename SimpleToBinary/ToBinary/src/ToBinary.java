import java.util.Scanner;

public class ToBinary {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a number to be made into a binary number: ");
		int n = userInput.nextInt();
		int userNum = n;
		String binary = "";
		while (n != 0) {
			int number = n%2;
			binary = number + binary;
			n = n/2;
			
		}
		System.out.println("You entered " + userNum + ", which is " + binary + " in binary.");
		}
	}

