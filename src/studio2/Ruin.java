package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		//hi
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("What amount of $$$ do you want to start with?");
		int numGames=0;
		double startAmount= in.nextDouble();
		double newstartAmount;
		
		System.out.println("What is the probability that you win a single play?");
		
		double winChance= in.nextDouble();
		
		System.out.println("At what amount of money do you want to leave with?");
		
		double winLimit= in.nextDouble();
		
		System.out.println("How many days do you want to spend at the casino?");
		
		int totalSimulations = in.nextInt();   
			
		for (int i=0; i<totalSimulations; i++) {
			newstartAmount=startAmount;
		
		while ((newstartAmount < winLimit)&&(newstartAmount > 0)) 
		{
			if(Math.random() < winChance) {
				newstartAmount++;
			}
			else {
				newstartAmount--;
			}
			numGames++;
		}
		if (newstartAmount >= winLimit) {
			System.out.println("Simulation " + (i+1) + ": You can stop gambling for the day, it was a successful day. Games played: "+numGames);
			
		}
		else {
			System.out.println("Simulation " + (i+1) + ": You can stop gambling for the day, the day was a ruin. Games played: " + numGames);
		}
		}
	}

}
