public class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        for(int i = 0; i<word.length(); i++){
            if(countNumberOfOccurances(word, word.charAt(i))>1){
                word = word.replace(word.charAt(i),")".charAt(0));
            }
            else {
                word = word.replace(word.charAt(i),"(".charAt(0));
            }
        }
        return word;
    }
    static int countNumberOfOccurances(String word, char myChar){
        int count = 0;
        for(int i = 0; i<word.length(); i++){
            if(myChar == word.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
