package LletresISM;

import java.util.*;

public class LletresF4 {
	static List<Character> name;
	static List<Character> surname;

	public static void main(String[] args) {
		introWords();
		printList("Nom Usuari", name);
		printList("Cognoms Usuari", surname);
		printList("Nom complet de l'usuari", addFullName(name, surname));
	}
	public static void introWords() {
		name = new ArrayList <>(Arrays.asList('I','v','a','n'));
		surname = new ArrayList <>(Arrays.asList('S','o','r','r','i','b','a','s',' ','M','o','n','t','o', 'l','i','u'));
	}
	public static void printList(String s, List<Character> words) {
		System.out.print(s+": [");
		for(int i = 0; i < words.size() - 1; i++) {
			System.out.print("\'"+Character.toUpperCase(words.get(i))+"\',");
		}
		System.out.println("\'"+Character.toUpperCase(words.get(words.size()-1))+"\']");
	}
	public static List<Character> addFullName(List<Character> word1, List<Character> word2){
		List<Character> wordsToghether = new ArrayList<>();
		addWord(word1,wordsToghether);
		wordsToghether.add(' ');
		addWord(word2,wordsToghether);
		return wordsToghether;
	}
	public static void addWord(List<Character> word, List<Character> allWords) {
		for(int i = 0; i < word.size(); i++) {
			allWords.add(word.get(i));
		}
	}
}