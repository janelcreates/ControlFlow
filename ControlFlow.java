import java.util.*;

public class ControlFlow {
	
	public static void printNumbers() {
		//48-57
		
		for (char i = 48; i<58; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void printLowerCase() {
		//097-122
		for (char i=97; i<123; i++) {
			System.out.println(i);
		}
	}
	
	public static void printUpperCase() {
		//065-090
		for (char i=65; i<91; i++);
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("Hello world");
		Scanner userInput = new Scanner (System.in);
		
		ControlFlow.printNumbers();
		ControlFlow.printLowerCase();
		ControlFlow.printUpperCase(); 
		System.out.println("What's your name?");
		String name = (userInput.nextLine());
		System.out.println("Hello " + name + "!");
		System.out.println("Do you want to continue?");
		String yesOrno = (userInput.nextLine());
		
		if (yesOrno.equalsIgnoreCase("yes") || (yesOrno.equalsIgnoreCase("y")))  {
			System.out.println("Okay great.");
		} else {
			System.out.println("That's too bad. Please return later to complete the survey.");
			System.exit(0);
		}
		
		System.out.println("Start of Survey:\nDo you have a red car? (Yes/No)");
		String redCar = (userInput.nextLine());
		System.out.println("What is the name of your favorite pet?");
		String favPet = (userInput.nextLine());
		System.out.println("Your favorite pet: " + favPet);
		System.out.println("How old is your favorite pet?");
		int age_of_pet = Integer.parseInt(userInput.nextLine());
		System.out.println("What is your lucky number?");
		int luckyNumber = Integer.parseInt(userInput.nextLine());
		System.out.println("Lucky number: " + luckyNumber);
		System.out.println("What's your favorite quarterback's jersey number?");
		int jerseyNumber = Integer.parseInt(userInput.nextLine());
		System.out.println("Jersey number: " + jerseyNumber);
		System.out.println("What is two digit model year of your car?");
		int modelYear = Integer.parseInt(userInput.nextLine());
		System.out.println("You said: " + modelYear);
		System.out.println("What is the first name of your favorite actor or actress?");
		String favActor = (userInput.nextLine());
		System.out.println("You said: " + favActor);
		System.out.println("Finally, enter a random number between 1 and 50.");
		int randomNum = Integer.parseInt(userInput.nextLine());
		System.out.println("You said: " + randomNum);
		
		int maxNumber = 75;
		Random rnd = new Random();
		int random1 = rnd.nextInt(10);
		int random2 = rnd.nextInt(10);
		int random3 = rnd.nextInt(10);
		
	
		
		int magicBall;
		if (jerseyNumber != 0) {
			magicBall = jerseyNumber * random1;
		} else {
			magicBall = luckyNumber * random1;
		}
		
		magicBall %= maxNumber;
		

		
		//5 non magic numbers
		int magic1 = modelYear + luckyNumber;
		int magic2 = 42;
		int magic3 = age_of_pet + modelYear;
		int magic4 = jerseyNumber + age_of_pet + luckyNumber;
		int magic5 = randomNum - random3;
		
		System.out.println("\nResults:\nLottery numbers: " + magic1 + ", " + magic2 + ", " + magic3 + ", " + magic4 + ", " + magic5 + ". Magic ball: " + magicBall);
		

	}

}
