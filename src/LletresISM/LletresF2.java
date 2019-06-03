package LletresISM;
import java.util.*;

public class LletresF2 {
	static List<Character> nameList;
	
	public static void main(String[] args) {
		nameList = userName();
		printCharacterList(nameList);
	}
	public static List<Character> userName() {
		return new ArrayList<>(Arrays.asList('I', 'v', 'a', 'n'));
	}
	public static boolean hasNumber(List<Character> word) {
		for(int i = 0; i < word.size(); i++) {
			if(Character.isDigit(word.get(i))) {
				return true;
			}
		}
		return false;
	}
	public static void printCharacterList(List<Character> word) {
		if(hasNumber(word)) {
			System.out.println("Només lletres al noms si us plau");
		}else if(!allCharacters(word)) {
			System.out.println("Només lletres als noms si us plau");
		}else{
			printHeader();
			printCharacterType(word);
		}
	}
	public static void printHeader() {
		System.out.println("Lletra\tTipus\n");
		System.out.println(" ");
	}
	public static void printCharacterType(List<Character> word){
		for(int i = 0; i < word.size(); i++) {
			System.out.printf("%c\t%s\n", word.get(i), lookCharacterType(word.get(i)));
		}
	}
	public static String lookCharacterType(char c) {
		c = Character.toUpperCase(c);
		if((c == 'A')||(c == 'E')||(c == 'I')||(c == 'O')||(c == 'U')) {
			return "VOCAL";
		}else {
			return "CONSONANT";
		}
	}
	public static boolean allCharacters(List<Character> word) {
		for(int i = 0; i < word.size(); i++) {
			if(!Character.isLetter(word.get(i))) {
				return false;
			}
		}
		return true;
	}

}
