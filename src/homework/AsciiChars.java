package homework;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class AsciiChars {

	public static void printNumbers() {
		for (int i = 48; i < 58; i++) {
			String n = Character.toString((char) i);
			System.out.println(n);
		}
	}

	public static void printLowerCase() {
		for (int i = 97; i < 123; i++) {
			String n = Character.toString((char) i);
			System.out.println(n);
		}
	}

	public static void printUpperCase() {
		for (int i = 65; i < 91; i++) {
			String n = Character.toString((char) i);
			System.out.println(n);
		}
	}


	public static void main(String[] args) {
		AsciiChars.printNumbers();
		AsciiChars.printLowerCase();
		AsciiChars.printUpperCase();

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String input = scan.nextLine();
		System.out.printf("\n Hello %s!", input);
		System.out.println(" Do you wish to continue to the interactive portion? (yes, no)");
		input = scan.nextLine();
		switch (input.toLowerCase()) {
			case "yes":
				System.out.println("Let's get started!");
				break;
			case "y":
				System.out.println("Let's get started!");
				break;
			default:
				System.out.println("Please return later to complete the survey");
				break;
		}
		String[] question = {"Do you have a red car? (yes, no)", "What is the name of your favorite pet?",
			"How old is your favorite pet?", "What is your lucky number?", "Do you have a favorite quarterback? (yes or no)",
			"What is his jersey number?", "What is the two-digit model year of your car?",
			"What is the first name of the their favorite actor or actress?", "Enter a random number between 1 and 50."};
		String[] answer;
		answer = new String[question.length];
		for (int i = 0; i < 4; i++) {
			System.out.println(question[i]);
			answer[i] = scan.nextLine();
		}
		System.out.println(question[4]);
		input = scan.nextLine();
		switch (input.toLowerCase()) {
			case "yes":
				answer[4]="yes";
				System.out.println(question[5]);
				answer[5] = scan.nextLine();
				break;
			case "y":
				answer[4]="yes";
				System.out.println(question[5]);
				answer[5] = scan.nextLine();;
				break;
			default:
				answer[4]="no";;
				answer[5] = "";;
				break;
		} 
		for (int i = 6; i < 9; i++) {
			System.out.println(question[i]);
			answer[i] = scan.nextLine();
		}
		Random rand = new Random();
		int rand1 = rand.nextInt(10);
		int rand2 = rand.nextInt(10);
		int rand3 = rand.nextInt(10);
		int magic = rand1*Integer.parseInt(answer[3]);
		if (magic >75) {
			magic =(rand1*Integer.parseInt(answer[3])-75);}
		int num1 = (Integer.parseInt(answer[3])+Integer.parseInt(answer[6]));
		int num2 = (Integer.parseInt(answer[8])-rand2);
		int num3 = 42;
		char first = answer[7].charAt(0);
		int num4 = first;
		char third = answer[1].charAt(2);
		int num5 = third;
		int [] lotteryNums = {num1, num2, num3, num4, num5};
		System.out.println(Arrays.toString(lotteryNums)+ " magic ball number "+ magic);
				
	}
}
