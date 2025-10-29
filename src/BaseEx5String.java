
public class BaseEx5String {

	public static void main(String[] args) {
		// Premiere partie de l'exercice, deux façons de concatener deux strings entre elles
		String a = "Premiere phrase";
		String b = "Deuxième phrase";
		
		System.out.println(a + "," + b);
		
		System.out.println(a.concat(",").concat(b));
		
		
		// Deuxième partie de l'exercice, détecter un mot dans une chaîne
		
		String wordToFind = "beau";
		String sentence = "il fait beau aujourd'hui";
		String [] sentenceArray =  sentence.split(" ");
		
		for (int i = 0; i<sentenceArray.length;i++) {
			if (sentenceArray[i].equals(wordToFind)) {
				System.out.println("trouvé");
			}
		}
		
		
		
	}

}
