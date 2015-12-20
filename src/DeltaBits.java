public class DeltaBits {
    public static int convertBits(int a, int b) {
        String initialNumber = Integer.toBinaryString(a);
        String finalNumber = Integer.toBinaryString(b);
        String [] myReturnString = padToEqualLength(initialNumber,finalNumber);
        initialNumber = myReturnString[0];
        finalNumber = myReturnString[1];
        int count = 0;
        for(int i = 0; i<initialNumber.length(); i++){
            if(initialNumber.charAt(i)!=finalNumber.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static String [] padToEqualLength(String a, String b){
        if(a.length()>b.length()){
            while(a.length()!=b.length()){
                b="0"+b;
            }
        }
        else if (b.length()>a.length()){
            while(a.length()!=b.length()){
                a="0"+a;
            }
        }
        return new String [] {a,b};
    }
}

/** Solution 1
 * ^ bitwise exclusive OR
 * bitCount returns number of 1s in number
public class DeltaBits {
    public static int convertBits(int a, int b) {
        return Integer.bitCount(a ^ b);
    }
}
**/

