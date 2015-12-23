import java.text.DecimalFormat;

public class Suite {

    public static double going(int n) {
        System.out.println("Testing" + n);
        long secondPart = 0;
        DecimalFormat sixDForm = new DecimalFormat("#.######");
        for (int i = n; i>0; i--){
            secondPart = secondPart + factorial(i);
        }
        return Double.valueOf(sixDForm.format(1.0/factorial(n) * secondPart));
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