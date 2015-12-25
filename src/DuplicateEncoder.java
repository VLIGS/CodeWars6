import java.util.ArrayList;
import java.util.List;

public class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        String returnString=word;
        for(int i = 0; i<word.length(); i++){
            Integer[] myIndexArray = countNumberOfOccurances(word, word.charAt(i));
            if(myIndexArray.length>1){
                returnString = replaceCharacter(myIndexArray, returnString,")".charAt(0));
            }
            else {
                returnString = replaceCharacter(myIndexArray, returnString,"(".charAt(0));
            }
        }
        return returnString;
    }
    static Integer[] countNumberOfOccurances(String word, char myChar){

        List<Integer> myIndexList = new ArrayList<Integer>();
        for(int i = 0; i<word.length(); i++){
            if(myChar == word.charAt(i)){
                myIndexList.add(i);
            }
        }
        Integer [] count = new Integer[myIndexList.size()];
        return myIndexList.toArray(count);
    }
    static String replaceCharacter(Integer[] index, String myString, char myChar){
        char [] myCharArray = myString.toCharArray();
        for(int i = 0; i<index.length;i++){
            myCharArray[index[i]] = myChar;
        }
        return new String(myCharArray);
    }
}
/** Better Solution

public class DuplicateEncoder {
    static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
}
 **/