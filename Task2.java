import java.util.Scanner;
public class Task2{

	public static void main (String... args){
		Scanner scan = new Scanner(System.in);

		int count = 1;
		int score = 0;
		int userInput = 0;
		
		while(count <= 10){
			System.out.printf("Enter score %d: ", count);
			userInput = scan.nextInt();

			score += userInput;
			count++;
		}
		System.out.printf("The average is : %d%n ",score/10);
	}

}