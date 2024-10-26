
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
        String [] splitWords = words.split(" ");
        int count = 0;
        HashSet<String> words1 = new HashSet<String>();
        for (int i = 0; i<splitWords.length;i++){
            words1.add(splitWords[i]);
        }
        String[] star = words1.toArray(new String[words1.size()]);
        Map<String, Integer> hm = new HashMap<String, Integer>();
        for (int i=0; i<star.length; i ++){
          
            for (int k=0; k<splitWords.length;k++){
                
                if (star[i].equals(splitWords[k])){
            
                 count = count + 1;

            }
        }
            hm.put(star[i],count);
            count = 0;
            
            
        } 
        System.out.println(hm);
        return hm;
    }
}
