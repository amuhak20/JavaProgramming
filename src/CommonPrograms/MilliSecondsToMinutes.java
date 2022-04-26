package CommonPrograms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MilliSecondsToMinutes {
    protected static double millisecondsToSeconds( long ms ) {
        return new BigDecimal( (ms/(1000.00*60)) ).setScale( 2, RoundingMode.HALF_UP ).doubleValue();
       // return new BigDecimal(( ms/(1000.00*60))%60).doubleValue();
    }
   public static void main(String[] args) {
    

        long millis = 839750;
        double millisecondsToSeconds = millisecondsToSeconds(millis);
        //int minutes = (int) (millisecondsToSeconds / 60);
        double seconds =0;
                seconds -= millisecondsToSeconds * 60;
        System.out.println(millisecondsToSeconds);
        System.out.println(seconds);
    }

}