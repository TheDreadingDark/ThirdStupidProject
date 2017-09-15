package stupid.controller;

import stupid.model.PlayDohCircle;
import stupid.model.PlayDohTrapezoid;
import java.util.Scanner;

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
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		
		System.out.println("Look I made a circle");
		System.out.println(firstCircle);
		System.out.println(secondCircle);
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How big of a circle do you want?");
		int circleSize = myScanner.nextInt();
		
		PlayDohCircle thirdCircle = new PlayDohCircle(10);
		System.out.println(thirdCircle);
		
		System.out.println("What size should we change the circle to?");
		int updated = myScanner.nextInt();
		thirdCircle.setSize(updated);
		System.out.println("The circle now is.....");
		System.out.println(thirdCircle);
		
		PlayDohTrapezoid firstTrapezoid = new PlayDohTrapezoid();
		PlayDohTrapezoid secondTrapezoid;
		secondTrapezoid = new PlayDohTrapezoid();
		
		System.out.println("Look I made a trapezoid");
		System.out.println(firstTrapezoid);
		System.out.println(secondTrapezoid);
		
		PlayDohTrapezoid thirdTrapezoid = new PlayDohTrapezoid(13);
		System.out.println(thirdTrapezoid);
	
		firstScanner.close();
		myScanner.close();
	}
	
}
