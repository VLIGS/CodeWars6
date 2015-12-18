import java.util.HashMap;
import java.util.Map;

public class WeightSort {

    public static String orderWeight(String strng) {
        String [] myArrayString = strng.split(" ");
        Map <Integer, String> myStringsMapping = new HashMap<Integer, String>();
        for(int i = 0; i<myArrayString.length; i++){
            int mySum=0;
            for(int k = 0; k<myArrayString[i].length(); k++){
                String myCharacter = String.valueOf(myArrayString[i].charAt(k));
                mySum = mySum + Integer.parseInt(myCharacter);
            }
            myStringsMapping.put(mySum,myArrayString[i]);
        }
        return null;
    }
}
