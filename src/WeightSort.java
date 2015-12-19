import java.util.ArrayList;
import java.util.Arrays;
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

        return null;
    }
}
