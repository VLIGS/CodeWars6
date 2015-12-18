import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> myStringArray = Arrays.asList(arr);
        for(int i =0; i<myStringArray.size()-2; i++){
            List<String> myDirectionsArray = myStringArray.subList(i,i+2);
            if((myDirectionsArray.contains("NORTH")&&myDirectionsArray.contains("SOUTH"))||(myDirectionsArray.contains("WEST")&&myDirectionsArray.contains("EAST"))){
                myStringArray.set(i,"TEMP");
                myStringArray.set(i+1,"TEMP");
            }
        }

        List<String> myCleanArray = new ArrayList<String>();
        for(int i = 0; i < myStringArray.size();i++) {
            if (!myStringArray.get(i).equals("TEMP")) {
                myCleanArray.add(myStringArray.get(i));
            }
        }
        return new String[] {};
    }
}


