package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Write a program that prints the numbers from 1 to 100.
 But for multiples of three print "Fizz" instead of the
 number and for the multiples of five print "Buzz". For
 numbers which are multiples of both three and five
 print "FizzBuzz".

 Sample output:

 1
 2
 Fizz
 4
 Buzz
 Fizz
 7
 8
 Fizz
 Buzz
 11
 Fizz
 13
 14
 FizzBuzz
 16
 17
 Fizz
 19
 Buzz
 ... etc up to 100

 */

public class FizzBuzzTest {

    @Test
    public void print_1(){
        assertEquals("1", new FizzBuzz(1).printFizzBuzz());
    }

    @Test
    public void print_2(){
        assertEquals("1\n2", new FizzBuzz(2).printFizzBuzz());
    }

    @Test
    public void print_3(){
        assertEquals("1\n2\nFizz", new FizzBuzz(3).printFizzBuzz());
    }

    @Test
    public void print_5(){
        assertEquals("1\n2\nFizz\n4\nBuzz", new FizzBuzz(5).printFizzBuzz());
    }


    @Test
    public void print_15(){
        assertEquals("1\n"+
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz", new FizzBuzz(15).printFizzBuzz());
    }
}
