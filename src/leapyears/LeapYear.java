package leapyears;

import java.util.ArrayList;
import java.util.List;

public class LeapYear {

    public String checkLeapYear(int year) {
        return new ArrayList<CheckCondition>(){{
            add(new CheckCondition((year%100==0 && year%400 == 0),"是闰年，它是400年一润"));
            add(new CheckCondition((year%100==0 && year%400 != 0),"不是闰年，它不是400年一润"));
            add(new CheckCondition((year%4==0),"是闰年，它是4年一润"));
            add(new CheckCondition((year%4!=0),"不是闰年，它不是4年一润"));
        }}.stream().filter(CheckCondition::isMatch).findFirst().get().getResult();
    }

    public boolean checkLeapYear2(int year) {
        if ((year%100==0 && year%400 == 0) || (year%100!=0 && year%4 == 0) )
            return true;
        return false;
    }
}
