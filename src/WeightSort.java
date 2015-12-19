import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WeightSort {

    public static String orderWeight(String strng) {
        List<String> myStringList = Arrays.asList(strng.split(" "));
        List<Integer> myIntegerList = new ArrayList<Integer>();
        for(int i = 0; i<myStringList.size(); i++){
            int mySum=0;
            for(int k = 0; k<myStringList.get(i).length(); k++){
                String myCharacter = String.valueOf(myStringList.get(i).charAt(k));
                mySum = mySum + Integer.parseInt(myCharacter);
            }
            myIntegerList.add(i,mySum);
        }

        /**
        for(int i = 0; i < myIntegerList.size(); i++){

        }
         **/

        List<String> myOrderedArray = new ArrayList<String>();

        int minIndex = myIntegerList.indexOf(Collections.min(myIntegerList));
        myOrderedArray.add(myStringList.get(minIndex));
        myIntegerList.remove(minIndex);
        myStringList.remove(minIndex);

        return null;
    }
}
