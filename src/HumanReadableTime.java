public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        if(seconds>=359999){
            return "99:59:59";
        }
        else if(seconds==0){
            return "00:00:00";
        }
        else {
            int hours, minutes, seconds1;
            int SecondsInHour = 3600;
            int SecondsInMinute = 60;

            hours = seconds / SecondsInHour;
            minutes = (seconds - (hours * SecondsInHour)) / SecondsInMinute;
            seconds1 = seconds - (hours * SecondsInHour) - minutes * SecondsInMinute;
            return convertToTimeString(hours)+":"+convertToTimeString(minutes)+":"+convertToTimeString(seconds1);
        }
    }
    public static String convertToTimeString(int number){
        if(number>9){
            return ""+number;
        }
        else{
            return "0"+number;
        }
    }
}

/** Solution 1
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }
}
**/


/** Solution 2
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int h = seconds/60/60;
        int min = seconds/60%60;
        int sec = seconds%60;
        return String.format("%02d:%02d:%02d",h,min,sec);
    }
}

**/