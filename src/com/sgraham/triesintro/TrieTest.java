package com.sgraham.triesintro;

import java.util.Set;

public class TrieTest {

	public static void main(String[] args) {
		Trie myTrie = new Trie();
		myTrie.insertWord("car");
		myTrie.insertWord("card");
		myTrie.insertWord("chip");
		myTrie.insertWord("trie");
		myTrie.insertWord("try");
		
		Set<Character> trieKeys = myTrie.root.children.keySet();
		for (Character key : trieKeys) {
			System.out.println(key);
		}
		Set<Character> childKeys = myTrie.root.children.get('c').children.keySet();
		for (Character key : childKeys) {
			System.out.println(key);
		}
		
		System.out.println(myTrie.isPrefixValid("ca"));
		System.out.println(myTrie.isPrefixValid("cho"));
		System.out.println(myTrie.isPrefixValid("tr"));
		System.out.println(myTrie.isPrefixValid("chipjkhloefheofhalfheaelfhelohifldhcsnlkjb"));
		System.out.println(myTrie.isPrefixValid("ta"));
		
		System.out.println("\n -------------------------- \n");
		
		System.out.println(myTrie.isWordValid("ca"));
		System.out.println(myTrie.isWordValid("cap"));
		System.out.println(myTrie.isWordValid("car"));
		System.out.println(myTrie.isWordValid("card"));
		System.out.println(myTrie.isWordValid("tree"));
		System.out.println(myTrie.isWordValid("try"));
		System.out.println(myTrie.isWordValid("trykjhfadshofhweflfkadslhflss"));
		

	}

}
