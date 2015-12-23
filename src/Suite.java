public class Suite {

    public static double going(int n) {
        long secondPart = 0;
        for (int i = n; i>0; i--){
            secondPart = secondPart + factorial(i);
        }
        return 1.0/factorial(n) * secondPart;
    }

    public static long factorial (int number){
        long result = 1;
        if (number > 1){
            for (int i = number; i>1; i-- ){
                result = result*number;
                number--;
            }
        }
        return result;
    }
}