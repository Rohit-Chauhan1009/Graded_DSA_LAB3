package com.GreatLearning.BalancedBracket;

import java.util.Scanner;

public class BalancedBracketsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = sc.nextLine();

		if (BalancedBracketsmain.isBalanced(input)) {
			System.out.println("Balanced Brackets");
		} else {
			System.out.println("Unbalanced String");
		}
	}

}
