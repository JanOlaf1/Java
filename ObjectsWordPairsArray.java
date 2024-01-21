package testi1;

public class ObjectsWordPairsArray {


    public static void main(String[] args) {
    	WordPair[] wps 
	    	= {
				new WordPair("school", "koulu"), 
				new WordPair("student", "opiskelija"), 
				new WordPair("textbook", "oppikirja")
			};
    
    	for (WordPair wp : wps) {
    		System.out.println(wp.getEnglishWord() + " = " + wp.getFinnishWord());
    	}
    }
	
}
