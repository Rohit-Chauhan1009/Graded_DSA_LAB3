package com.GreatLearning.DSA;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class PairWithSumInBST {

	static class Node {
		int nodeData;
		Node leftNode;
		Node rightNode;
	}

	static Node newNode(int nodeData) {
		Node temp = new Node();
		temp.nodeData = nodeData;
		temp.leftNode = null;
		temp.rightNode = null;

		return temp;

	}

	public Node insertData(Node root, int value) {
		if (root == null) {
			return newNode(value);
		}

		if (root.nodeData > value) {
			root.leftNode = insertData(root.leftNode, value);
		} else {
			root.rightNode = insertData(root.rightNode, value);
		}
		return root;
	}

	public boolean findPairUtil(Node root, int sum, Set<Integer> set) {
		if (root == null) {
			return false;
		}

		if (findPairUtil(root.leftNode, sum, set)) {
			return true;
		}

		if (set.contains(sum - root.nodeData)) {
			System.out.println("pair is found: " + (sum - root.nodeData) + ", " + root.nodeData);
			return true;
		} else {
			set.add(root.nodeData);
		}

		return findPairUtil(root.rightNode, sum, set);
	}

	public void findPairWithSum(Node root, int sum) {
		Set<Integer> set = new HashSet<>();
		boolean result = findPairUtil(root, sum, set);

		if (!result) {
			System.out.println("pair is not found");
		}
	}

}
