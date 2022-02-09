package com.gambler_problem;

public class GamblerProblem {
	public static void main(String[] args) {
		int startingTotalAmount = 100;
		int betsPerGame = 1;
		double winOrLoose = Math.floor(Math.random() * 10) % 2;
		if (betsPerGame == winOrLoose) {
			System.out.println("you won the game");
			startingTotalAmount = startingTotalAmount + 1;
			System.out.println("After winning the game your total amount is:" + startingTotalAmount);
		} else {
			System.out.println("you loose the game");
			startingTotalAmount = startingTotalAmount - 1;
			System.out.println("After loosing the game your total amount is:" + startingTotalAmount);
		}
	}
}
