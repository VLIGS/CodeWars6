import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        List<String> myStringArray = updateArray(Arrays.asList(arr));
        for(int k = 0; k < arr.length; k++){
            if(myStringArray.contains("TEMP")){
                List<String> myCleanArray = new ArrayList<String>();
                for(int i = 0; i < myStringArray.size();i++) {
                    if (!myStringArray.get(i).equals("TEMP")) {
                        myCleanArray.add(myStringArray.get(i));
                    }
                }
                myStringArray = updateArray(myCleanArray);
            }
            else {
                String [] myReducedArray = new String[myStringArray.size()];
                myStringArray.toArray(myReducedArray);
                return myReducedArray;
            }
        }
        return new String[] {};
    }

    public static List<String> updateArray(List<String> myStringArray){
        for(int i =0; i<=myStringArray.size()-2; i++){
            List<String> myDirectionsArray = myStringArray.subList(i,i+2);
            if((myDirectionsArray.contains("NORTH")&&myDirectionsArray.contains("SOUTH"))||(myDirectionsArray.contains("WEST")&&myDirectionsArray.contains("EAST"))){
                myStringArray.set(i,"TEMP");
                myStringArray.set(i+1,"TEMP");
            }
        }
        return myStringArray;
    }
}

/** clever solution
import java.util.Stack;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        final Stack<String> stack = new Stack<>();

        for (final String direction : arr) {
            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;

            switch(direction) {
                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
            }
        }
        return stack.stream().toArray(String[]::new);
    }
}

 **/
