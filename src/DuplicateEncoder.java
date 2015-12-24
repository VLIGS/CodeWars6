public class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        String myReturnString = "";
        for(int i = 0; i<word.length(); i++){
            if(countNumberOfOccurances(word, word.charAt(i))>1){
                
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
