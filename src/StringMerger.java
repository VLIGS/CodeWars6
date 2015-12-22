import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {

        if(s.length()!= (part1 + part2).length()){
            return false;
        }

        List<Integer> myPart1Order = new ArrayList<Integer>();
        List<Integer> myPart2Order = new ArrayList<Integer>();


        for (int i =0; i< s.length()-1; i++){
            if(!(part1.indexOf(s.charAt(i))<0)){
                myPart1Order.add(part1.indexOf(s.charAt(i)));
                part1 = removeCharAt(part1, part1.indexOf(s.charAt(i)));
            }
            else if (!(part2.indexOf(s.charAt(i))<0)){
                myPart2Order.add(part2.indexOf(s.charAt(i)));
                part2 = removeCharAt(part2, part2.indexOf(s.charAt(i)));
            }
            else{
                return false;
            }
        }
        List tmp = new ArrayList(myPart1Order.size());
        Collections.sort(tmp);
        boolean sorted1 = tmp.equals(myPart1Order);
        tmp = new ArrayList(myPart2Order.size());
        boolean sorted2 = tmp.equals(myPart2Order);

        return sorted1&&sorted2;
    }
    public static String removeCharAt(String s, int pos) {
        StringBuffer buf = new StringBuffer( s.length() - 1 );
        buf.append( s.substring(0,pos) ).append( s.substring(pos+1) );
        return buf.toString();
    }

}
