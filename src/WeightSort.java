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
            unsortedStringFlag = false;
        }
        String mySortedString = "";
        for(int i = 0; i<myOrderedArray.size();i++){
            mySortedString = mySortedString + myOrderedArray.get(i) + " ";
        }
        return mySortedString.trim();
    }
    public static List<String> sortIfEqualNumericalStrings(List<String> myListToSort){
        for(int i = 0; i < myListToSort.size()-1; i++){
            if(sumOfDigits(myListToSort.get(i)) == sumOfDigits((myListToSort.get(i+1)))){
                if(myListToSort.get(i).compareTo(myListToSort.get(i+1))>0){
                    String myFirstString = myListToSort.get(i);
                    String mySecondString = myListToSort.get(i+1);
                    myListToSort.set(i,mySecondString);
                    myListToSort.set(i+1,myFirstString);
                }
            }
        }
        return myListToSort;
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
            if(!(myCharacter.equals("[")||myCharacter.equals("]"))) {
                mySum = mySum + Integer.parseInt(myCharacter);
            }
        }
        return mySum;
    }
}

/**
public class WeightSort {

    public static String orderWeight(String strng) {
        String[] nums = strng.split(" ");
        int N = nums.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(nums[j], nums[j-1]) ; j--) {
                swap(nums, j, j - 1);
            }
        }
        return String.join(" ", nums);
    }

    private static boolean less(String a, String b) {
        int sumA = sumOfDigits(a);
        int sumB = sumOfDigits(b);
        return ((sumA == sumB) ? a.compareTo(b) < 0 : sumA < sumB);
    }

    private static int sumOfDigits(String a) {
        int sum = 0;
        for (char ch : a.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(ch));
        }
        return sum;
    }

    private static void swap(String[] a, int i, int j){
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}

 **/