package com.gambler_problem;

public class GamblerProblem {

	public static void main(String[] args) {
		int stake = 100;
		int betsPerGame = 1;
		int totalAmount = 0;
		int daysLoss = 0;
		int daysWon = 0;
		for (int i = 1; i <= 20; i++) {
			while (stake > 50 && stake < 150) {
				double winOrLoose = Math.floor(Math.random() * 10) % 2;
				if (betsPerGame == winOrLoose) {
					System.out.println("you won the game");
					stake = stake + 1;
					System.out.println("After winning the game your total amount is : " + stake);
				} else {
					System.out.println("you loose the game");
					stake = stake - 1;
					System.out.println("After loosing the game your total amount is : " + stake);
				}
			}
			if (stake == 50) {
				System.out.println("Today you loose your 50% amount so you have to resign for the day");
				daysLoss = daysLoss + 1;
				System.out.println("Day " + i + " is a unlucky day as he lost maximum amount Rs : " + stake);
			} else {
				System.out.println("Today you won your 50% amount so you have to resign for the day");
				daysWon = daysWon + 1;
				System.out.println("Day " + i + " is a lucky day as he won maximum amount Rs : " + stake);
			}
			totalAmount = totalAmount + stake;
			System.out.println(totalAmount);
		}
		System.out.println("After 20 days of playing total amount is : " + totalAmount);
		if (totalAmount > 2000) {
			int profit = totalAmount - 2000;
			System.out.println("you are in profit by : " + profit);
		} 
		else if (totalAmount < 2000) {
			int loss = 2000 - totalAmount;
			System.out.println("you are in loss by : " + loss);
		}
		else {
			System.out.println("you are neither in loss nor in profit: " + totalAmount);
		}
		System.out.println("In a Month " + daysWon + " days won and " + daysLoss + " days lost ");
	}
}