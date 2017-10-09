package anagrams;

import java.util.HashSet;
import java.util.Set;

public class Anagram {

    private static final int INDEX = 0;

    private char[] chars;

    private Set<String> stringSet;


    public Set printAll(String inputStr) {
        stringSet = new HashSet<>();
        chars = inputStr.toCharArray();
        iterateCharsAdd(chars, INDEX);
        return stringSet;
    }

    private void iterateCharsAdd(char[] chars,int index) {
        if(index == chars.length-1)
            stringSet.add(String.valueOf(chars));
        else
        {
            for(int i=index;i<chars.length;i++)
            {
                swap(chars,i,index);
                iterateCharsAdd(chars,index+1);
                swap(chars,i,index);
            }
        }
    }

    private void swap(char[] chs, int x, int y) {
        char tmp = chs[x];
        chs[x] = chs[y];
        chs[y] = tmp;
    }

}
