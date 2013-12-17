import java.util.HashSet;

//Problem 1.
//Check if a string has all unique characters.
//
public class UniqueChars {

	/**
	 * @param args
	 */
	
	public Boolean hasUniqueCharacters(String string){
		HashSet<Character> charSet = new HashSet<Character>();
		for(Character c:string.toCharArray()){
			if(charSet.contains(c)){
				return false;
			}
			charSet.add(c);
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		UniqueChars uniqueChars = new UniqueChars();
		System.out.println("Returns true -" + uniqueChars.hasUniqueCharacters("abcdef"));
		System.out.println("Returns true -" + uniqueChars.hasUniqueCharacters("qwertyuioplk;,mnbvfcx"));
		System.out.println("Returns false -" + uniqueChars.hasUniqueCharacters("kbvvbjsdbvjhbhjv"));
		System.out.println("Returns true -" + uniqueChars.hasUniqueCharacters(""));



	}

}
