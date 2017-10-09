package anagrams;


import org.junit.Test;
import java.util.HashSet;
import static org.junit.Assert.assertEquals;

/**
 * Anagrams
 Write a program to generate all potential
 anagrams of an input string.

 For example, the potential anagrams of "biro" are

 biro bior brio broi boir bori
 ibro ibor irbo irob iobr iorb
 rbio rboi ribo riob roib robi
 obir obri oibr oirb orbi orib
 */

public class AnagramTest {

    Anagram anagram = new Anagram();

    @Test
    public void one_char_word(){
        assertEquals(new HashSet<String>(){{
            add("a");
        }}, anagram.printAll("a"));
    }

    @Test
    public void two_char_word(){
        assertEquals(new HashSet<String>() {{
            add("ba");
            add("ab");
        }}, anagram.printAll("ab"));
    }

    @Test
    public void three_char_word(){
        assertEquals(new HashSet<String>(){{
            add("abc");
            add("acb");
            add("bac");
            add("bca");
            add("cba");
            add("cab");
        }}, anagram.printAll("abc"));
    }


    @Test
    public void four_char_word(){
        assertEquals(new HashSet<String>() {{
            add("biro");add("bior");add("brio");add("broi");add("boir");add("bori");
            add("ibro");add("ibor"); add("irbo");add("irob");add("iobr"); add("iorb");
            add("rbio");add("rboi");add("ribo");add("riob");add("roib");add("robi");
            add("obir");add("obri");add("oibr");add("oirb"); add("orbi");add("orib");
        }}, anagram.printAll("biro"));
    }



}
