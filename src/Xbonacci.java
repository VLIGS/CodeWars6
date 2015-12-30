public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        double [] myArray = new double [n];
        for (int i = 0; i<s.length; i++){
            myArray[i] = s[i];
        }
        for (int k = s.length; k<n; k++)
        {
            myArray[k] = myArray[k-3]+myArray[k-2]+myArray[k-1];
        }
        return myArray;
    }
}
