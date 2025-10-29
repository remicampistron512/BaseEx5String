import java.util.*;

public class BaseEx5String {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("chine"));
		// Premiere partie de l'exercice, deux façons de concatener deux strings entre elles
		String a = "Premiere phrase";
		String b = "Deuxième phrase";
		
		System.out.println(a + "," + b);
		
		System.out.println(a.concat(",").concat(b));
		
		
		// Deuxième partie de l'exercice, détecter un mot dans une chaîne
		
		String wordToFind = "beau";
		String sentence = "il fait beau aujourd'hui";
		String [] sentenceArray =  sentence.split(" ");
		
		
		
		
		// troisième partie, utiliser la saisie utilisateur pour remplacer un mot
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dans la phrase suivante : " + sentence );
		System.out.println("entrez un mot à trouver");
		wordToFind = scan.nextLine();
		
		findWord(wordToFind, sentenceArray);
		
		System.out.println("par quel mot voulez vous le remplacer ?");
		
		String replacementWord = scan.nextLine();
		String joinedSentence = replaceWord(wordToFind,replacementWord, sentenceArray);
		
		
		System.out.println(joinedSentence);
		
		
	}
	
	// Determine si le mot est un palindrome
	public static boolean isPalindrome(String word) {
		String [] wordArray =  word.split("");
		for (int i=0,j=wordArray.length-1;i<j;i++,j--) {				
				System.out.println(wordArray[i] +"  "+ wordArray[j]);
				if(!wordArray[i].equals(wordArray[j])) {
					return false;
				}
			
		}
		return true;
	}

	public static void findWord(String wordToFind, String[] sentenceArray) {
		for (int i = 0; i<sentenceArray.length;i++) {
			if (sentenceArray[i].equals(wordToFind)) {
				System.out.println("trouvé");
			}
		}
	}
	
	public static String replaceWord(String wordToFind, String replacementWord,String[] sentenceArray ) {
		for (int i = 0; i<sentenceArray.length;i++) {
			if (sentenceArray[i].equals(wordToFind)) {
				sentenceArray[i] = replacementWord;
			}
		}
		String joinedSentence = String.join(" ",sentenceArray);
		
		return joinedSentence;
	}

}
