package fizzbuzz;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class FizzBuzzPrint {

    private static final boolean defualt = true;

    private static final String FIZZ_BUZZ = "FizzBuzz";

    private static final String FIZZ = "Fizz";

    private static final String BUZZ = "Buzz";

    public String print(int count) {
        StringBuilder sb = new StringBuilder();
        IntStream.range(0,count).forEach(i-> appendStr(sb, i+1));
        return sb.toString().substring(0,sb.length()-1);
    }

    private void appendStr(StringBuilder sb, int num) {
        sb.append(getCurrentStr(num));
        sb.append("\n");
    }

    private String getCurrentStr(int num) {
        return new ArrayList<FizzBuzzCondition>(){{
            add(new FizzBuzzCondition(((num)%5==0 && (num)%3==0), FIZZ_BUZZ));
            add(new FizzBuzzCondition(((num)%3==0), FIZZ));
            add(new FizzBuzzCondition(((num)%5==0), BUZZ));
            add(new FizzBuzzCondition(defualt,String.valueOf(num)));
        }}.stream().filter(FizzBuzzCondition::isCondi).findFirst().get().getResult();
    }


}
