package trie;

public class TrieClinet {

	public static void main(String[] args) {
		Trie trie= new Trie();
		trie.addWord("are"); trie.addWord("art");
		trie.addWord("and"); trie.addWord("an");
		trie.addWord("ant"); trie.addWord("as");
		trie.addWord("ask"); trie.addWord("see");
		trie.addWord("sea"); trie.addWord("seen");
		trie.displayWord();
		
//		System.out.println();
//		System.out.println(trie.searhWord("as") + " " + trie.searhWord("ask"));
//		trie.remove("as");
//		System.out.println(trie.searhWord("as") + " " + trie.searhWord("ask"));
//		trie.displayWord();
//		
//		System.out.println();
//		System.out.println(trie.searhWord("as") + " " + trie.searhWord("ask"));
//		trie.remove("ask");
//		System.out.println(trie.searhWord("as") + " " + trie.searhWord("ask"));
//		trie.displayWord();
//		
//		System.out.println();
//		System.out.println(trie.searhWord("an") + " " + trie.searhWord("and"));
//		trie.remove("and");
//		System.out.println(trie.searhWord("an") + " " + trie.searhWord("and"));
//		trie.displayWord();
//		
//		System.out.println();
//		System.out.println(trie.searhWord("an") + " " + trie.searhWord("and"));
//		trie.remove("an");
//		System.out.println(trie.searhWord("an") + " " + trie.searhWord("and"));
//		trie.displayWord();
		
		trie.display();

	}

}
