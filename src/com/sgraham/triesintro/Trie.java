package com.sgraham.triesintro;

import java.util.Set;

public class Trie {
	public Node root;
	
	public Trie () {
		this.root = new Node();
	}
	
	public void insertWord(String word) {
		Node currentNode = this.root;
		for (int i = 0; i < word.length(); i++) {
			Character currLetter = word.charAt(i);
			Node child = currentNode.children.get(currLetter);
			if (child == null) {
				child = new Node();
				currentNode.children.put(currLetter, child);
			}
			currentNode = child;
		}
		currentNode.isWord = true;
	}
	
//	In this assignment, you will implement the following methods:
//
//		boolean isPrefixValid(String prefix): Returns a boolean whether the prefix is in the trie or not.
//		boolean isWordValid(String word): Returns a boolean whether the word is in the trie or not.
//		void printAllKeys(): This method prints all the characters in your trie.
	public boolean isPrefixValid(String prefix) {
		Node currentNode = this.root;
		for (int i = 0; i < prefix.length(); i++) {
			Character currLetter = prefix.charAt(i);
			Node child = currentNode.children.get(currLetter);
			if (child == null) {
				return false;
			}
			currentNode = child;
		}
		return true;
	}
	public boolean isWordValid(String word) {
		Node currentNode = this.root;
		for (int i = 0; i < word.length(); i++) {
			Character currLetter = word.charAt(i);
			Node child = currentNode.children.get(currLetter);
			if (child == null) {
				return false;
			}
			currentNode = child;
		}
		if (currentNode.isWord == true) {
			return true;
		}
		return false;
	}
	
	//  need to finish this: recursion to print all the keys.
	private Character printKeys(Node nodeToPrint) {
		
	}
	
	public void printAllKeys() {
		Node startNode = this.root;
		printKeys(startNode);
		Set<Character> trieKeys = this.root.children.keySet();
		for (Character key : trieKeys) {
			System.out.println(key);
		}
		Set<Character> childKeys = myTrie.root.children.get('c').children.keySet();
		for (Character key : childKeys) {
			System.out.println(key);
		}

	}
}
