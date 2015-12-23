public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if (s.length() != part1.length() + part2.length())
            return false;
        else
            return _isMerge(s, part1, part2);
    }

    private static boolean _isMerge(String s, String part1, String part2) {
        if (s.length() == 0)
            return true;
        else if ((part1.length() > 0 && part2.length() > 0) && (s.charAt(0) == part1.charAt(0) && s.charAt(0) == part2.charAt(0)))
            return _isMerge(s.substring(1), part1.substring(1), part2) || _isMerge(s.substring(1), part1, part2.substring(1));
        else if (part1.length() > 0 && s.charAt(0) == part1.charAt(0))
            return _isMerge(s.substring(1), part1.substring(1), part2);
        else if (part2.length() > 0 && s.charAt(0) == part2.charAt(0))
            return _isMerge(s.substring(1), part1, part2.substring(1));
        else
            return false;
    }
}