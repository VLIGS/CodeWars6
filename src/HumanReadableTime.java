public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        if(seconds>=359999){
            return "99:59:59";
        }
        else if(seconds==0){
            return "00:00:00";
        }
        else{

        }
        // Do something
        return Integer.toString(seconds);
    }
}
