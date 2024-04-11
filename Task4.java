import java.util.Scanner;
public class Task4{

	public static void main (String... args){
		Scanner scan = new Scanner(System.in);

		int count = 1;
		int score = 0;
		int even = 0;
		int userInput = 0;
		
		while(count <= 10){
			System.out.printf("Enter score %d: ", count);
			userInput = scan.nextInt();

			score += userInput;
			count++;

			if (count % 2 == 0){
				even += userInput;
			}
		}
		
		System.out.printf("The sum of even indexes : %d%n ", even);
	}

}