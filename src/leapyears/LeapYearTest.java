package leapyears;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


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