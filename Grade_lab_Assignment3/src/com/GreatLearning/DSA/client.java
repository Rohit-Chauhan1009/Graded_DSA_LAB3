package com.GreatLearning.DSA;

import com.GreatLearning.DSA.PairWithSumInBST.Node;

public class client {

	public static void main(String[] args) {
		Node root = null;
		PairWithSumInBST Ps = new PairWithSumInBST();
		root = Ps.insertData(root, 40);
		root = Ps.insertData(root, 20);
		root = Ps.insertData(root, 50);
		root = Ps.insertData(root, 10);
		root = Ps.insertData(root, 30);
		root = Ps.insertData(root, 60);
		root = Ps.insertData(root, 70);

		int sum = 130;

		Ps.findPairWithSum(root, sum);
	}

}
