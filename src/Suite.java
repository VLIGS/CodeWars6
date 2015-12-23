public class Suite {

    public static double going(int n) {
        return 0.0;
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