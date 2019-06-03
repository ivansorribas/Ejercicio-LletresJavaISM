package LletresISM;


public class LletresF1 {
	static char[] name = {'I','v','a','n'};

	public static void main(String[] args) {
		System.out.println("Les lletres del teu nom són: ");
		printCharacters(name);
		
	}
	public static void printCharacters(char[] word) {
		for(char c: word) {
			System.out.println(c);
		}
		System.out.println();
	}
	
}
