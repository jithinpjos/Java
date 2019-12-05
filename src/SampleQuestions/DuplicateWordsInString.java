package SampleQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		duplicateWordsCount("Java is java is Java and Java is Java");
		
	}
	
	public static void duplicateWordsCount(String words) {
		
		String wordsInArray[] =words.split(" ");
		
		Map<String,Integer> wordsCountInHashMap=new HashMap<String,Integer>();
		
		for(String word:wordsInArray) {
			
			if(wordsCountInHashMap.containsKey(word)) {
				
				wordsCountInHashMap.put(word, wordsCountInHashMap.get(word)+1);
			}
			else {
				wordsCountInHashMap.put(word, 1);
			}
			
		}
		
		Set<String> wordsInString=wordsCountInHashMap.keySet();
		
		for(String word:wordsInString) {
			
			if(wordsCountInHashMap.get(word)>1) {
				System.out.println("Word : "+word+" count is :"+wordsCountInHashMap.get(word) );
			}
		}
	}

}
