public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if(s.length()!= (part1 + part2).length()){
            return false;
        }

        int part1Count = 0;
        int part2Count = 0;
        for (int i = 0; i < s.length(); i++){
            char myMergedStringCharacter = s.charAt(i);
            if(part1.length()>part1Count && part1.charAt(part1Count) == myMergedStringCharacter){
                part1Count++;
            }
            else if(part2.length()>part2Count && part2.charAt(part2Count) == myMergedStringCharacter){
                part2Count++;
            }
            else{
                return false;
            }
        }
        return true;
    }

}
