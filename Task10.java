import java.util.Scanner;
public class Task10{

	public static void main (String... args){
		Scanner scan = new Scanner(System.in);

		int count = 1;
		int score = 0;
		int userInput = 0;
		int counter = 1;
		
		while(count <= 10){
			System.out.printf("Enter score %d: ", count);
			userInput = scan.nextInt();

				count++;
			if (userInput  >= 0  && userInput <= 100){
				score += userInput;
				counter++;
			}
		}
		System.out.printf("Total is :%d", score/counter);
	}

}