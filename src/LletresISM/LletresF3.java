package LletresISM;
import java.util.*;

public class LletresF3 {
	static List<Character> nameList;
	
	public static void main(String[] args) {
		nameList = userName();
		printWord(nameList);
		printHeader();
		printCharacterCount(characterCount(nameList));		
	}
	public static List<Character> userName(){
		return new ArrayList<>(Arrays.asList('I', 'v', 'a', 'n', 'í', 'n'));
	}
	public static void printWord(List<Character> word) {
		System.out.print("La paraula \"");
		for(int i = 0; i < word.size(); i++) {
			System.out.printf("%c", word.get(i));
		}
		System.out.printf("\" conté: \n\n");
	}
	public static void printHeader() {
		System.out.println("Lletra\tQuantitat\n");
		System.out.println(" ");
	}
	public static Map<Character, Integer> characterCount(List<Character> word) {
		Map<Character, Integer> characterMap = new HashMap<>();
		for(int i = 0; i < word.size(); i++) {
			if (characterMap.containsKey(word.get(i))){
				characterMap.put(word.get(i), 
				characterMap.get(word.get(i))+1);
			}else {
				characterMap.put(word.get(i), 1);
			}
		}
		return characterMap;
	}	

	public static void printCharacterCount(Map<Character, Integer> mapChars) {
		Set set = mapChars.entrySet();
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Map.Entry mentry = (Map.Entry)iter.next();
			System.out.printf("%c\t%d\n", mentry.getKey(), mentry.getValue());
		}		
	}
}

