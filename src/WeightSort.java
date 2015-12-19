import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeightSort {

    public static String orderWeight(String strng) {
        List<String> myStringList = new ArrayList<String>();
        String[] myStringArray = strng.split(" ");
        //have to do it via array because later need to remove on myStringArray,
        //which would not work if used Arrays.asList to convert strng into ArrayList
        for(int i = 0; i<myStringArray.length; i++){
            myStringList.add(myStringArray[i]);
        }
        List<Integer> myIntegerList = new ArrayList<Integer>();
        for(int i = 0; i<myStringList.size(); i++){
            int mySum=0;
            for(int k = 0; k<myStringList.get(i).length(); k++){
                String myCharacter = String.valueOf(myStringList.get(i).charAt(k));
                mySum = mySum + Integer.parseInt(myCharacter);
            }
            myIntegerList.add(i,mySum);
        }

        List<String> myOrderedArray = new ArrayList<String>();
        while(myIntegerList.size()>0){
            int minIndex = myIntegerList.indexOf(Collections.min(myIntegerList));
            myOrderedArray.add(myStringList.get(minIndex));
            myIntegerList.remove(minIndex);
            myStringList.remove(minIndex);
        }
        return null;
    }
}
