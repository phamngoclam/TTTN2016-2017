import java.util.*;
public class n_gram {
	public static List<String> ngrams(int n, String str){
		List<String> ngrams = new ArrayList<String>();
		String[] word = str.split(" ");
		for (int i = 0; i < word.length - n + 1; i++)
            ngrams.add(concat(word, i, i+n));
		return ngrams;
	}
	
	public static String concat(String[] words, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++)
            sb.append((i > start ? " " : "") + words[i]);
        return sb.toString();
    }
}
