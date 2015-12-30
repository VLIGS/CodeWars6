import java.util.Stack;

public class BraceChecker {
    public boolean isValid(String braces) {
        System.out.println(braces);
        if(braces.length()%2!=0){return false;}
        Stack<String> myBracesStack = new Stack<String>();
        for (int i=0; i<braces.length(); i++) {
            switch (braces.charAt(i)){
                case '(': myBracesStack.push(Character.toString(braces.charAt(i)));
                    break;
                case ')': if(myBracesStack.empty() || !myBracesStack.peek().equals("(")){
                    return false;
                }
                    else{
                    myBracesStack.pop();
                }
                    break;
                case '{': myBracesStack.push(Character.toString(braces.charAt(i)));
                    break;
                case '}':if(myBracesStack.empty() || !myBracesStack.peek().equals("}")){
                    return false;
                }
                else{
                    myBracesStack.pop();
                }
                    break;
                case '[': myBracesStack.push(Character.toString(braces.charAt(i)));
                    break;
                case ']': if(myBracesStack.empty() || !myBracesStack.peek().equals("]")){
                    return false;
                }
                else{
                    myBracesStack.pop();
                }
                    break;
                default:
                    break;
            }
        }
        return true;
    }
}

/**
    public boolean isValid(String braces) {
        System.out.println(braces);
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

 **/