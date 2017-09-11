package stupid.controller;

import stupid.model.PlayDohCircle;

public class StupidController
{
	
	public void start()
	{
		System.out.println("I like to play videogames");
		
		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner;
		firstScanner = new Scanner(System.in);
		System.out.println("what is your favorite food?");
		String answer = firstScanner.nextLine();
		System.out.println("Oh cool, you like " + answer);
		
		PlayDohCircle firstCircle = new PlayDohCircle
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("Look I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
	}
	
}
