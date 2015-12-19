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

        //create integer array equivalent to all strings
        List<Integer> myIntegerList = new ArrayList<Integer>();
        for(int i = 0; i<myStringList.size(); i++){
            int mySum=sumOfDigits(myStringList.get(i));
            myIntegerList.add(i,mySum);
        }

        //sort array
        List<String> myOrderedArray = new ArrayList<String>();
        while(myIntegerList.size()>0){
            int minIndex = myIntegerList.indexOf(Collections.min(myIntegerList));
            myOrderedArray.add(myStringList.get(minIndex));
            myIntegerList.remove(minIndex);
            myStringList.remove(minIndex);
        }
        //sort taking into consideration strings with same numerical values
        boolean unsortedStringFlag=false;
        unsortedStringFlag = checkIfSorted(myOrderedArray);
        while (unsortedStringFlag){
            myOrderedArray = sortIfEqualNumericalStrings(myOrderedArray);
        }
        String mySortedString = "";
        for(int i = 0; i<myOrderedArray.size();i++){
            mySortedString = myOrderedArray.get(i) + " ";
        }
        mySortedString.trim();
        return mySortedString;
    }
    public static List<String> sortIfEqualNumericalStrings(List<String> myListToSort){
        List<String> mySortedList = new ArrayList<String>();
        return mySortedList;
    }
    public static boolean checkIfSorted(List<String> myList){
        for(int i = 0; i < myList.size()-1; i++){
            if(sumOfDigits(myList.get(i)) == sumOfDigits((myList.get(i+1)))){
                if(myList.get(i).compareTo(myList.get(i+1))>0){return true;}
            }
        }
        return false;
    }
    public static int sumOfDigits(String myStringOfDigits){
        int mySum=0;
        for(int k = 0; k<myStringOfDigits.length(); k++){
            String myCharacter = String.valueOf(myStringOfDigits.charAt(k));
            mySum = mySum + Integer.parseInt(myCharacter);
        }
        return mySum;
    }
}
