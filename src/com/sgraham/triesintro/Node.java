package com.sgraham.triesintro;
import java.util.HashMap;

public class Node {
	public HashMap<Character, Node> children;
	public boolean isWord;
	
	public Node () {
		this.children = new HashMap<Character, Node>();
		this.isWord = false;
	}
}
