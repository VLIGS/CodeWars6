public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        String mergedString = part1 + part2;
        if(s.length()!=mergedString.length()){
            return false;
        }
        for (int i = 0; i<Math.min(part1.length(), part2.length()); i++){
            if(!(s.indexOf(part1.charAt(i))<s.indexOf(part2.charAt(i)))){
                return false;
            }
        }
        return true;
    }

}
