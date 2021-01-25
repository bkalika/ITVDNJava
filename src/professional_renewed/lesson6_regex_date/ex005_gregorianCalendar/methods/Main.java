package professional_renewed.lesson6_regex_date.ex005_gregorianCalendar.methods;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_YEAR));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));

        System.out.println((char)27 + "[31m" + "================+===");
        gc.set(Calendar.MONTH, Calendar.JANUARY);

        gc.set(Calendar.DAY_OF_MONTH, 13);
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));

        System.out.println((char)27 + "[32m" + "====================");
        GregorianCalendar gc1 = new GregorianCalendar(2018, Calendar.JANUARY, 0);
        System.out.println(gc1.get(Calendar.DAY_OF_WEEK));

        System.out.println((char)27 + "[33m" + "====================");

        GregorianCalendar gc2 = new GregorianCalendar(2018, Calendar.DECEMBER, 11);
        System.out.println(gc2.get(Calendar.DAY_OF_YEAR));
        System.out.println(gc2.get(Calendar.MONTH));
        System.out.println(gc2.get(Calendar.YEAR));

        System.out.println((char) 27 + "[34m" + "===================");

        Date d1 = gc2.getTime();
        System.out.println(d1);

        gc.setTime(d1);
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.YEAR));
    }
}
