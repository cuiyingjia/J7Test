import com.sun.scenario.animation.shared.ClipEnvelope;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapYear {

    public static boolean leapYear1(int year){
        GregorianCalendar gc = new GregorianCalendar();
        return gc.isLeapYear(year);
    }
    public static boolean leapYear2(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR,year);
        int days = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
        return (days>365);
    }
    public static boolean leapYear3(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,1,1);
        int days = calendar.getMaximum(Calendar.DAY_OF_MONTH);
        return (days == 29);
    }


    public static void main(String[] args) {
        System.out.println(leapYear1(2010));
        System.out.println(leapYear2(2010));
        System.out.println(leapYear3(2010));
    }

}
