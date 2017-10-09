package leapyears;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * Write a function that returns true or false depending on
 whether its input integer is a leap year or not.

 A leap year is defined as one that is divisible by 4,
 but is not otherwise divisible by 100 unless it is
 also divisible by 400.

 For example, 2001 is a typical common year and 1996
 is a typical leap year, whereas 1900 is an atypical
 common year and 2000 is an atypical leap year.

 */

public class LeapYearTest {

    LeapYear leapYear = new LeapYear();

    @Test
    public void check_1999(){
        assertEquals("不是闰年，它不是4年一润",leapYear.checkLeapYear(1999));
    }

    @Test
    public void check_1996(){
        assertEquals("是闰年，它是4年一润",leapYear.checkLeapYear(1996));
    }

    @Test
    public void check_1900(){
        assertEquals("不是闰年，它不是400年一润",leapYear.checkLeapYear(1900));
    }

    @Test
    public void check_2000(){
        assertEquals("是闰年，它是400年一润",leapYear.checkLeapYear(2000));
    }

    @Test
    public void check2_1999(){
        assertEquals(false,leapYear.checkLeapYear2(1999));
    }

    @Test
    public void check2_1996(){
        assertEquals(true,leapYear.checkLeapYear2(1996));
    }

    @Test
    public void check2_1900(){
        assertEquals(false,leapYear.checkLeapYear2(1900));
    }

    @Test
    public void check2_2000(){
        assertEquals(true,leapYear.checkLeapYear2(2000));
    }


}