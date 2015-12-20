public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if(s.length()!= (part1 + part2).length()){
            return false;
        }

        int part1Count = 0;
        int part2Count = 0;
        for (int i = 0; i<s.length(); i++){
            char myMergedStringCharacter = s.charAt(i);
            if(part1.length()!=0 && part1.charAt(0)== myMergedStringCharacter){
                part1 = part1.substring(1);
            }
            else if(part2.length()!=0 && part2.charAt(0)== myMergedStringCharacter){
                part2 = part2.substring(1);
            }
            else{
                return false;
            }
        }
        return true;
    }

}
