public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        System.out.println(toString(s, n));
        double [] myArray = new double [n];
        if (n!=0) {
            if (n>=s.length){
                for (int i = 0; i < s.length; i++) {
                myArray[i] = s[i];
                }
                for (int k = s.length; k < n; k++) {
                    myArray[k] = myArray[k - 3] + myArray[k - 2] + myArray[k - 1];
                }
            }
            else{
                for (int i = 0; i < n; i++) {
                    myArray[i] = s[i];
                }
            }
        }
        return myArray;
    }

    public String toString (double[] s, int n){
        String myReturnString = "";
        for(int i = 0; i<s.length; i++){
            myReturnString = myReturnString + s[i]+" ";
        }
        myReturnString = myReturnString +n;
        return myReturnString;
    }
}
