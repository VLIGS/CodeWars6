public class BraceChecker {
    public boolean isValid(String braces) {
        if(braces.length()%2!=0){return false;}
        for (int i=0; i<braces.length(); i++){
            switch (braces.charAt(i)){
                case '(': if(braces.length()>i+1 && braces.charAt(i+1)==')'){
                    i++;
                }
                    else if (getOpposite(braces,i)!=')'){
                    return false;
                }
                    break;
                case ')': if (getOpposite(braces,i)!='('){
                    return false;
                }
                    break;
                case '{': if(braces.length()>i+1 && braces.charAt(i+1)=='}'){
                    i++;
                }
                else if (getOpposite(braces,i)!='}'){
                    return false;
                }
                    break;
                case '}': if (getOpposite(braces,i)!='{'){
                    return false;
                }
                    break;
                case '[':if(braces.length()>i+1 && braces.charAt(i+1)==']'){
                    i++;
                }
                else if (getOpposite(braces,i)!=']'){
                    return false;
                }
                    break;
                case ']': if (getOpposite(braces,i)!='['){
                    return false;
                }
                    break;
                default:
                    break;
            }
        }
        return true;
    }
    private char getOpposite(String myString, int index){
            return myString.charAt(myString.length()-1-index);
    }
}
