public class BraceChecker {

    public boolean isValid(String braces) {
        if(braces.length()%2!=0){return false;}
        for (int i=0; i<braces.length(); i++){
            switch (braces.charAt(i)){
                case '(':
                    break;
                case ')':
                    break;
                case '{':
                    break;
                case '}':
                    break;
                case '[':
                    break;
                case ']':
                    break;
                default:
                    break;
            }
        }

        //"[({})](]" false
        //"(){}[]" true
        //"(}" false
        //"[(])" false
        //"([{}])" true
        return true;
    }

}
