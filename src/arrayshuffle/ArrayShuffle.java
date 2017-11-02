package arrayshuffle;

import java.util.ArrayList;
import java.util.List;

public class ArrayShuffle {

    public Integer[] printShuffleArrays(int min, int max) {
        List<Integer> list = new ArrayList<>();
        list.add(min);
        return list.toArray(new Integer[list.size()]);
    }
}
