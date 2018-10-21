package trie;

import java.util.ArrayList;
import java.util.HashMap;

public class Trie {

	private class Node {
		char data;
		HashMap<Character, Node> children = new HashMap<Character, Node>();
		boolean eow;
	}

	Node root;
	int size;
	int words;

	public Trie() {
		root = new Node();
		root.data = '$';
		size = 1;
	}

	public void displayWord() {
		displayWord(root, "");
	}

	private void displayWord(Node node, String wsf) {
		if (node.eow) {
			System.out.print(wsf + " ");
		}
		ArrayList<Character> childernkey = new ArrayList<>(node.children.keySet());

		for (char ch : childernkey) {

			Node child = node.children.get(ch);
			displayWord(node.children.get(ch), wsf + child.data);
		}

	}

	public void addWord(String word) {
		addWord(root, word);
	}

	private void addWord(Node node, String word) {
		if (word.length() == 0) {
			node.eow = true;
			words++;
			return;
		}
		char ch = word.charAt(0);
		String row = word.substring(1);

		Node child = node.children.get(ch);
		if (child != null) {
			addWord(child, row);
		} else {
			Node gch = new Node();
			gch.data = ch;
			node.children.put(ch, gch);
			addWord(gch, row);
			size++;
		}

	}

	public boolean searhWord(String word) {
		return searchWord(root, word);
	}

	public void remove(String word) {

		remove(root, word);
	}

	private void remove(Node node, String word) {
		if (word.length() == 0) {
			node.eow = false;
			words--;
			return;
		}
		char ch = word.charAt(0);
		String row = word.substring(1);

		Node child = node.children.get(ch);

		remove(child, row);
		if (!child.eow && child.children.isEmpty()) {
			node.children.remove(ch);
			size--;
		}

	}

	private boolean searchWord(Node node, String word) {
		if (word.length() == 0) {
			if (node.eow) {
				return true;
			} else {
				return false;
			}
		}
		char ch = word.charAt(0);
		String roq = word.substring(1);
		if (node.children.containsKey(ch)) {
			return searchWord(node.children.get(ch), roq);

		} else {
			return false;
		}

	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		String str = node.data + "->";

		ArrayList<Character> childrenkey = new ArrayList<>(node.children.keySet());
		for (Character ch : childrenkey) {
			str = str + node.children.get(ch).data + "->";
		}
		System.out.println(str + ".");
		for (Character ch : childrenkey) {
			display(node.children.get(ch));
		}

	}
}
